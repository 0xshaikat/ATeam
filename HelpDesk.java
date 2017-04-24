//ATeam(Federico Tondolo, Mohamed Tamara, Shaikat Islam)
//APCS2 pd05
//LAB #03: RUVIP?
//2017-04-23

import cs1.Keyboard;

public class HelpDesk{

  private static ArrayPriorityQueue<Ticket> customers;
  private static int ticketprocessed;

  public HelpDesk(){
    customers = new ArrayPriorityQueue<Ticket>();
    ticketprocessed = 0;
  }

  //create a ticket
  public static void create(){
    //initialize ticket;
    Ticket tick = new Ticket();
    //initialize identifier token
    tick.setID(ticketprocessed);
    //ensure next ticket has a higher number
    ticketprocessed ++;
    //name of the dude/dudette
    System.out.println("What is your name, sir?");
    String name = Keyboard.readString();
    tick.setName(name);
    //what is the problem?
    System.out.println("What is the nature of your problem?");
    String problem = Keyboard.readString();
    tick.setProb(problem);
    // VIP Level
    System.out.println("On a scale from 0 to 5, where 0 means I must do your bidding or else I lose my job, and 5 means you're an intern who I could care less about, please determine your importance at FMS Corp.");
    int viplvl = Keyboard.readInt();
    tick.setVIP(viplvl);
    System.out.println("Thank you for using FMS Corp. Your services are appreciated.");
    System.out.println("Here is your ticket, for your own purposes: " + tick);
    customers.add(tick);
    System.out.println("If you have more tickets, entere 'true' in the next dialogue.");
    Boolean bool = Keyboard.readBoolean();
    if(bool){
      create();
    }
  }

 //fix their problems in order of priority (vip level)
  public static void solve(){
    while(!(customers.isEmpty())){    Ticket solved = customers.removeMin();
        solved.setSolved(true);
        solved.setSolution("Turned it off and on again.");
        System.out.println("This ticket was solved: " + solved);
      }
  }

  public static void main (String[] args){
    HelpDesk help = new HelpDesk();
    //there is a problem where once you add a bunch of tickets, all that registers within APQ customers is the latest ticket being added.
    //would be nice if there was a fix.
    create();
    solve();
    System.out.println("APQ of customers: " + customers);

  }//end main

}//end class

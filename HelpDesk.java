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


  public static void create(){
    //initialize ticket;
    Ticket tick = new Ticket();
    //initialize identifier token
    Ticket.setID(ticketprocessed);
    //ensure next ticket has a higher number
    ticketprocessed ++;
    //name of the dude/dudette
    System.out.println("What is your name, sir?");
    String name = Keyboard.readString();
    Ticket.setName(name);
    //what is the problem?
    System.out.println("For the clarity of our services, we offer help for three problems, namely those dealing with money, time, and space. What is the nature of your problem?");
    String problem = Keyboard.readString();
    // VIP Level
    System.out.println("On a scale from 0 to 5, where 0 means I must do your bidding or else I lose my job, and 5 means you're an intern who I could care less about, please determine your importance at FMS Corp.");
    int viplvl = Keyboard.readInt();
    System.out.println("Thank you for using FMS Corp. Your services are appreciated.");
    customers.add(tick);
  }

  public static void main (String[] args){
    HelpDesk help = new HelpDesk();
    create();
    System.out.println(customers);
  }//end main

}//end class

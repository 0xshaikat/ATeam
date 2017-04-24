//ATeam(Federico Tondolo, Mohamed Tamara, Shaikat Islam)
//APCS2 pd05
//LAB #03: RUVIP?
//2017-04-23

import java.util.*;

public class ArrayPriorityQueue<Ticket> implements PriorityQueue<Ticket>{

  //instance variables
  ArrayList<Ticket> queue;
  int size;

  //constructor
  public ArrayPriorityQueue(){
    queue = new ArrayList<Ticket>();
    size = 0;
  }

  // postcondition: x has been added to the priority queue;
  //                 number of elements in the priority queue is increased by 1
  public void add(Ticket x){
    queue.add(x);
    size ++;
  }

  // postcondition: returns true if the number of elements in
  //                 the priority queue is 0; otherwise, returns false
  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    else{
      return false;
    }
  }


  //helper function for removeMin and peekMin based on reigning champ algorithm
  //postcondition: returns the index of the smallest element in the ArrayList
  public int finder(){
    if (size > 0){
      int index = 0;
      for (int i = 0; i < size; i++){
        Comparable minimum = (Comparable)queue.get(index);
        Comparable indexitem = (Comparable)queue.get(i);
        if(indexitem.compareTo(minimum) < 0){
          index = i;
        }
      }
      return index;
    }
    else{
      throw new IndexOutOfBoundsException("Queue empty, dude.");
    }
  }

  // postcondition: The smallest item in the priority queue is removed
  //                 and returned; the number of elements in the priority queue
  //                 is decreased by 1
  //                 throws an unchecked exception if the priority queue is empty
  public Ticket removeMin(){
    int index = finder();
    Ticket minimum = queue.get(index);
    queue.remove(index);
    size--;
    return minimum;
  }

  // postcondition: The smallest item in the priority queue is returned; the
  //                 priority queue is unchanged
  //                 throws an unchecked exception if the priority queue is empty
  public Ticket peekMin(){
    int index = finder();
    Ticket minimum = queue.get(index);
    return minimum;
  }

  //postcondition: returns string format of queue
  public String toString(){
    String s = "{";
    for(int i = 0; i<size; i++){
      s += queue.get(i) + ", ";
    }
    if (size > 0){
      s = s.substring( 0, s.length() - 2 ) + " }";
    }
    else{
      s += "}";
    }
    return s;
  }

  public static void main(String[] args){
    ArrayPriorityQueue<Integer> britain = new ArrayPriorityQueue<Integer>();

    System.out.println("\n\nAdding elements to britain...");
    System.out.println("britain before adding: " + britain);
    britain.add(5);
    britain.add(4);
    britain.add(3);
    britain.add(2);
    britain.add(102392);
    System.out.println("britain after adding: " + britain);

    while(!britain.isEmpty()){
      System.out.println("\nMin value: "+ britain.peekMin());
      System.out.println(britain.removeMin());
      System.out.println("britain after removing: " + britain);
    }
  }//end main

}//end class

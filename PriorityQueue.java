public interface PriorityQueue<T>{

    //Adds an item to this priority queue.     
    void add(T x);
    
    //Returns true if this stack is empty, otherwise returns false. 
    boolean isEmpty();

    //Removes andd returns the smallest item stored in this priority queue.
    // Throws java.lang.RuntimeException - if the priority queue is empty (unchecked) 
    T removeMin();

    //Returns the smallest item stored in this priority queue without removing. 
    //Throws java.lang.RuntimeException - if the priority queue is empty (unchecked)
    T peekMin();

}

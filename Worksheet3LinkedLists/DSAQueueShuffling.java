
/*********************************************************
 * Author: Vishmi Kalansooriya                               
 * Date:  24th August 2021                                    
 * Purpose: Implementing the shuffeling Queue  class.                   
 *********************************************************************************************************/
import java.util.*;

class DSAQueueShuffling extends DSAQueue {

    DSALinkedList Shufflingqueue;

    // The default cunstructor.
    public DSAQueueShuffling() {
        Shufflingqueue = new DSALinkedList();

    }

    /*********************************************************************
     * Name- isEmpty import - NOne Export - (count == 0) purpose - to see whether
     * the Queue is empty.
     *********************************************************************/
    public boolean isEmpty() {
        return Shufflingqueue.isEmpty();

    }

    /*********************************************************************
     * Name- enQueue import - pass (Object) Export - None purpose - to insert data
     * into the Queue
     *********************************************************************/
    public void enQueue(Object pass) throws Exception {
        Shufflingqueue.insertLast(pass);

    }

    /*********************************************************************
     * Name- deQueue import - pass (Object) Export - topValue purpose - to remove
     * data from the Queue
     *********************************************************************/
    public Object deQueue() throws Exception {

        return Shufflingqueue.removeFirst();
    }

    /*********************************************************************
     * Name- peek Date 24/08/2021 import - pass (Object) Export - topValue purpose -
     * tohave a look at the data in the Queue.
     *********************************************************************/
    public Object peek() throws Exception {

        return Shufflingqueue.peekFirst();

    }

    public Iterator iterator() {
        return Shufflingqueue.iterator();
    }

}

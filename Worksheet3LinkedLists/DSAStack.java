
/*********************************************************
 * Author: Vishmi Kalansooriya                               
 * Date:  24th August 2021                                    
 * Purpose: Implementing the stack class.                   
 *********************************************************************************************************/
import java.util.*;

class DSAStack implements Iterable {

    private DSALinkedList stack;

    // parameter cunstructor
    public DSAStack() {
        stack = new DSALinkedList();

    }

    /*********************************************************************
     * Name- isEmpty import - NONE Export - None purpose - to insert data into the
     * stack
     *********************************************************************/
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /*********************************************************************
     * Name- push import - pass (Object) Export - None purpose - to insert data into
     * the stack
     *********************************************************************/
    public void push(Object pass) throws Exception {
        stack.insertFirst(pass);
    }

    /*********************************************************************
     * Name- push Date 24/08/2021 import - NONE Export -object purpose - to remove
     * data at the begining from the stack
     *********************************************************************/
    public Object pop() throws Exception {
        return stack.removeFirst();
    }

    /*********************************************************************
     * Name- peek Date 24/08/2021 import - pass (Object) Export - None purpose - to
     * have a look at the data in the stack.
     *********************************************************************/
    public Object peek() throws Exception {
        return stack.peekFirst();

    }

    public Iterator iterator() {
        return stack.iterator();
    }

}
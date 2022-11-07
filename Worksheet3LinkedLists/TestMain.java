
/*********************************************************
 * Author: Vishmi Kalansooriya                               
 * Date:  1st September 2021                                    
 * Purpose: Testing the linkedList , stack and Queue.             
 *********************************************************************************************************/
import java.util.*;

class TestMain {
    public static void main(String args[]) throws Exception {
        // testDoubleLinkedList();
        // testStack();
        // testShufflingQueue();
        menu();

    }

    /*********************************************************
     * Name : testDoubleLinkedLIsts Date: 1/09/2021 Purpose: testing the doubly
     * linked list.
     *********************************************************************************************************/
    public static void testDoubleLinkedList() throws Exception {
        System.out.println(" Testing the insert first");
        DSALinkedList one = new DSALinkedList();
        System.out.println("Inserted the letter (T) first");
        one.insertFirst("T");
        System.out.println("Inserted the letter (I) second ");
        one.insertFirst("I");
        System.out.println("Inserted the letter (I) third ");
        one.insertFirst("I");
        System.out.println("Inserted the letter (L) fourth");
        one.insertFirst("L");
        System.out.println("Inserted the letter (S) fifth");
        one.insertFirst("S");
        // To see whether the last inserted one is at the first to check whether the
        // insert first is working.
        System.out.println("The first object in the linked list now is " + one.peekFirst());

        // Iterarte according to the ascending order to see whether the insert first is
        // working.
        System.out.println("Testing the iterator now");
        Iterator it = one.iterator();
        System.out.println("All the elements in the LinkedList in the order :");
        while ((it.hasNext())) {

            System.out.println(it.next());

        }
        // Remove the data starting from the front. Still checking whether we inserted
        // data to the front.
        System.out.println("Testing the remove First");

        while (!one.isEmpty()) {
            System.out.println(one.removeFirst());
        }

        DSALinkedList two = new DSALinkedList();

        // Testing the insert Last
        System.out.println("Testing the insertLast");
        System.out.println("Inserted the letter (T) first");
        two.insertLast("T");
        System.out.println("Inserted the letter (I) second ");
        two.insertLast("I");
        System.out.println("Inserted the letter (I) third ");
        two.insertLast("I");
        System.out.println("Inserted the letter (L) fourth");
        two.insertLast("L");
        System.out.println("Inserted the letter (S) fifth");
        two.insertLast("S");

        // To see whether the last data we entered is at the tail.
        System.out.println("The object at the end of the linked list now is " + two.peekLast());

        // Printing all the numbers in the correct order to see whether we inserted the
        // numbers to the last position in order.
        System.out.println("Testing the iterator now");
        Iterator sit = two.iterator();
        System.out.println("All the elements in the LinkedList in the order :");
        while ((sit.hasNext())) {

            System.out.println(sit.next());

        }
        // To see whether the remove last method deletes the last data .
        System.out.println("Testing the remove Last");

        while (!two.isEmpty()) {
            System.out.println(two.removeLast());
        }

    }

    /*********************************************************
     * Name : solelyIterarteTest Date: 1/09/2021 Purpose: To test the iterator
     * alone.
     *********************************************************************************************************/

    public static void solelyIterarteTest() {
        DSALinkedList test = new DSALinkedList();
        Object sum = 0;
        System.out.println("Entering 5 numbers and getting the sum of it by iterating ");
        test.insertFirst(1);
        test.insertFirst(2);
        test.insertFirst(3);
        test.insertFirst(4);
        test.insertFirst(5);

        System.out.println("Testing the iterator now");
        Iterator it = test.iterator();
        System.out.println("The sum of the elements in the linked list :");
        while ((it.hasNext())) {

        }

    }

    /*********************************************************
     * Name : testStack. Date: 1/09/2021 Purpose: To test the stack.
     *********************************************************************************************************/
    public static void testStack() throws Exception {
        DSAStack s = new DSAStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);

        System.out.println("The last number inserted to the Stack is " + s.peek());
        // lifo -last in first out.
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /*********************************************************
     * Name : estShufflingQueue Date: 1/09/2021 Purpose: To test the
     * testShufflingQueue.
     *********************************************************************************************************/

    public static void testShufflingQueue() throws Exception {
        // Testing the Shuffling Queue
        DSAQueueShuffling Qs = new DSAQueueShuffling();

        Qs.enQueue(1);
        Qs.enQueue(2);
        Qs.enQueue(3);
        Qs.enQueue(4);
        Qs.enQueue(5);
        Qs.enQueue(6);
        Qs.enQueue(7);
        Qs.enQueue(8);
        Qs.enQueue(9);
        Qs.enQueue(10);

        System.out.println("The First number inserted to the Stack is " + Qs.peek());
        // FIFO - first in first out.
        Iterator it = Qs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public static void menu() {

        Scanner sc = new Scanner(System.in);
        int userChoice = 0;
        System.out.println("Please select an option from below");
        System.out.println(" 1.read a serialized file \n 2. Display the list \n 3.write a serialized file");
        userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                DSALinkedList rdw = new DSALinkedList();
                for (int i = 0; i < 10; i++) {
                    rdw.insertFirst(i);
                }
                DSALinkedList.save(rdw, "FileOutput.xml");
                break;

            case 2:
                DSALinkedList two = new DSALinkedList();
                for (int i = 1; i <= 10; i++) {
                    two.insertFirst(i);
                }
                Iterator it = two.iterator();

                while (it.hasNext()) {
                    System.out.println(it.next());
                }
                break;

            case 3:
                DSALinkedList write = new DSALinkedList();
                for (int i = 0; i < 10; i++) {
                    write.insertFirst(10);
                }

                DSALinkedList.save(write, "Test.xml");
                DSALinkedList.load("Test.xml");

                break;

        }

    }

    // public static void writeFile() {
    //     DSALinkedList write = new DSALinkedList();
    //     write.insertFirst(10);
    //     DSALinkedList.save(write, "Test.xml");
    //     DSALinkedList.load("Test.xml");
    // }

}
package mx.edu.j2se.LilianaMartinezPelaez.tasks;

//import java.io.*;

public class LinkedTaskList {
    Node head; // head of list

    // Creating the class for the node
    static class Node {
        Task data;
        Node next;

        // Constructor
        Node(Task task) {
            data = task;
            next = null;
        }
    }

    // Method that adds the specified task to the list through the creation of a new node
    public void add(Task task) {

        // Creating a new node with given task
        Node newNode = new Node(task);
        newNode.next = null;

        // If the Linked List is empty, then make the new node as head
        if (head == null) { // Creating the new node
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Method that prints the list
    public static void printLinkedList(LinkedTaskList list) {
        Node currentNode = list.head;

        // Traverse through the list (like a for)
        while (currentNode != null) {
            // Print the data at current node
            System.out.println("Activity: " + currentNode.data.getTitle() + " Start-time: " + currentNode.data.getTime());
            // Go to next node
            currentNode = currentNode.next;
        }
    }

    // Method that removes a task from the list and returns true, if it was in the list.
    // If the list contains the same task several times, any of them should be removed.
    public void remove(Task task) {
        Node temporary = head;
        Node previous = null;

        // If task it's held in head or multiple times of task
        while (temporary != null && temporary.data == task) {
            head = temporary.next;
            temporary = head;
        }

        // Delete ocurrences other than head
        while (temporary != null) {
            while (temporary != null && temporary.data != task) {
                previous = temporary;
                temporary = temporary. next;
            }

            // If task isn't present in linked list
            if (temporary == null)
                return;

            // Unlink the node from linked list
            previous.next = temporary.next;

            // Update temp for next iteration
            temporary = previous.next;
        }
    }

    // Method that returns the number of tasks in the list
    public int getSize() {
        int count = 0;
        Node temporary = head;

        while (temporary != null) {
            count++;
            temporary = temporary.next;
        }
        return count;
    }

    // Method that returns a task which takes the specified place in the list
    public Object getTask(int index) throws IndexOutOfBoundsException {
        Node current = head;
        Object task = new Object();

        // Throws an exception if index < 0
        try {
            if (index <=-1)
                throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("Index cannot be less than zero. Please, try again. Error: " + e1);
            return "";
        }

        // If index is in head
        if(index == 0) {
            //head = current.next;
            task = current.data.getTitle() + " " + current.data.getTime();
        } else { // Traverse the linked list in order to find the requested index
            for (int i = 1; current != null && i <= index; i++) {
                current = current.next;
                if (i == index && current != null) {
                    task = current.data.getTitle() + " " + current.data.getStartTime();
                } else {
                    try { // If index is greater than the length of linked list
                        if (i > index || current == null)
                            throw new IndexOutOfBoundsException();
                    } catch (IndexOutOfBoundsException e2) {
                        System.out.println("Invalid cannot be greater than the size of list. Error: " + e2);
                        return "";
                    }
                }
            }
        }
        return task;
    }

    // Method that returns a subset of tasks that are scheduled for execution at least once after the "from" time,
    // and not later than the "to" time.
    /* I'm still working on this method
     * */
        public static LinkedTaskList incoming(LinkedTaskList list, int from, int to) {

        return list;
    }




}


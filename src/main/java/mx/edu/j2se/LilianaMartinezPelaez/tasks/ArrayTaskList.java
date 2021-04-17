package mx.edu.j2se.LilianaMartinezPelaez.tasks;
/*
@author LiliMP
Netcracker Training Program
Practical work no.2: Arrays and Links
Practical work no.3: Exceptions
*/

import java.util.Arrays;

public class ArrayTaskList {

    public Task[] ArrayTaskList;
    public int length;
    public int size;
    public boolean remove;
    public int from;
    public int to;

    // Constructor
    public ArrayTaskList() {
        ArrayTaskList = new Task[3];
        length = 3;
    }

    // Method with the new length
    public ArrayTaskList(int length) {
        this.length = length;
        ArrayTaskList = new Task[length];
    }

    // Method that returns the number of tasks in the list
    public int getSize() {
        return size;
    }

    // Method that give the reference in heap
    public Task[] getList()
    {
        return ArrayTaskList;
    }

    // Method that returns a task which takes the specified place in the list
    public Task getTask(int index) throws ArrayIndexOutOfBoundsException {
        if(index < size && index >= 0) {
            return ArrayTaskList[index];
        } else {
             throw new ArrayIndexOutOfBoundsException("Invalid index. Please, try again.");

        }
    }

    // Method that adds the specified task to the list
    public void add(Task task) {
        ++size;
        if (size > length) {
            length += 5; // Giving the array an inicial size
            ArrayTaskList = Arrays.copyOf(ArrayTaskList, length);
        }
        ArrayTaskList[size - 1] = task;
    }

    // Method that removes a task from the list and returns true, if it was in the list.
    // If the list contains the same task several times, any of them should be removed.
    public boolean remove(Task task) {
        boolean remove = false;
        Integer removeTasks = 0;
        for(int i = 0; i < size; i++) {
            //Task taskInArray = ArrayTaskList[i];
            if (ArrayTaskList[i].getTitle().equals(task.getTitle())) { // Parameter "task" must be equal to the task on the list
                ArrayTaskList[i] = null; // Making null the task to be deleted
                removeTasks++; // Counting for deleted tasks
                remove = true;
            }
        }

        Task[] newArrayList = new Task[size - removeTasks]; // New size considering the deleted tasks (removeTasks)
        Integer indexnewArrayList = 0;
        for (Task oldTasks : ArrayTaskList) {
            if (oldTasks != null) { // Adding the activities that are not null (meaning that these still on the list)
                    newArrayList[indexnewArrayList] = oldTasks;
                    indexnewArrayList++; // Final new size for the array
            }
        }
        this.size = indexnewArrayList; // Resseting value
        this.ArrayTaskList = Arrays.copyOf(newArrayList, indexnewArrayList); //Resseting data
        return remove; //Returning boolean value
    }

    // Method that returns a subset of tasks that are scheduled for execution at least once after the "from" time,
    // and not later than the "to" time.
    public Task[] incoming(int from, int to) {

        Task[] subArrayTaskList = new Task[size];
        Integer count = 0;
        for (int i = 0; i < size; i++) {
            if (from <= ArrayTaskList[i].getStartTime() && ArrayTaskList[i].getEndTime() <= to ||
                    ArrayTaskList[i].getRepeatInterval() !=0) { // We need to consider if the tasks is repetitive
                if (ArrayTaskList[i] != null) {
                        System.out.println(ArrayTaskList[i].getTitle());
                        subArrayTaskList[count] = ArrayTaskList[i];
                        count++;
                }
            }
        }
        return subArrayTaskList;
    }

    /*I´m trying to make my own exception if the task is not from the specific list.
    I'm still working in this.
    */

    public class TasksIsNotOnList extends Exception {
        public TasksIsNotOnList(Task task) throws Exception {
            super();
            for(int i = 0; i < size; i++) {
                if(task.getTitle() != ArrayTaskList[i].getTitle());
                throw new Exception("ERROR");

            }
        }
        @Override
        public String getMessage() {
            String message = "This task is not on this list.";
            return message;
        }

    }

}




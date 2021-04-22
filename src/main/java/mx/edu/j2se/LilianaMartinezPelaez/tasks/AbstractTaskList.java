package mx.edu.j2se.LilianaMartinezPelaez.tasks;

/*
@author LiliMP
Netcracker Training Program
Practical work no.4: Inheritance Mechanism
Task 1: Inheritance
Task 2: Abstract Factory
*/

abstract class AbstractTaskList {

    // Method that adds a Task either to an array or linkedlist
    abstract void add(Task task);

    // Method that removes a Task either to an array or linkedlist
    // If the list/array contains the same task several times, any of them should be removed.
    // If the task was on the list, method returns true
    abstract boolean remove(Task task);

    // Method that returns the size either of an array or linkedlist
    abstract int getSize();

    // Method that returns the task either of an array or linkedlist
    // The specific required task is known by the index parameter
    abstract int getTask();

    // Method that returns a subset of tasks that are scheduled for execution at least once after the "from" time,
    // and not later than the "to" time.
    // This subset is stored either on an array or linkedlist.
    abstract AbstractTaskList incoming(int from, int to);

}

class ListTypes {

    public enum types{ARRAY, LINKED};

}

class TaskListFactory {

    // This method, according to the type parameter, returnS the object of
    // ArrayTaskList or LinkedTaskList class.
    static Object createTaskList(ListTypes.types type) {

        if (type == ListTypes.types.LINKED)
            return new LinkedTaskList();
        else if (type == ListTypes.types.ARRAY)
            return new ArrayTaskList();

        return null;  // If neither of the two conditions is met, then method returns null
    }
}
package mx.edu.j2se.LilianaMartinezPelaez.tasks;
/*
@author LiliMP
Netcracker Training Program
Practical work no.2: Arrays and Links
*/

import java.util.Arrays;

public class ArrayTaskList {

    public Task[] ArrayTaskList;
    public int length;
    public int size;

    // Method with an specific array length
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

    //Para obtener la referencia donde está el arreglo por completo
    public Task[] getList()
    {
        return ArrayTaskList;
    }

    // Method that returns a task which takes the specified place in the list
    public Task getTask(int index) {
        return ArrayTaskList[index];
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

    /*I'm still working in this method.
    */
    public void remove(Task task) {
        int count = ArrayTaskList.length;
        for (int i = 0; i < count; i++) {
            if (ArrayTaskList[i].getTitle().equals(getTask(i).getTitle())) {
                ArrayTaskList[i] = ArrayTaskList[count - 1];
                count--;
                break;
            } else {
                System.out.println("No está en la lista.");
                //return false;
            }
        }

    }
}




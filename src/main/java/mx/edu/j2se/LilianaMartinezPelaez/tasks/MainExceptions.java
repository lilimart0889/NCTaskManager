package mx.edu.j2se.LilianaMartinezPelaez.tasks;

/*
@author LiliMP
Netcracker Training Program
Practical work no.3: Exceptions
*/

public class MainExceptions {

    public static void main(String[] args) {

        // Creating a repetitive task object with negative start time.
        // This will throw the exception
        Task Dancing = new Task("Dancing", -6, 1, 2);

        System.out.println(" ");

        // Creating a repetitive task object with negative end time.
        // This will throw 2 exception: a) Time can't be negative (either start time or end time) &
        // b) End time can't be smaller than star time.
        Task Painting = new Task("Painting", 2, -9, 2);

        System.out.println(" ");

        // Creating a repetitive task object with negative interval.
        Task Swimming = new Task("Swimming",1,9,-3);

        System.out.println(" ");

        // Creating a repetitive task object with zero interval.
        Task Writing = new Task("Writing",1,9,0);

        // Creating tasks and store them on a list
        ArrayTaskList aprilTasks = new ArrayTaskList();
        aprilTasks.add(new Task("Visa Procedures",10));
        aprilTasks.add(new Task("Dinner with Oswa",20));
        aprilTasks.add(new Task("Cooking",8,20,4));
        System.out.println(" ");

        // Calling a task by getTask method generating an ArrayIndexOutOfBoundsException error
        System.out.println("Activity: " +aprilTasks.getTask(0).getTitle());
        System.out.println("\n\nActivity: " +aprilTasks.getTask(3).getTitle());
        System.out.println("\n\nActivity: " +aprilTasks.getTask(-1).getTitle());


    }
}

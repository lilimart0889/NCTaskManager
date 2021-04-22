package mx.edu.j2se.LilianaMartinezPelaez.tasks;

public class MainLinkedTaskList {

    public static void main(String[] args) {

        // Creating several tasks with different attributes
        Task MasterDegree = new Task("Master Degree", 20);
        Task Hiking = new Task("Hiking", 8);
        Task Cooking = new Task("Cooking", 9, 21, 3);
        Task GettingAJob = new Task("Getting a job", 17);
        Task Shower = new Task("Shower", 10, 20, 3);
        Task Sleeping = new Task("Sleeping", 5, 20, 5);
        Task Running = new Task("Running", 10);
        Task Awakening = new Task("Awakening", 6);
        Task Gym = new Task("Gym", 7);
        Task Brunch = new Task("Brunch", 12);
        Task Painting = new Task("Painting", 15);
        Task Yoga = new Task("Yoga", 7);

        // Making the empty list
        LinkedTaskList newYearsResolutions = new LinkedTaskList();

        // Adding tasks to the list
        newYearsResolutions.add(MasterDegree);
        newYearsResolutions.add(Hiking);
        newYearsResolutions.add(Cooking);
        newYearsResolutions.add(MasterDegree);
        newYearsResolutions.add(Painting);
        newYearsResolutions.add(Hiking);
        newYearsResolutions.add(Painting);

        // Printing linked list task "New Year's Resolutions List"
        System.out.println("New Year's Resolutions List:");
        newYearsResolutions.printLinkedList(newYearsResolutions);

        // Getting the length of New Year's Resolutions linked list
        System.out.println("Total activities: " + newYearsResolutions.getSize());

        // Removing a task stored in New Year's Resolutions linked list
        newYearsResolutions.remove(MasterDegree);
        System.out.println("\nList after removing Master Degree: ");
        newYearsResolutions.printLinkedList(newYearsResolutions);
        System.out.println("Size after removing Master Degree: " + newYearsResolutions.getSize());
        newYearsResolutions.remove(Gym); // This activity is not from this list, so nothing happens.


        // Making the empty list
        LinkedTaskList januaryList = new LinkedTaskList();

        // Adding tasks to the list
        januaryList.add(GettingAJob);
        januaryList.add(Yoga);
        januaryList.add(Brunch);
        januaryList.add(Gym);

        // Printing linked list task "January List"
        System.out.println("\nJanuary List:");
        januaryList.printLinkedList(januaryList);

        // Getting the length of January linked list
        System.out.println("Total activities: " + januaryList.getSize());

        // Using getTask method in January linked list
        System.out.println("\nActivity in position 1 is: " + januaryList.getTask(0));
        System.out.println("Activity in position 4 is: " + januaryList.getTask(3));
        // These will bring an error
        System.out.print("Activity in position 10 is: ");
        System.out.print(januaryList.getTask(10));
        System.out.print("Activity in position -3 is: ");
        System.out.println(januaryList.getTask(-3));

    }
}

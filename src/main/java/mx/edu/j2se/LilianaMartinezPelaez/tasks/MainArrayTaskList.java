package mx.edu.j2se.LilianaMartinezPelaez.tasks;

/*
@author LiliMP
Netcracker Training Program
Practical work no.2: Arrays and Links
*/

public class MainArrayTaskList {

	public static void main(String[] args) {

		// Creating several tasks with differents attributes
		Task Water_plants = new Task("Water plants", 0);
		Task Hiking = new Task("Hiking", 0, 12, 2);
		Task Grocery_Shop = new Task("Grocery shop",12);
		Task Cooking = new Task("Cooking", 2, 9, 3);
		Task NC_Reading = new Task("NC Reading", 5);
		Task Shower = new Task("Shower", 0);
		Task Sleeping = new Task("Sleeping", 1, 15, 3);
		Task Running = new Task("Running", 10);
		Task Awakening = new Task("Awakening", 7);

		// Creating an array that stores tasks from Monday
		ArrayTaskList mondayTasks = new ArrayTaskList();

		// Adding some tasks to the array with method add from ArrayTaskList class
		mondayTasks.add(Sleeping);
		mondayTasks.add(Running);
		mondayTasks.add(Shower);
		mondayTasks.add(Cooking);
		mondayTasks.add(NC_Reading);
		mondayTasks.add(Cooking);

		// Creating a new array that stores tasks to the weekend
		ArrayTaskList weekendTasks = new ArrayTaskList();

		// Adding some tasks to the array with method add from ArrayTaskList class
		weekendTasks.add(Awakening);
		weekendTasks.add(Shower);
		weekendTasks.add(Grocery_Shop);
		weekendTasks.add(Cooking);
		weekendTasks.add(Water_plants);

		// Printing the array size and the tasks stored in it
		System.out.println("MONDAY TASKS");
		System.out.println("Total activities: " + mondayTasks.getSize()); // Returning the number of tasks
		System.out.println("Your activities for Monday are: ");
		for(int i = 0; i != mondayTasks.getSize(); ++i) { // Returning the task list
			System.out.print("Activity: " + mondayTasks.getTask(i).getTitle() + "  ");
			System.out.println(mondayTasks.getTask(i).isActive());
		}

		// Printing the array size and the tasks stored in it
		System.out.println("\n\nWEEKEND TASKS");
		System.out.println("Total activities: " + weekendTasks.getSize()); // Returning the number of tasks
		for(int i = 0; i != weekendTasks.getSize(); ++i) { // Returning the task list
			System.out.print("Activity: " + weekendTasks.getTask(i).getTitle() + "  ");
			System.out.println(weekendTasks.getTask(i).getTime());
		}

		// Calling a task in an specific place in the list
		System.out.println("\n\nWeekend activity in position 0 is: " + weekendTasks.getTask(0).getTitle());
		System.out.println("Weekend activity in position 3 is: " + weekendTasks.getTask(3).getTitle());
		System.out.println("Monday activity in position 1 is: " +mondayTasks.getTask(1).getTitle());

		// This will bring an error due to so far we don't have exceptions implemented
		System.out.println("Monday activity in position 6 is: " +mondayTasks.getTask(6).getTitle());
	}
}

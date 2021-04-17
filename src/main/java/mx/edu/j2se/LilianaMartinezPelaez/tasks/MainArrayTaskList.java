package mx.edu.j2se.LilianaMartinezPelaez.tasks;

/*
@author LiliMP
Netcracker Training Program
Practical work no.2: Arrays and Links
*/

import java.sql.NClob;

public class MainArrayTaskList {

	public static void main(String[] args) {

		// Creating several tasks with differents attributes
		Task Water_plants = new Task("Water plants", 0);
		Task Hiking = new Task("Hiking", 8);
		Task Grocery_Shop = new Task("Grocery shop",12);
		Task Cooking = new Task("Cooking", 9, 21, 3);
		Task NC_Reading = new Task("NC Reading", 17);
		Task Shower = new Task("Shower", 10, 20, 3);
		Task Sleeping = new Task("Sleeping", 5, 20, 5);
		Task Running = new Task("Running", 10);
		Task Awakening = new Task("Awakening", 6);
		Task Gym = new Task("Gym", 7);
		Task Brunch = new Task("Brunch", 12);
		Task Painting = new Task("Painting", 15);
		Task Yoga = new Task("Yoga", 7);

		// Creating an array that stores tasks from Monday
		ArrayTaskList mondayTasks = new ArrayTaskList();

		// Adding some tasks to the array with method add from ArrayTaskList class
		mondayTasks.add(Sleeping);
		mondayTasks.add(Running);
		mondayTasks.add(Shower);
		mondayTasks.add(Cooking);
		mondayTasks.add(NC_Reading);
		mondayTasks.add(Cooking);
		mondayTasks.add(Yoga);

		// Creating a new array that stores tasks to the weekend
		ArrayTaskList weekendTasks = new ArrayTaskList();

		// Adding some tasks to the array with method add from ArrayTaskList class
		weekendTasks.add(Awakening);
		weekendTasks.add(Shower);
		weekendTasks.add(Grocery_Shop);
		weekendTasks.add(Cooking);
		weekendTasks.add(Hiking);
		weekendTasks.add(Water_plants);
		weekendTasks.add(Gym);
		weekendTasks.add(Cooking);
		weekendTasks.add(Brunch);
		weekendTasks.add(Painting);


		// Printing the array size and the tasks stored in it
		System.out.println("MONDAY TASKS");
		System.out.println("Total activities: " + mondayTasks.getSize()); // Returning the number of tasks
		System.out.println("Your activities for Monday are: ");
		for(int i = 0; i != mondayTasks.getSize(); ++i) { // Returning the task list
			System.out.print("Activity: " + mondayTasks.getTask(i).getTitle() + "  ");
			System.out.println("Time: " + mondayTasks.getTask(i).isActive());
		}

		// Printing the array size and the tasks stored in it
		System.out.println("\n\nWEEKEND TASKS");
		System.out.println("Total activities: " + weekendTasks.getSize()); // Returning the number of tasks
		for(int i = 0; i != weekendTasks.getSize(); ++i) { // Returning the task list
			System.out.print("Activity: " + weekendTasks.getTask(i).getTitle() + "  ");
			System.out.println("Time: " + weekendTasks.getTask(i).getTime());
		}

		// Calling a task in an specific place in the list
		System.out.println("\n\nWeekend activity in position 1 is: " + weekendTasks.getTask(0).getTitle());
		System.out.println("Weekend activity in position 4 is: " + weekendTasks.getTask(3).getTitle());
		System.out.println("Monday activity in position 2 is: " +mondayTasks.getTask(1).getTitle());

		// Removing a task from Monday Tasks list and returning the new size
		System.out.println("\n\nSize of 'Monday Tasks list' before removing Cooking activity: " + mondayTasks.getSize());
		System.out.println(mondayTasks.remove(Cooking));
		// Printing the new Monday array and the tasks stored in it
		System.out.println("MONDAY TASKS");
		System.out.println("Total activities: " + mondayTasks.getSize()); // Returning the number of tasks
		for(int i = 0; i != mondayTasks.getSize(); ++i) { // Returning the task list
			System.out.print("Activity: " + mondayTasks.getTask(i).getTitle() + "  ");
			System.out.println("Time: " + mondayTasks.getTask(i).getTime());
		}

		// Removing a task that is not on Monday Tasks list
		System.out.println("\n\nSize of 'Monday Tasks list' before removing Water plants activity: " + mondayTasks.getSize());
		// For an implemention it's necessary to create a catch exception if the tasks isn't in the specific list.
		System.out.println(mondayTasks.remove(Water_plants));
		System.out.println("Size of 'Monday Tasks list' after removing Water plants activity: " + mondayTasks.getSize());

		// Calling a subset of tasks that meet the set time interval
		System.out.println("\n\nMonday task activities between the set time interval: ");
		mondayTasks.incoming(10,20);

//		// This will bring an error due to so far we don't have exceptions implemented
		System.out.println("Monday activity in position 7 is: " +mondayTasks.getTask(7).getTitle());

	}
}


package mx.edu.j2se.LilianaMartinezPelaez.tasks;

/*
@author LiliMP
Netcracker Training Program
Practical work no.1: Project Structure
*/

import mx.edu.j2se.LilianaMartinezPelaez.ejemplos.Tiempo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Creating a task object active and non-repetitive
		Task Running = new Task("Running", 5);
		System.out.println("Activity: " + Running.getTitle());
		System.out.println(Running.getTime());
		System.out.println(Running.isRepeated());
		System.out.println(Running.isActive());
		//Returning the next start time of Running execution after current time:
		System.out.print("The next start time of Running execution is: ");
		System.out.println(Running.nexTimeAfter(5));

		// Creating a task object active and repetitive:
		Task Gym = new Task("Gym",5,200,10);
		System.out.println("\nActivity: " + Gym.getTitle() + " Start: " + Gym.getStartTime()
				          + " End: " + Gym.getEndTime() + " Interval: " + Gym.getRepeatInterval());
		System.out.println(Gym.isActive());
		System.out.println(Gym.isRepeated());
		//Returning the next start time of Gym execution after current time:
		System.out.print("The next start time of Gym execution is: ");
		System.out.println(Gym.nexTimeAfter(75));

		// Creating a task object inactive and non-repetitive
		Task Water_plants = new Task("Water plants", 0);
		System.out.println("\nActivity: " + Water_plants.getTitle());
		System.out.println(Water_plants.getTime());
		System.out.println(Water_plants.isActive());
		System.out.println(Water_plants.isRepeated());

		// Creating a task object inactive and repetitive
		Task Hiking = new Task("Hiking", 0, 12, 2);
		System.out.println("\nActividad: " + Hiking.getTitle() + " Start: " + Hiking.getStartTime()
				+ " End: " + Hiking.getEndTime() + " Interval: " + Hiking.getRepeatInterval());
		System.out.println(Hiking.isActive());
		System.out.println(Hiking.isRepeated());

		// Creating a task object active and non-repetitive
		Task Grocery_shop = new Task("Grocery shop",12);
		System.out.println("\nActivity: " + Grocery_shop.getTitle());
		System.out.println(Grocery_shop.getTime());
		System.out.println(Grocery_shop.isActive());
		System.out.println(Grocery_shop.isRepeated());
		//Changing Grocery shop task from non-repetitive to repetitive
		Grocery_shop.setTime(1,9,3);
		System.out.println("\nUpdated activity: " + Grocery_shop.getTitle() + " Start: " + Grocery_shop.getStartTime()
				          + " End: " + Grocery_shop.getEndTime() + " Interval: " + Grocery_shop.getRepeatInterval());
		System.out.println(Grocery_shop.isActive());
		System.out.println(Grocery_shop.isRepeated());

		// Creating a task object active and repetitive
		Task Cooking = new Task("Cooking", 2, 9, 3);
		System.out.println("\nActivity: " + Cooking.getTitle() + " Start: " + Cooking.getStartTime()
				+ " End: " + Cooking.getEndTime() + " Interval: " + Cooking.getRepeatInterval());
		System.out.println(Cooking.isActive());
		System.out.println(Cooking.isRepeated());
		// Changing Cooking task from repetitive to non-repetitive
		Cooking.setTime(12);
		System.out.println("\nUpdated activity: " + Cooking.getTitle());
		System.out.println(Cooking.getTime());
		System.out.println(Cooking.isActive());
		System.out.println(Cooking.isRepeated());

	}

}

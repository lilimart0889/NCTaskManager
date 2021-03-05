package mx.edu.j2se.LilianaMartinezPelaez.tasks;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {
	public static void main(String[] args)
	{

		//Probando la clase Persona
		//**************************

	    Persona estudianteNC = new Persona();
		//System.out.println("Edad:" + estudianteNC.getEdad());
		estudianteNC.setEdad(14);
		String loDejaron = estudianteNC.loDejanEntrarAlBar();
		System.out.println("Eduardo:" + loDejaron);
		System.out.println("Edad:" + estudianteNC.getEdad());

		Persona estudianteNC2 = new Persona();
		//System.out.println("Edad:" + estudianteNC2.getEdad());
		estudianteNC2.setEdad(74);
		loDejaron = estudianteNC2.loDejanEntrarAlBar();
		System.out.println("Lili:" + loDejaron);
		System.out.println("Edad:" + estudianteNC2.getEdad());

		//Probando introducir desde teclado actividad y tiempo
		//***************************************************

		String actividad = "", time = "";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca nueva actividad:\nActividad: ");
        actividad = entrada.nextLine();

        System.out.println("Fecha en dd/mm/aaaa");
        time = entrada.nextLine();

        //Probando el clase Task
		//***********************

		Task Correr = new Task("Correr", 5);
		System.out.println("\nActividad: " + Correr.getTitle() + " Tiempo: " + Correr.getTime());

		Task Gym = new Task("Gym",1,5,2);
		System.out.println("\nNueva Actividad: " + Gym.getTitle() + " Start: " + Gym.getStartTime()
				            + " End: " + Gym.getEndTime() + " Interval: " + Gym.getRepeatInterval());

		Tiempo temp = new Tiempo();
		System.out.println("La hora se imprimirá de la forma: " + temp.horaMilitar());
		temp.ponerTiempo(59,6);
		System.out.println(temp.horaMilitar());
	}

}

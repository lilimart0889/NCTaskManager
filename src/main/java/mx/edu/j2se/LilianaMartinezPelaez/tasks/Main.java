package mx.edu.j2se.LilianaMartinezPelaez.tasks;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {
	public static void main(String[] args)
	{
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

		String actividad = "", time = "";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca nueva actividad:\nActividad: ");
        actividad = entrada.nextLine();

        System.out.println("Fecha en dd/mm/aaaa");
        time = entrada.nextLine();

		Task Correr = new Task("Correr", 5);
		System.out.println("\nActividad: " + Correr.getTitle() + " Tiempo: " + Correr.getTime());

		Task Gym = new Task("Gym",1,5,2);
		System.out.println("\nNueva Actividad: " + Gym.getTitle() + " Start: " + Gym.getStartTime()
				            + " End: " + Gym.getEndTime() + " Interval: " + Gym.getRepeatInterval());


		Date Fecha = new Date();
		System.out.println("\nLa fecha es: " + Fecha);
		String strDateFormat = "hh:mm:ss a dd-MMM-aaaa";
		SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		System.out.println("\nLa fecha en otro formato es: " + objSDF.format(Fecha));
	}





}

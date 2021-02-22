package mx.edu.j2se.LilianaMartinezPelaez.tasks;

public class Main {
	public static void main(String[] args) {
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


	}





}

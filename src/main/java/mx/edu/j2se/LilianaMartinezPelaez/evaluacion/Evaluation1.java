package mx.edu.j2se.LilianaMartinezPelaez.evaluacion;

public class Evaluation1 {

    public static void main(String args[])
    {

        System.out.println("******************************************************************\n" +
                "Bienvenido al programa que calcula el área de un círculo." +
                "\n******************************************************************");
        Circle circulo1 = new Circle(3.15);
        System.out.println("\nRadio del círculo 1: " + circulo1.getRadius() + "\nArea: " + circulo1.getArea());

        Circle circulo2 = new Circle(3);
        System.out.println("\nRadio del círculo 2: " + circulo2.getRadius() + "\nArea: " + circulo2.getArea());

        Circle circulo3 = new Circle(9);
        System.out.println("\nRadio del círculo 3: " + circulo3.getRadius() + "\nArea: " + circulo3.getArea());

        double arregloCirculos[] = new double[3];
        arregloCirculos[0] = circulo1.getRadius();
        arregloCirculos[1] = circulo2.getRadius();
        arregloCirculos[2] = circulo3.getRadius();

        System.out.println("\nDatos de mis radios.\n");
        for (int i = 0; i < arregloCirculos.length; i++)
        {
            System.out.println("Elemento en el índice " + i + " : " + arregloCirculos[i]);
        }


    }

}

package mx.edu.j2se.LilianaMartinezPelaez.evaluacion;

public class Circle {

    double radio;
    double area;
    final int radio2 = 1;


     Circle(double radio) {
        this.radio = radio;
    }


    public double getRadius() {
         return radio;
    }

    public void setRadius(double radio) {
        this.radio = radio;

    }

    public double getArea() {
        return area = radio * Math.PI;
    }

}

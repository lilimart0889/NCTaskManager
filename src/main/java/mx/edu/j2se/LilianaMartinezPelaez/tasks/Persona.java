package mx.edu.j2se.LilianaMartinezPelaez.tasks;

public class Persona {
    String nombre;
    int edad;
    String sexo;
    Float altura;
    String nacionalidad;

    /**
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /** Constructor nombre para persona
     */

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String loDejanEntrarAlBar(){
        if (this.edad > 18){
            return " Bienvenido al Bar";

        }
        else {
            return " No puedes pasar.";
        }

    }
}

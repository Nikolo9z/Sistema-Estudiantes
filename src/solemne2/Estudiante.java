
package solemne2;

public class Estudiante {
    private String nombre;
    private int rut;
    private float solemne1;
    private float solemne2;
    private float solemne3;
    private float ejercicios;
    private double promedio;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String toString() {
        return "-Nombre: " + nombre + "\n -Rut: " + rut + "\n-Nota Solemne1: " + solemne1 + "\n-Nota Solemne 2: " + solemne2 + "\n -Nota Solemne 3: " + solemne3 + "\n -Nota Ejercicios: " + ejercicios + "\n-Promedio General: " + promedio ;
    }



    public float getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(float ejercicios) {
        this.ejercicios = ejercicios;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public float getSolemne1() {
        return solemne1;
    }

    public void setSolemne1(float solemne1) {
        this.solemne1 = solemne1;
    }

    public float getSolemne2() {
        return solemne2;
    }

    public void setSolemne2(float solemne2) {
        this.solemne2 = solemne2;
    }

    public float getSolemne3() {
        return solemne3;
    }

    public void setSolemne3(float solemne3) {
        this.solemne3 = solemne3;
    }   

    public Estudiante(String nombre, int rut, float solemne1, float solemne2, float solemne3) {
        this.nombre = nombre;
        this.rut = rut;
        this.solemne1 = solemne1;
        this.solemne2 = solemne2;
        this.solemne3 = solemne3;
    }
}

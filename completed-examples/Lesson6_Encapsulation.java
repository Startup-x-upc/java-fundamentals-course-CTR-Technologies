public class Lesson6_Encapsulation {
    public static void main(String[] args) {

        System.out.println("=== Sistema de Registro de Estudiantes ===");

        Estudiante e = new Estudiante("Ana García", 15, 14.5);
        e.mostrar();

        System.out.println("\nActualizando promedio...");
        e.setPromedio(16.0);
        e.mostrar();

        System.out.println("Nombre obtenido con getter: " + e.getNombre());

    }
}

class Estudiante {

    private String nombre;
    private int    edad;
    private double promedio;

    Estudiante(String nombre, int edad, double promedio) {
        this.nombre   = nombre;
        this.edad     = edad;
        this.promedio = promedio;
    }

    public String getNombre()  { return nombre; }
    public int    getEdad()    { return edad; }
    public double getPromedio(){ return promedio; }

    public void setNombre(String nombre)   { this.nombre   = nombre; }
    public void setEdad(int edad)          { this.edad     = edad; }
    public void setPromedio(double promedio){ this.promedio = promedio; }

    public void mostrar() {
        System.out.println("--- Ficha del Estudiante ---");
        System.out.println("Nombre:   " + nombre);
        System.out.println("Edad:     " + edad + " años");
        System.out.println("Promedio: " + promedio);
        if (promedio >= 11) {
            System.out.println("Estado:   APROBADO");
        } else {
            System.out.println("Estado:   DESAPROBADO");
        }
    }
}
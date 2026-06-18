public class Lesson5_Classes {
    public static void main(String[] args) {

        System.out.println("=== Sistema de Registro de Estudiantes ===");

        Estudiante e1 = new Estudiante("Ana García",   15, 14.5);
        Estudiante e2 = new Estudiante("Carlos López", 16,  8.0);

        e1.mostrar();
        System.out.println();
        e2.mostrar();

    }
}

class Estudiante {

    String nombre;
    int    edad;
    double promedio;

    Estudiante(String nombre, int edad, double promedio) {
        this.nombre   = nombre;
        this.edad     = edad;
        this.promedio = promedio;
    }

    void mostrar() {
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
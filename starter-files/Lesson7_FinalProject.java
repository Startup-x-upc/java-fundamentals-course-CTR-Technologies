public class Lesson7_FinalProject {
    public static void main(String[] args) {

        System.out.println("=== Sistema de Registro de Estudiantes ===");

        // TODO: Crea un array de 5 objetos Estudiante.
        // Sintaxis: Estudiante[] registro = new Estudiante[5];


        // TODO: Agrega 5 estudiantes al array con distintos nombres y promedios.
        // Ejemplo: registro[0] = new Estudiante("Ana García", 15, 14.5);


        System.out.println("\n--- Lista completa de estudiantes ---");

        // TODO: Usa un bucle for para llamar a mostrar() de cada estudiante.


        System.out.println("\n--- Resumen del salón ---");

        // TODO: Declara dos contadores: aprobados y desaprobados, ambos en 0.


        // TODO: Usa un bucle for para recorrer el array.
        // Si el promedio del estudiante es >= 11, suma 1 a aprobados.
        // Si no, suma 1 a desaprobados.


        // TODO: Muestra los contadores y el total de estudiantes.

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

    public double getPromedio() { return promedio; }

    public void mostrar() {
        String estado = (promedio >= 11) ? "APROBADO" : "DESAPROBADO";
        System.out.println("Nombre: " + nombre +
                " | Promedio: " + promedio +
                " | " + estado);
    }
}
import java.util.Scanner;

public class Lesson4_Methods {
    public static void main(String[] args) {

        System.out.println("=== Sistema de Registro de Estudiantes ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa la edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingresa el promedio: ");
        double promedio = sc.nextDouble();

        mostrarEstudiante(nombre, edad, promedio);

        sc.close();
    }

    public static void mostrarEstudiante(String nombre, int edad, double promedio) {
        System.out.println("\n--- Ficha del Estudiante ---");
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
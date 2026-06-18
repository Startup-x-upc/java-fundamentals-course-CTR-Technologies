public class Lesson6_Encapsulation {
    public static void main(String[] args) {

        System.out.println("=== Sistema de Registro de Estudiantes ===");

        Estudiante e = new Estudiante("Ana García", 15, 14.5);
        e.mostrar();

        System.out.println("\nActualizando promedio...");

        // TODO: Usa el setter setPromedio() para cambiar el promedio a 16.0.


        // TODO: Llama a mostrar() nuevamente para ver el cambio.


        // TODO: Usa el getter getNombre() para imprimir solo el nombre.
        System.out.println("Nombre obtenido con getter: ");

    }
}

class Estudiante {

    // TODO: Cambia los atributos a privados usando la palabra "private".
    String nombre;
    int    edad;
    double promedio;

    Estudiante(String nombre, int edad, double promedio) {
        this.nombre   = nombre;
        this.edad     = edad;
        this.promedio = promedio;
    }

    // TODO: Crea getters para nombre, edad y promedio.
    // Ejemplo: public String getNombre() { return nombre; }


    // TODO: Crea setters para nombre, edad y promedio.
    // Ejemplo: public void setPromedio(double promedio) { this.promedio = promedio; }


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
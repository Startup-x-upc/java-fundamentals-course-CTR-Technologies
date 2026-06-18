public class Lesson7_FinalProject {
    public static void main(String[] args) {

        System.out.println("=== Sistema de Registro de Estudiantes ===");

        Estudiante[] registro = new Estudiante[5];
        registro[0] = new Estudiante("Ana García",    15, 14.5);
        registro[1] = new Estudiante("Carlos López",  16,  8.0);
        registro[2] = new Estudiante("Lucía Torres",  15, 11.0);
        registro[3] = new Estudiante("Miguel Ramos",  17, 17.5);
        registro[4] = new Estudiante("Sofía Mendoza", 14,  6.0);

        System.out.println("\n--- Lista completa de estudiantes ---");
        for (int i = 0; i < registro.length; i++) {
            registro[i].mostrar();
        }

        System.out.println("\n--- Resumen del salón ---");
        int aprobados    = 0;
        int desaprobados = 0;

        for (int i = 0; i < registro.length; i++) {
            if (registro[i].getPromedio() >= 11) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        System.out.println("Aprobados:    " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
        System.out.println("Total:        " + registro.length);

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
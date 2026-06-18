public class Lesson3_ControlFlow {
    public static void main(String[] args) {

        System.out.println("=== Sistema de Registro de Estudiantes ===");

        String nombre   = "Ana García";
        double promedio = 14.5;

        if (promedio >= 11) {
            System.out.println(nombre + ": APROBADO");
        } else {
            System.out.println(nombre + ": DESAPROBADO");
        }

        System.out.println("\n--- Recorriendo lista de promedios ---");

        double[] promedios = {14.5, 8.0, 11.0, 17.5, 6.0};

        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 11) {
                System.out.println("Promedio " + promedios[i] + ": APROBADO");
            } else {
                System.out.println("Promedio " + promedios[i] + ": DESAPROBADO");
            }
        }

    }
}
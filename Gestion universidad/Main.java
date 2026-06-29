/**
 * Programa principal.
 * Aquí se crean los objetos y se prueban los métodos.
 */

public class Main {

    public static void main(String[] args) {

        // Crear objeto Universidad

        Universidad uni = new Universidad(
                "Universidad Tecnológica",
                "Monterrey, Nuevo León");

        // Mostrar información de la universidad

        uni.mostrarUniversidad();

        // Crear estudiantes

        Estudiante estudiante1 = new Estudiante(
                "Juan Pérez",
                "20240101",
                "Ingeniería en Sistemas",
                3,
                91.8);

        Estudiante estudiante2 = new Estudiante(
                "María López",
                "20240102",
                "Ingeniería Industrial",
                5,
                95.2);

        // Mostrar información inicial

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        // Actualizar datos del estudiante 1

        estudiante1.actualizarPromedio(94.5);
        estudiante1.avanzarSemestre();

        // Mostrar nuevamente la información

        System.out.println();
        System.out.println("Después de actualizar datos:");

        estudiante1.mostrarInformacion();

    }

}
/**
 * Clase que representa a un estudiante de la universidad.
 * Contiene los datos principales del estudiante.
 */

public class Estudiante {

    // Atributos privados
    private String nombre;
    private String matricula;
    private String carrera;
    private int semestre;
    private double promedio;

    /**
     * Constructor de la clase Estudiante
     */
    public Estudiante(String nombre, String matricula, String carrera, int semestre, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {

        System.out.println("=================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
    }

    // Método para actualizar el promedio
    public void actualizarPromedio(double nuevoPromedio) {
        promedio = nuevoPromedio;
    }

    // Método para cambiar de semestre
    public void avanzarSemestre() {
        semestre++;
    }

}
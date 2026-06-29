/**
 * Clase que representa una universidad.
 * Permite mostrar información general de la institución.
 */

public class Universidad {

    // Atributos

    private String nombreUniversidad;
    private String direccion;

    /**
     * Constructor de la clase Universidad
     */

    public Universidad(String nombreUniversidad, String direccion) {

        this.nombreUniversidad = nombreUniversidad;
        this.direccion = direccion;

    }

    // Método para mostrar la información

    public void mostrarUniversidad() {

        System.out.println("=================================");
        System.out.println("UNIVERSIDAD");
        System.out.println("Nombre: " + nombreUniversidad);
        System.out.println("Dirección: " + direccion);
        System.out.println("=================================");

    }

}
package Aplicacion;

public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;

    private static int totalAplicaciones = 0;

    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    public void iniciar() {
        ejecutando = true;
    }

    public void cerrar() {
        ejecutando = false;
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }
}

package Aplicacion;
public class Main {
    public static void main(String[] args) {

        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("Calculadora", "2.0");
        Aplicacion app3 = new Aplicacion("Navegador", "3.1");

        System.out.println("Aplicacion: " + app1.getNombre());
        System.out.println("Version: " + app1.getVersion());
        System.out.println("Ejecutando: " + app1.isEjecutando());

        app1.iniciar();

        System.out.println("Despues de iniciar: "
                + app1.isEjecutando());

        app1.cerrar();

        System.out.println("Despues de cerrar: "
                + app1.isEjecutando());

        System.out.println("Total de aplicaciones: "
                + Aplicacion.getTotalAplicaciones());
    }
}
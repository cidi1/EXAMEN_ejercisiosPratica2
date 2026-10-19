package Servidores;

public class Main2 {
    public static void main(String[] args) {

        Servidor servidor1 = new Servidor(
                "ServidorWeb", "192.168.1.20");

        Servidor servidor2 = new Servidor(
                "ServidorBD", "192.168.1.21");

        Servidor servidor3 = new Servidor(
                "ServidorArchivos", "192.168.1.22");

        System.out.println("Total de servidores: "
                + Servidor.getTotalServidores());

        System.out.println("Servidores activos: "
                + Servidor.getServidoresActivos());

        servidor1.activar();
        servidor2.activar();
        servidor3.activar();

        System.out.println("Despues de activar los tres: "
                + Servidor.getServidoresActivos());

        servidor1.activar();

        System.out.println("Despues de activar nuevamente el 1: "
                + Servidor.getServidoresActivos());

        servidor2.desactivar();

        System.out.println("Despues de desactivar el 2: "
                + Servidor.getServidoresActivos());

        servidor2.desactivar();

        System.out.println("Despues de desactivar nuevamente el 2: "
                + Servidor.getServidoresActivos());
    }
}

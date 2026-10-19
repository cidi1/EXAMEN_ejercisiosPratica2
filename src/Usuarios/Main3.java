package Usuarios;

public class Main3 {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Jennifer", "JeyLou@hotmail.com");
        Usuario u2 = new Usuario("nicolas", "NicoTagliafico@gmail.com");
        Usuario u3 = new Usuario("agencia", "Agencia@outlook.com");
        Usuario u4 = new Usuario("gamora", "Gamora@hotmail.com");

        System.out.println("ID: " + u1.getId());
        System.out.println("Username: " + u1.getUsername());
        System.out.println("Correo: " + u1.getCorreo());
        System.out.println("Activo: " + u1.isActivo());

        System.out.println("Total de usuarios: "
                + Usuario.getTotalUsuarios());
    }
}

package InterfacePractice.Exercise3;

public class Usuario {
    private String nombre;

    public Usuario (String nombre) {
        this.nombre = nombre;
    }
    public void comentar(Interactuable publicacion, String comentario) {
        System.out.println(show() + " ha agregado un comentario");
        publicacion.comentar(comentario);
    }

    public void reaccionar(Interactuable publicacion, String reaccion) {
        if (reaccion.equals("Me divierte") || reaccion.equals("Me encanta") || reaccion.equals("Me gusta")) {
            System.out.println(show() + " ha reaccionado a una publicación");
            publicacion.reaccionar(reaccion);
        } else {
            System.out.println(reaccion + " no es una reacción válida");
        }
    }

    public void compartir(Interactuable publicacion) {
        System.out.println(show() + " ha compartido una publicación");
        publicacion.compartir();
    }

    public String show () {
        return "El usuario " + nombre;
    }
}
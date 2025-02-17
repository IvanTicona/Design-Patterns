package InterfacePractice.Exercise5;

public class Estudiante {
    private String nombre;
    private Curso curso;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirse(Curso curso) {
        this.curso = curso;
    }

    public void completarCurso() {
        curso.iniciar();
        curso.completar();
    }
}

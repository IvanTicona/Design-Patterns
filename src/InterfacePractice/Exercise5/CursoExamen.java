package InterfacePractice.Exercise5;

public class CursoExamen implements Curso , Evaluable {
    public void iniciar() {
        System.out.println("Iniciando curso de examen");
    }

    public void completar() {
        System.out.println("Completando curso de examen");
    }
    public void calificar(int puntaje) {
        System.out.println("Calificando examen");
    }
}

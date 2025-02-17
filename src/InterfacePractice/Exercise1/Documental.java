package InterfacePractice.Exercise1;

public class Documental implements Reproducible{
    private final String tema;
    public Documental(String tema){
        this.tema = tema;
    }
    public void reproducir(){
        System.out.println("Reproduciendo documental");
    }
    public void pausar(){
        System.out.println("Pausando documental");
    }
    public void detener(){
        System.out.println("Deteniendo documental");
    }
    public void showTema(){
        System.out.println("Tema: " + tema);
    }
}

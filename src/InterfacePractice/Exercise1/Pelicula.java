package InterfacePractice.Exercise1;

public class Pelicula implements Reproducible {
    private final int duracion;
    public Pelicula(int duracion){
        this.duracion = duracion;
    }
    public void reproducir(){
        System.out.println("Reproduciendo película");
    }
    public void pausar(){
        System.out.println("Pausando película");
    }
    public void detener(){
        System.out.println("Deteniendo película");
    }
    public void showDuracion(){
        System.out.println("Duración: " + duracion + " minutos");
    }
}

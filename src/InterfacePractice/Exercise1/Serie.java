package InterfacePractice.Exercise1;

public class Serie implements Reproducible{
    private final int numEpisodios;
    public Serie(int numEpisodios){
        this.numEpisodios = numEpisodios;
    }
    public void reproducir(){
        System.out.println("Reproduciendo serie");
    }
    public void pausar(){
        System.out.println("Pausando serie");
    }
    public void detener(){
        System.out.println("Deteniendo serie");
    }
    public void showNumEpisodios(){
        System.out.println("Número de episodios: " + numEpisodios);
    }
}

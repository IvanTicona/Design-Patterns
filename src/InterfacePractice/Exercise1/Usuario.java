package InterfacePractice.Exercise1;

import java.util.LinkedList;

public class Usuario {
    private LinkedList<Reproducible> listaReproducibles = new LinkedList<Reproducible>();
    public void agregarReproducible(Reproducible reproducible){
        listaReproducibles.add(reproducible);
    }
    public LinkedList<Reproducible> getListaReproducibles(){
        return listaReproducibles;
    }
}

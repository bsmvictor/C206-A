package br.inatel.cdg.bloco;

public class Bloco {

    private static int numBlocos = 0;

    public static int getNumBlocos() {
        return numBlocos;
    }

    public Bloco() {
        numBlocos++;
    }

    public void destruir(){
        numBlocos--;
    }
}

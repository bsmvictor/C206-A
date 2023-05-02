package br.inatel.cdg.jogador;

import br.inatel.cdg.bloco.Bloco;

public class Jogador {

    private int ponto = 0;

    public int getPonto() {
        return ponto;
    }

    public void destruirBloco(Bloco bloco){
        bloco.destruir();
        ponto ++;
    }
}

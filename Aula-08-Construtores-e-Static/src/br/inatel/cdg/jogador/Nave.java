package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private int vida;
    private String tipoTiro;

    public Nave(String nome, int vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }


    public void atirar(Asteroide ast) {
        if (tipoTiro.equals("Explosivo")) {
            ast.destruir();
        } else {
            if (ast.getTipoAsteroide().equals("Grande"))
                System.out.println("\nArma muito fraca para destruir o asteroide!");
            else
                ast.destruir();
        }
    }
}

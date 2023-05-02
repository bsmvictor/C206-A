package br.inatel.cdg.inimigo;

import java.sql.SQLOutput;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void destruir(){
        System.out.println("\nAsteroide destruido! ");
    }
}

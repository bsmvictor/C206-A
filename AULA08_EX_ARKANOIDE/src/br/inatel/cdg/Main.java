package br.inatel.cdg;

import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.jogador.Jogador;

public class Main {

    public static void main(String[] args) {

        Bloco b1 = new Bloco();     //numBlocos = 1
        Bloco b2 = new Bloco();     //numBlocos = 2
        Bloco b3 = new Bloco();     //numBlocos = 3
        Bloco b4 = new Bloco();     //numBlocos = 4

        Jogador j1 = new Jogador(); //instanciando jogador

        System.out.println("\n\t --- ΛЯKΛПӨIDΣ --- ");

        System.out.println("\n------------------------------");
        System.out.println("Blocoso em jogo: " + Bloco.getNumBlocos());
        System.out.println("Potos do jogador: " + j1.getPonto());
        System.out.println("------------------------------");

        j1.destruirBloco(b1);       //destruindo o bloco 1

        System.out.println("\n------------------------------");
        System.out.println("Blocoso em jogo: " + Bloco.getNumBlocos());
        System.out.println("Potos do jogador: " + j1.getPonto());
        System.out.println("------------------------------");

        j1.destruirBloco(b2);       //destruindo o bloco 2

        System.out.println("\n------------------------------");
        System.out.println("Blocoso em jogo: " + Bloco.getNumBlocos());
        System.out.println("Potos do jogador: " + j1.getPonto());
        System.out.println("------------------------------");

        j1.destruirBloco(b3);       //destruindo o bloco 3

        System.out.println("\n------------------------------");
        System.out.println("Blocoso em jogo: " + Bloco.getNumBlocos());
        System.out.println("Potos do jogador: " + j1.getPonto());
        System.out.println("------------------------------");

        j1.destruirBloco(b4);       //destruindo o bloco 4

        System.out.println("\n------------------------------");
        System.out.println("Blocoso em jogo: " + Bloco.getNumBlocos());
        System.out.println("Potos do jogador: " + j1.getPonto());
        System.out.println("------------------------------");

        Conversor.converter(j1.getPonto());

    }
}

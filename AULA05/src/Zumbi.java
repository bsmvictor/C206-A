public class Zumbi {

    String nome;
    double vida;

    double mostraVida() {
        System.out.println("\nVida do zumbi " + nome + " eh: " + vida);
        return 0;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia) {

        boolean transferencia;

        if (quantia >= vida) {
            transferencia = false;
            System.out.println(false);

        } else {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            System.out.println("\nVida do zumbi " + zumbiAlvo.nome + " eh: " + zumbiAlvo.vida);

        }

    }

}

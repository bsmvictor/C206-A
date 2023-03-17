public class Personagem {


    String nome;
    int vida;
    Arma arma;


    public void usarArma(){
        arma.resiatencia -= 2;
        System.out.println("\n" + nome + " utilizou sua arma!");
        System.out.println("resistencia atual: " + arma.resiatencia);
    }

    public void tomarDano(){
        vida -= 5;
        System.out.println("\n" + nome + " tomou dano!");
        System.out.println("Vida atual: " + vida);
    }

    public void personagemInfo(){
        System.out.println("\n-----INFO-PERSONAGEM-----");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }


}

public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("\nCarro " + nome + " esta pulando!");
    }

    void soltarTurbo(){
        System.out.println("\nCarro " + nome + " esta soltando turbo!");
    }

    void fazerDrift(){
        System.out.println("\nCarro " + nome + " esta fazendo drift!");
    }

}

public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        z1.nome = "Anna";
        z1.vida = 100;

        Zumbi z2 = new Zumbi();
        z2.nome = "Chris";
        z2.vida = 80;

        z1.transfereVida(z2, 20);



    }
}
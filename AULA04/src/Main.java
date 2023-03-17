public class Main {
    public static void main(String[] args) {

        Zumbi x = new Zumbi();

        x.nome = "Adalberto";
        x.vida = 50;
        x.fome = 30;

        System.out.println("\nSeu zumbi se chama " + x.nome + "!");
        System.out.println("\n" + x.nome + " possui " + x.vida + " de vida.");
        System.out.println("\n" + x.nome + " esta com " + x.vida + " de fome.");

        Zumbi y = new Zumbi();

        y.nome = "Codovildo";
        y.vida = 100;
        y.fome = 78;

        System.out.println("\nSeu zumbi se chama " + y.nome + "!");
    }
}

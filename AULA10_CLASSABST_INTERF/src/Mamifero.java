public abstract class Mamifero {

    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void emitirSom() {
    }

    public void mostraInfo() {
        System.out.println("\n   INFORMAÇÕES   ");
        System.out.println("\nNome: " + this.nome);
        System.out.println("Vida: " + this.vida);
    }
}

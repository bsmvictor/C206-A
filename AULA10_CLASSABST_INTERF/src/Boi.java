public class Boi extends Mamifero {

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("\n" + this.nome + " esta berrando");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }
}

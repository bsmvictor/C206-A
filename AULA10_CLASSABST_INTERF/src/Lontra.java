public class Lontra extends Mamifero implements Aquatico{

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void nadar() {
        System.out.println("\n" + this.nome + " esta berrando");
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

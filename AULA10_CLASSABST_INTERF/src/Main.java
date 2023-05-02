public class Main {
    public static void main(String[] args) {

        Cachorro ca = new Cachorro("Roberto", 75);
        ca.emitirSom();
        ca.mostraInfo();

        Boi bo = new Boi("Jeferson", 80);
        bo.emitirSom();
        bo.mostraInfo();

        Lontra lo = new Lontra("Alves", 95);
        lo.emitirSom();
        lo.nadar();
        lo.mostraInfo();
    }
}
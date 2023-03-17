public class Main {
    public static void main(String[] args) {

        //Criando Kart lembrando que o Motor é criado junto

        //kart, piloto, motor e acoes 1
        Kart kart1 = new Kart();

        //criando kart
        kart1.nome = "Kart1";
        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 95.20f;

        //criando piloto
        Piloto piloto1 = new Piloto();
        piloto1.nome = "Piloto1";
        kart1.piloto = piloto1; //agregando piloto e kart

        //soltando poder
        piloto1.soltaSuperPoder();

        //fazendo drift
        kart1.fazerDrift();

        //mostrando info do kart
        kart1.motor.mostraInfo();

        //kart, piloto, motor e acoes 2
        Kart kart2 = new Kart();

        //criiando kart
        kart2.nome = "Kart2";
        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 76.10f;

        //criando piloto
        Piloto piloto2 = new Piloto();
        piloto2.nome = "Piloto2";

        //agregando piloto e kart
        kart2.piloto = piloto2;

        //soltando poder
        piloto2.soltaSuperPoder();

        //soltando turbo
        kart2.soltarTurbo();
        //mostrndo informacoes
        kart2.motor.mostraInfo();


    }
}
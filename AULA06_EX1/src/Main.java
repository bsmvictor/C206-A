public class Main {
    public static void main(String[] args) {

        //CRIANDO BANDA
        Banda b = new Banda("Neon Shadows", "Rock");

        //CRIANDO MEMBROS
        Membro m1 = new Membro("Liam Parker", "vocal e guitarra");
        Membro m2 = new Membro("Maya Lee", "baixo e backing vocal");
        Membro m3 = new Membro("David Chen", "bateria e percussão");

        //ADICIOANDO MEMBROS A BANDA
        b.addMembro(m1);
        b.addMembro(m2);
        b.addMembro(m3);

        //CRIANDO MUSICAS
        Musica mu1 = new Musica("Lost in the Night", 3.34);
        Musica mu2 = new Musica("Electric Dreams", 2.56);
        Musica mu3 = new Musica("City of Ghosts", 3.21);

        //ADICIONANDO MUSICAS A BANDA
        b.addMusica(mu1);
        b.addMusica(mu2);
        b.addMusica(mu3);

        //CRIANDO EMPRESARIO
        Empresario e = new Empresario("Chat GPT", 62983456);

        //ADICONANDO EMPRESARIO A BANDA
        b.empresario = e;

        //MOSTRANDO INFORMACOES DA BANDA
        b.mostraInfo();

    }


}

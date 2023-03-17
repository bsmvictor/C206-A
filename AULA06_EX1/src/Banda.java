public class Banda {
    String nome;
    String genero;
    Empresario empresario;
    Musica[] musicas = new Musica[3];
    Membro[] membros = new Membro[3];

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void addMusica(Musica novamusica) {
        for (int i = 0; i < musicas.length; i++) { //varrendo o vetor
            if (musicas[i] == null) {  //verifica se ja existe musica
                musicas[i] = novamusica;
                break;  //adiciona e sai do metodo
            }
        }
    }

    public void addMembro(Membro novomembro) {
        for (int i = 0; i < membros.length; i++) { //varrendo o vetor
            if (membros[i] == null) {  //verifica se ja existe membros
                membros[i] = novomembro;
                break;  //adiciona e sai do metodo
            }
        }
    }

    public void mostraInfo() {
        System.out.println("\nBanda " + this.nome);
        System.out.println("\nSeu genero: " + this.genero);
        System.out.println("\nSeus integrantes: ");
        for (Membro integrantes : membros) {
            System.out.println(integrantes.nome + " | " + integrantes.funcao);
        }
        System.out.println("\nSuas musicas: ");
        for(Musica musica : musicas){
            System.out.println(musica.nome + " | "+ "duracao: " + musica.duracao);
        }
        if (empresario == null)
            System.out.println("Nao possui empresario");
        else
            System.out.println("\nEmpresariada por: " + empresario.nome + " | " + "CNPJ: " + empresario.cnpj);
    }

}

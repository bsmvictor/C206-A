public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[3];

    public void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < salgados.length; i++) { //arrendo o vetor
            if (salgados[i] == null) {  //verifica se n existe salgado
                salgados[i] = novoSalgado;
                break;  //adiciona e sai do metodo
            }
        }
    }

    public void mostraInfo() {

        System.out.println("\n" + nome + " possui os seguintes salgados.");
        for (Salgado salgado : salgados) {
            if (salgado != null) {  //verifica se existe salgado
                System.out.println(salgado.nome);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {

        //CRIANDO PERSONAGEM
        Personagem p1 = new Personagem();
        p1.nome = "Victor";
        p1.vida = 100;

        //CRIANDO ARMA
        Arma a1 = new Arma();
        a1.nome = "GLock";
        a1.poder = 120;
        a1.resiatencia = 100;
        a1.descricao = "Baixa cadenci e curto alcance.";

        //ATRIBUINDO ARMA AO PERSONAGEM
        p1.arma = a1;

        //MOSTRANDO INFORMACOES DO PERSONAGEM
        p1.personagemInfo();

        //MOSTRANDO INFORMACOES DA ARMA do personagem 1
        p1.arma.mostraInfoArma();

        //TIRANDO VIDA DO PERSONAGEM
        p1.tomarDano();

        //USANDO A ARMA PARA PERDER RESISTENCIA
        p1.usarArma();

    }
}
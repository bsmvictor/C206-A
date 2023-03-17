import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        Cantina c = new Cantina();
        c.nome = "Cantina do Inatel";

        Salgado s1 = new Salgado();
        s1.nome = "Telebacon";
        c.addSalgado(s1);

        Salgado s2 = new Salgado();
        s2.nome = "Pasltel";
        c.addSalgado(s2);

        Salgado s3 = new Salgado();
        s3.nome = "Coxinha";
        c.addSalgado(s3);

        c.mostraInfo();



    }
}
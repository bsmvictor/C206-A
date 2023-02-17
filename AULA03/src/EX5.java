import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();
        int x = rand.nextInt(10)+1; //Gerar numero entre 1 e 10 // sem o +1 GERARIA DE 0 A 9
        int num = 0;

        for (int i = 0; num != x; i++) {
            System.out.print("\nInsira um valor de 1 ate 10: ");
            num = entrada.nextInt();

            if (num == x)
                System.out.println("\nPARABENS VOCE ACERTOU!!!");

            else
                System.out.println("\nERROU :( TENTE NOVAMENTE!");
        }
    }
}

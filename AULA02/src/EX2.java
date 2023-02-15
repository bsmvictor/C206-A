import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float Quant = 0;
        float Soma = 0;
        float Media = 0;

        System.out.print("\nDigite quantos pedidos foram feitos: ");
        Quant = entrada.nextFloat();

        for (int i = 1; i <= Quant; i++) {
            System.out.print("\nQUantos lanches foram consumidos n pedido: " + i );
            int Lanches = entrada.nextInt();
            Soma += Lanches;
        }

        Media += Soma / Quant;

        System.out.println("\nForam consumidos " + Soma + " lanches");
        System.out.println("\nMedia: " + Media);

        entrada.close();
    }
}

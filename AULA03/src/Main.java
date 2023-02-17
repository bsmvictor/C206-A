import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nalunos = 0;

        System.out.print("Insira o nuero de alunos: ");
        nalunos = entrada.nextInt();

        while (nalunos != -1) {

            switch (nalunos) {
                case 10, 20 -> System.out.println("Sala: l-16");
                case 30 -> System.out.println("Sala: l-22");
                default -> System.out.println("Nao existem salas disponiveis para esta quantidade de alunos");
            }

            System.out.print("Insira o nuero de alunos: ");
            nalunos = entrada.nextInt();
        }

        entrada.close();
    }
}
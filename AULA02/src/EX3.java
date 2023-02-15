import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float NPA = 0;
        float NFA = 0;
        float NP3 = 0;

        System.out.print("\nDigite a nota do aluno: ");
        NPA = entrada.nextFloat();

        if(NPA >= 60 ){
            System.out.println("\n APROVADO!");
        }
        else if(NPA <= 30){
            System.out.println("\n NP3 :( " + "Nota da NP3: ");
            NP3 = entrada.nextFloat();
            NFA = (NPA + NP3)/2;

            if(NFA >= 50)
                System.out.println("\n APROVADO!");
            else
                System.out.println("\n REPROVADO :(");
        }
        else
            System.out.println("\n REPROVADO :( ");

        entrada.close();
    }
}

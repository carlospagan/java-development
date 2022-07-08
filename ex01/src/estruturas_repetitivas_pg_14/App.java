package estruturas_repetitivas_pg_14;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = 0;
        String errado = "n";
        while(a == 0){
            System.out.println("Digite a temperatura em graus celsius:");
            double resposta = leitor.nextFloat();


            System.out.println(resposta);

            double fahrenheit = resposta * 1.8 + 32.0;

            System.out.printf("A temperatura e de %.2f fahrenheit\n", fahrenheit);

            System.out.println("Deseja obter outra temperatura?");

            String confirmacao = leitor.next();

            if(confirmacao.equals(errado)){
                a = 1;
            }
        }
    }
}

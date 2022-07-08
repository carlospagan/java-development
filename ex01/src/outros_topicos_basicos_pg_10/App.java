package outros_topicos_basicos_pg_10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres numeros");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("o numero " + n1 + " e o maior");
        }

        if(n2 > n1 && n2 > n3){
            System.out.println("o numero " + n2 + " e o maior");
        }

        if(n3 > n1 && n3 > n2){
            System.out.println("o numero " + n3 + " e o maior");
        }

    }

}

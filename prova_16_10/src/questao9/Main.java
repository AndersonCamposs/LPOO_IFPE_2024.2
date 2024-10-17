package questao9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numero = scan.nextInt();

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.printf("É par: %d%n", i);
            }
        }
    }
}

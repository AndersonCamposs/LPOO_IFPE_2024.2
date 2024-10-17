package questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = scan.nextInt();
            numeros[i] = numero;
        }

        for(int i = numeros.length - 1; i >= 0; i--) {
            System.out.printf("numeros[%d] = %d%n", i, numeros[i]);
        }
    }
}

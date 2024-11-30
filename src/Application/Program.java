package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        sc.nextLine();
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
            numeros[i] = num;
        }

        double maior = 0;
        int pos = 0;
        for (int i = 0; i < numeros.length ; i++) {
            if (maior < numeros[i]) {
                maior = numeros[i];
                pos = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f%n", maior );
        System.out.println("POSICAO DO MAIOR VALOR = " + pos);
    }
}

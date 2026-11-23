
// Aluno: Pablo Hérick do Prado Lara
// Exercício: FizzBuzz

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}

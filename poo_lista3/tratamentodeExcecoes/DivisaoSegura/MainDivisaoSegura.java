package tratamentodeExcecoes.DivisaoSegura;

import java.util.Scanner;

public class MainDivisaoSegura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros.");

        } finally {
            System.out.println("Operação encerrada.");
            scanner.close();
        }
    }
}
package estruturaCondicional.exercicios.exercicio08;

import java.util.Scanner;
import java.util.Locale;

public class exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        double result;
        if (salario >= 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            result = salario * 0.08;
            System.out.printf("R$ %.2f%n", result);
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            result = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", result);

        } else {
            result = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", result);
        }
        sc.close();

    }
}
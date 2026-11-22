package estruturaSequencial.Exercicios.exercicio02;
import java.util.Scanner;
import java.util.Locale;

public class exercicio02 {
    public static void main(String[] args) {
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();

        double r = Math.pow(raio, 2.0);
        double area = 3.14159 * r;

        System.out.printf("A=%.4f",  area);

        sc.close();
    }
}

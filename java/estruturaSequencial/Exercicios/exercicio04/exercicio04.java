package estruturaSequencial.Exercicios.exercicio04;
import java.util.Scanner;
import java.util.Locale;


public class exercicio04 {
    public static void main(String[] args) {
        // Faça um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número do funcionário e o salário do funcionário, com duas casas decimais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFunc = sc.nextInt();
        int hrsTab = sc.nextInt();
        double salHrs = sc.nextDouble();

        double salario = hrsTab * salHrs;

        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }
}

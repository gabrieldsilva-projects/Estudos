package estruturaCondicional.exercicios.exercicio06;
import java.util.Scanner;
import java.util.Locale;

public class exercicio06 {
    // Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        boolean intervalo1 = num >= 0 || num <= 25;
        boolean intervalo2 = num > 25 || num <= 50;
        boolean intervalo3 = num > 50 || num <= 75;
        boolean intervalo4 = num > 75 || num <= 100;

        if (intervalo1) {
            System.out.println("Intervalo [0,25]");
        } else if (intervalo2) {
            System.out.println("Intervalo [25,50]");
        }else if (intervalo3) {
            System.out.println("Intervalo [50,75]");
        } else if (intervalo4) {
            System.out.println("Intervalo [70,100]");
        } else {
            System.out.println("Fora do intervalo");
        }



        sc.close();
    }
}

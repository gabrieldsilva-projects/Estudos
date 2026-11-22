package estruturaSequencial.Exercicios.exercicio05;
import java.util.Scanner;
import java.util.Locale;

public class exercicio05 {
    public static void main(String[] args) {
        // Faça um programa para ler o código de uma peça 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pc1, pc2, qntPc1, qntPc2;
        double UnPc1, UnPc2;

        pc1 = sc.nextInt();
        qntPc1 = sc.nextInt();
        UnPc1 = sc.nextDouble();

        pc2 = sc.nextInt();
        qntPc2 = sc.nextInt();
        UnPc2 = sc.nextDouble();

        double totPay = (UnPc1 * qntPc1) + (UnPc2 * qntPc2);

        System.out.printf("VALOR A PAGAR: R$%.2f%n", totPay);

        sc.close();
    } 
}

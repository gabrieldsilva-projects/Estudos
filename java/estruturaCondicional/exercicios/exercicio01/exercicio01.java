package estruturaCondicional.exercicios.exercicio01;
import java.util.Scanner;

public class exercicio01 {
    // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
        sc.close();
    }
}
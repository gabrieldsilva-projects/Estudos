package estruturaCondicional.exercicios.exercicio05;
import java.util.Scanner;
import java.util.Locale;
public class exercicio05 {
    // Com base na tabela preço, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt();
        int qtn = sc.nextInt();
        
        Locale.setDefault(Locale.US);
        double result;
        if (cod == 1) {
            result = qtn * 4.00;
        } else if (cod == 2) {
            result = qtn * 4.50;
        } else if (cod == 3) {
            result = qtn * 5.00;
        } else if (cod == 4) {
            result = qtn * 2.00;
        }
        else {
            result = qtn * 1.50;
        }

        System.out.printf("Total : R$ %.2f", result);

        sc.close();
 }    
}

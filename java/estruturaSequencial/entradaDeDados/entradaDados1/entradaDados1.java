package estruturaSequencial.entradaDeDados.entradaDados1;

import java.util.Scanner;
import java.util.Locale;

public class entradaDados1 {
    public static void main(String[] args) {

        System.out.println("Exemplo1 - Ler uma String");
        Scanner sc = new Scanner(System.in); // Scanner base
        String x;
        x = sc.next();

        System.out.println("Você digitou: " + x);

        System.out.println("\nExemplo2 - Ler um número int");
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        System.out.println("\nExemplo3 - Ler um número com ponto flutuante");
        Locale.setDefault(Locale.US);
        double z;
        z = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n", z);

        System.out.println("\nExemplo4 - Ler um caractere");
        char c;
        c = sc.next().charAt(0);
        System.out.println("Você digitou: " + c);

        System.out.println("\nExemplo4 - Ler vários dados em uma linha");

        String s;
        int i;
        double d;

        s = sc.next();
        i = sc.nextInt();
        d = sc.nextDouble();

        System.out.printf("Dados digitados: \n %s \n %d \n %.2f", s, i, d);

        sc.close(); // fechamento do Scanner
    }
}

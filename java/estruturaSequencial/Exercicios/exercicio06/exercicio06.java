package estruturaSequencial.Exercicios.exercicio06;
import java.util.Scanner; 
import java.util.Locale;

public class exercicio06 {
    /* 
    Faça um programa que leia três valores com ponto flutuante de dupla precisão: A, B, C. Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura
    d) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura
    d) a área do quadrado que tem lado A e B
    e) a área do retângulo que tem lados A e B
     */ 
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double r = Math.pow(C, 2);

        double triangulo = (A * C) / 2;
        double circulo = 3.14159 * r;
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("TRIANGULO = %.3f", triangulo);
        System.out.printf("\nCIRCULO = %.3f", circulo);
        System.out.printf("\nTRAPEZIO = %.3f", trapezio);
        System.out.printf("\nQUADRADO = %.3f", quadrado);
        System.out.printf("\nRETANGULO = %.3f", retangulo);

        sc.close();
    }
}

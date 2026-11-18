
package estruturaSequencial.saidaDados;

import java.util.Locale; // Configuração de localização do script, por exemplo, em double em Brasil é utilizado a virgula, já nos Estados Unidos é utilizado o ponto

public class saidaDados {
    public static void main(String[] args) {
        // Sem quebra de linha
        System.out.println("Olá, Mundo!");
        System.out.println("Bom dia!");

        // Com quebra de linha
        System.out.print("Olá, Mundo!");
        System.out.print("Bom dia!");

        // Declaração de variável

        int y = 32;

        System.out.println("\n" + y);

        double x = 10.35784;
        System.out.println(x);

        // Com controle de casas decimais
        // duas casas decimais
        System.out.printf("%.2f%n", x);

        // quatro casas decimais
        System.out.printf("%.4f\n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", x); // com Locale

        // Concatenar elementos
        System.out.println("Resultado = " + x + " METROS");

        // concatenação com printf
        System.out.printf("Resultado = %.2f metros%n", x);

        // Exemplo com vários tipos 
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}
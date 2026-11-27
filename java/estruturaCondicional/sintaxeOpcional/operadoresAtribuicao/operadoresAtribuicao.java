package estruturaCondicional.sintaxeOpcional.operadoresAtribuicao;
import java.util.Scanner;
import java.util.Locale;
public class operadoresAtribuicao {
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double conta = 50.0;
            int min = sc.nextInt();
            if (min > 100) {
                // conta = conta + (min - 100) * 2.0;
                conta += (min - 100) * 2.0;
            }

            System.out.printf("Valor da conta = %.2f%n", conta);

            sc.close();
    }
}

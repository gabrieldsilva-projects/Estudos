package estruturaCondicional.sintaxeOpcional.condicaoTernaria;

public class condicaoTernaria {
    public static void main(String[] args) {
        // indicar qual metodo ser executado: exemploIf() / exemploTernario()
    }    

    public static void exemploIf() {
        double preco = 34.5;
        double desconto;
        if(preco < 20.0) {
            desconto = preco * 0.1;
        }else {
            desconto = preco * 0.05;
        }

        System.out.printf("O valor com desconto é de %.2f%n", desconto);
    }
    
    public static void exemploTernario() {
        double preco = 34.5;
        double desconto = (preco < 20.0) ?  preco * 0.1 : preco * 0.05;

        System.out.printf("O valor com desconto é de %.2f%n", desconto);

    }
}

# 📘 Entrada de dados em Java - Parte 2

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

# Para ler um texto até a quebra de linha 

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3; 
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
```

## ⚠️ Quebra de linha pendente

Quando você usa um comando de leitura diferente do `nextLine()` e dá alguma
quebra de linha, essa quebra fica **pendente** na entrada padrão. Se você fizer
um `nextLine()` em seguida, essa quebra de linha será absorvida por ele.

### Exemplo

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha pendente
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
```

### Solução

Faça um `nextLine()` extra antes de fazer o `nextLine()` de seu interesse.


 # 📘 Switch Case

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

# Conceito

Utilizada quando existem várias opções de fluxo a serem tratadas com base no valor de uma variável. Em vez de várias estruturas if-else encadeadas, algumas pessoas preferem utilizar a estrutura switch-case.

## Sintaxe 

```java 
switch ( expressão ) {
    case valor1:
            comando1
            comando2
            break;
    case valor2:
            comando3
            comando4
            break;
    default:
            comando5
            comando6
            break;
}
```

## Exemplo no Java 

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    String dia;

    switch (x) {
        case 1:
            dia = "segunda-feira";
            break;
        case 2:
            dia = "terça-feira";
            break;
        case 3:
            dia = "quarta-feira";
            break;
        case 4:
            dia = "quinta-feira";
            break;
        case 5:
            dia = "sexta-feira";
            break;
        case 6:
            dia = "sábado";
            break;
        case 7:
            dia = "domingo";
            break;
        default:
            dia = "Valor inválido";
            break;
    }

    System.out.println("Dia da semana: " + dia);

    sc.close();
}
```

## Estrutura do `switch`

- `switch (x)` avalia o valor da variável `x` e o compara com os valores dos `case`.
- Cada `case` representa uma opção. Quando há correspondência, o código daquele bloco é executado.
- `break` encerra o `switch` depois da opção escolhida, evitando que os próximos casos também sejam executados.
- `default` é executado quando nenhum `case` corresponde ao valor de `x`; neste exemplo, atribui uma mensagem de valor inválido.
- A variável `dia` recebe o resultado de cada opção e, depois do `switch`, é exibida no console.


# 📘 Processamento de Dados em Java

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

Neste material, você aprenderá a ler dados digitados pelo usuário usando a classe `Scanner`.

## 📌 Scanner

Para fazer entrada de dados, cria-se um objeto do tipo "Scanner"

### Sintaxe:
```java
Scanner sc = new Scanner(System.in);
```

> Para utilizar o objeto `Scanner`, é necessário importar `java.util.Scanner` no começo do programa.
> Faça `sc.close()` quando não for mais necessário utilizar o objeto `sc` (`Scanner sc`).

# Para ler uma `String`

## Sintaxe
```java
x = sc.next();
```

> O método `next()` lê a próxima palavra digitada, até encontrar um espaço em branco.

# Para ler números `Int`

## Sintaxe 
```java
x = sc.nextInt();
```

> O método `nextInt()` lê o próximo número inteiro digitado.

# Para ler números `Double` ou número com ponto flutuante

## Sintaxe 
```java
x = sc.nextDouble();
```

> **ATENÇÃO**
> Para considerar o separador de decimais como ponto, **ANTES** da declaração do `Scanner`, use:
> `Locale.setDefault(Locale.US);`

# Para ler um caracter (char)

## Sintaxe

```java
x = sc.next().charAt(0);
```

> O método `next()` lê a String digitada, e a função `charAt(0)` lê o primeiro caractere.

# Para ler vários dados na mesma linha
 
```java
x = sc.next();
y = sc.nextInt();
z = sc.nextDouble();
```
# 📘 Entrada de dados em Java

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

Neste material, você aprenderá a ler dados digitados pelo usuário usando a classe `Scanner`.

## 📌 `Scanner`

Para ler dados do teclado, crie um objeto do tipo `Scanner`:

### Sintaxe
```java
Scanner sc = new Scanner(System.in);
```

> Importe `java.util.Scanner` no início do programa.
> Feche o `Scanner` com `sc.close()` quando não precisar mais dele. Isso também fecha `System.in`.

## Para ler uma `String`

### Sintaxe
```java
x = sc.next();
```

> O método `next()` lê o próximo token, encerrando a leitura ao encontrar um espaço em branco.

## Para ler um número inteiro (`int`)

### Sintaxe
```java
x = sc.nextInt();
```

> O método `nextInt()` lê o próximo número inteiro digitado.

## Para ler um número decimal (`double`)

### Sintaxe
```java
x = sc.nextDouble();
```

> **Atenção:** para usar o ponto como separador decimal, importe `java.util.Locale` e configure o padrão antes de criar o `Scanner`:
> ```java
> Locale.setDefault(Locale.US);
> Scanner sc = new Scanner(System.in);
> ```

## Para ler um caractere (`char`)

## Sintaxe

```java
x = sc.next().charAt(0);
```

> O método `next()` lê o próximo token, e `charAt(0)` retorna seu primeiro caractere.

## Para ler vários dados na mesma linha

```java
x = sc.next();
y = sc.nextInt();
z = sc.nextDouble();
```

> Cada chamada lê o próximo valor da entrada, mesmo que eles estejam separados por espaços na mesma linha.
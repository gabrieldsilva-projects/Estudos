# 📘 Saída de Dados em Java

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

## Índice

- [Escrever texto na tela](#escrever-texto-na-tela)
- [Exibir o valor de uma variável](#exibir-o-valor-de-uma-variável)
- [Exibir números de ponto flutuante](#exibir-números-de-ponto-flutuante)
- [Concatenar elementos](#concatenar-elementos)
- [Especificadores do `printf`](#especificadores-do-printf)

---

## Escrever texto na tela

### Sem quebra de linha

```java
System.out.print("Olá, mundo!");
```

### Com quebra de linha

```java
System.out.println("Olá, mundo!");
```

---

## Exibir o valor de uma variável

Considere uma variável do tipo `int`:

```java
int y = 32;

System.out.println(y); // 32
```

---

## Exibir números de ponto flutuante

Considere uma variável do tipo `double`:

```java
double x = 10.35784;
```

### Exibir o valor completo

```java
System.out.println(x); // 10.35784
```

### Exibir com duas casas decimais

```java
System.out.printf("%.2f%n", x); // 10.36
```

### Exibir com quatro casas decimais

```java
System.out.printf("%.4f%n", x); // 10.3578
```

> **Observação:** `%n` representa uma quebra de linha independente do sistema operacional.

---

## Concatenar elementos

### Com `print` e `println`

> Os elementos são unidos usando o operador `+`.

```java
System.out.println("Resultado = " + x + " METROS");
// Resultado = 10.35784 METROS
```

### Com `printf`

> O texto contém marcadores de posição que serão substituídos pelas variáveis informadas.

```java
System.out.printf("Resultado = %.2f metros%n", x);
// Resultado = 10.36 metros
```

### Exemplo com vários tipos

```java
String nome = "Maria";
int idade = 31;
double renda = 4000.0;

System.out.printf(
    "%s tem %d anos e ganha R$ %.2f reais%n",
    nome,
    idade,
    renda
);
// Maria tem 31 anos e ganha R$ 4000.00 reais
```

---

## Especificadores do `printf`

| Especificador | Tipo | Exemplo |
|:-------------:|:-----|:--------|
| `%f` | Número de ponto flutuante | `10.35784` |
| `%.2f` | Número com duas casas decimais | `10.36` |
| `%d` | Número inteiro | `31` |
| `%s` | Texto | `Maria` |
| `%n` | Quebra de linha | Independente da IDE e do sistema operacional |
 

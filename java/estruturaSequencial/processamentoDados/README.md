# 📘 Processamento de Dados em Java

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

Neste material, você aprenderá como armazenar resultados em variáveis usando o comando de atribuição.

## 📌 Comando de atribuição

### Sintaxe

```java
<variável> = <expressão>;
```

> O sinal de igual (`=`) pode ser lido como **“recebe”**.

### Regra

1. A expressão é calculada.
2. O resultado da expressão é armazenado na variável.

## 🧮 Exemplos

### Exemplo 1 — Atribuição entre inteiros

```java
int x, y;
x = 5;
y = 2 * x; // y recebe o dobro do valor de x.

System.out.println(x);
System.out.println(y);
```

**Saída:**

```text
5
10
```

### Exemplo 2 — Atribuição entre tipos numéricos

```java
int a;
double c;

a = 5;
c = 2 * a; // c recebe o dobro do valor de a.

System.out.println(a);
System.out.println(c);
```

**Saída:**

```text
5
10.0
```

### Exemplo 3 — Cálculo da área de um trapézio

```java
double b, B, h, area;
b = 6.0;
B = 8.0;
h = 5.0;

area = (b + B) / 2.0 * h;

System.out.println(area);
```

**Saída:**

```text
35.0
```

### Exemplo 4 — Divisão entre inteiros com resultado decimal (Casting)

```java
int e, d;
double resultado;

e = 5;
d = 2;

resultado = (double) e / d; // Converte a para double antes da divisão.

System.out.println(resultado);
```
**Saída:**

```text
2.5
```

### Exemplo 5 — Conversão de `double` para `int` (Casting)

```java
double f; 
int g;
f = 5.0;
g = (int) f; // Converte o valor de f para int.

System.out.println(g);
```
**Saída:**
```text
5
```
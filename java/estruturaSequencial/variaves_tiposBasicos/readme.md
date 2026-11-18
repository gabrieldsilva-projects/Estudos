# 📘 Variáveis e Tipos Básicos

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

---

## 📌 Variáveis

Uma variável é uma porção da memória RAM utilizada para armazenar dados durante a execução de um programa.

### Declaração de variáveis

#### Sintaxe

```java
<tipo> <nome> = <valor inicial>; // O valor inicial é opcional
```

#### Exemplos

**Número inteiro:**

```java
int idade = 25;
```

**Número de ponto flutuante:**

```java
double altura = 1.68;
```

**Um caractere Unicode:**

```java
char sexo = 'F';
```

### Uma variável possui

- **Nome** — também chamado de identificador;
- **Tipo** — define quais valores podem ser armazenados;
- **Valor** — dado armazenado na variável;
- **Endereço** — posição da variável na memória.

## 🔢 Tipos primitivos

| Categoria | Tipo | Tamanho | Intervalo de valores | Valor padrão |
|:---|:---:|---:|:---|:---|
| Número inteiro | `byte` | 8 bits | -128 a 127 | `0` |
| Número inteiro | `short` | 16 bits | -32.768 a 32.767 | `0` |
| Número inteiro | `int` | 32 bits | -2.147.483.648 a 2.147.483.647 | `0` |
| Número inteiro | `long` | 64 bits | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 | `0L` |
| Ponto flutuante | `float` | 32 bits | ±1,4024 × 10⁻⁴⁵ a ±3,4028 × 10³⁸ | `0.0f` |
| Ponto flutuante | `double` | 64 bits | ±4,94 × 10⁻³²⁴ a ±1,79 × 10³⁰⁸ | `0.0d` |
| Caractere Unicode | `char` | 16 bits | `'\u0000'` a `'\uFFFF'` | `'\u0000'` |
| Valor lógico | `boolean` | 1 bit | `true` ou `false` | `false` |

**String** é uma sequência de caracteres utilizada para representar palavras, frases ou textos.

```java
String mensagem = "Olá, mundo!";
```

# Nome de variáveis

- Não pode começar com digito: use uma letra ou _
- Não pode ter espaço em branco
- Não usuar acentos ou caracteres especiais
- Sugestão: use o padrão "camel case"

| **Errado** | **Certo** |
| --- | --- |
| `int 5minutos;` | `int _5minutos;` |
| `int salário;` | `int salario;` |
| `int salário do funcionario;` | `int salarioDoFuncionario;` |
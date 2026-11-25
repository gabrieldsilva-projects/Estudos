# 📘 Expressões Lógicas

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

# Operadores lógicos

| Operador | Significado |
| :---: | :--- |
| `&&` | E (AND) |
| <code>&#124;&#124;</code> | OU (OR) |
| `!` | NÃO (NOT) |

## Aplicação:

### Ideia por trás do operador "E"

#### Exemplo:

Obter uma habilitação de motorista se:

- For aprovado no exame psicotécnico;

**E**

- For aprovado no exame de legislação;

**E**

- For aprovado no exame de direção.

> Todas condições devem ser verdadeiras!

#### Exemplos de expressões lógicas  

**(suponha x igual a 5)**

```java
x <= 20 && x == 10
```

| Condição | Valor lógico |
| :--- | :---: |
| x <= 20 | `V` |
| x == 10 | `F` |

> Resultado: `F`

    x > 0 && x != 3 

| Condição | Valor lógico |
| :--- | :---: |
| x > 0 | `V` |
| x != 3 | `V` |

> Resultado == V

    x <= 20 && x == 10 && x != 3 

| Condição | Valor lógico |
| :--- | :---: |
| x <= 20 | `V` |
| x == 10 | `F` |
| x != 3 | `V` |

> Resultado == F

## Tabela verdade do operador "E"

| A | B | A && B |
| :---: | :---: | :---: |
| `F` | `F` | `F` |
| `F` | `V` | `F` |
| `V` | `F` | `F` |
| `V` | `V` | `V` |


### Ideia por trás do operador "OU"

#### Exemplo:

Estacionar na vaga especial se:

- For idoso(a),

**OU**

- For uma pessoa com deficiência,

**OU**

- For uma gestante

> Pelo menos uma condições deve ser verdadeira!

#### Exemplos de expressões lógicas 

**(suponha x igual a 5)**

```java
x == 10 || x <= 20
```

| Condição | Valor lógico |
| :--- | :---: |
| x == 10 | `F` |
| x <= 20 | `V` |

> Resultado: `V`

```java
x > 0 || x != 3
```

| Condição | Valor lógico |
| :--- | :---: |
| x > 0 | `V` |
| x != 3 | `V` |

> Resultado: `V`

```java
x <= 0 || x != 3 || x != 5
```

| Condição | Valor lógico |
| :--- | :---: |
| x <= 0 | `F` |
| x != 3 | `V` |
| x != 5 | `F` |

> Resultado: `V`

## Tabela verdade do operador "OU"

| A | B | A \|\| B |
| :---: | :---: | :---: |
| `F` | `F` | `F` |
| `F` | `V` | `V` |
| `V` | `F` | `V` |
| `V` | `V` | `V` |

### Ideia por trás do operador "NÃO"

#### Exemplo:

Direito a receber uma bolsa de estudos se:

**NÃO**
- Possuir renda mais que $ 3000,00

> Operador "NÃO" inverte a condição

#### Exemplos de expressões lógicas 

**(suponha x igual a 5)**
    !(x == 10)

| Condição | Valor lógico |
| :--- | :---: |
| x == 10 | `F` |
| !(x == 10) | `V` |

> Resultado == V

    !(x >= 2)

| Condição | Valor lógico |
| :--- | :---: |
| x >= 2 | `V` |
| !(x >= 2) | `F` |

> Resultado == F

```java
!(x <= 20 && x == 10)
```

| Condição | Valor lógico |
| :--- | :---: |
| x <= 20 | `V` |
| x == 10 | `F` |
| (x <= 20 && x == 10) | `F` |
| !(x <= 20 && x == 10) | `V` |

> Resultado: `V`

## Tabela verdade do operador "NÃO"

| A | !A |
| :---: | :---: |
| `F` | `V` |
| `V` | `F` |
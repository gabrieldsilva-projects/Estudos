# 📘 Expressões Lógicas

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

# Operadores lógicos

| Operador | Significado |
| :---: | :--- |
| `&&` | E (AND) |
| `||` | OU (OR) |
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
    x <= 20 && x == 10

| Tabela Verdade |
| :===: | :--- |
| X <= 20 | `Verdadeiro` |
| X == 10 | `Falso`|

> Resultado == F

    x > 0 && x != 3 

| Tabela Verdade |
| :---: | :--- | 
| x > 0 | `Verdadeiro` |
| x != 3 | `Verdadeiro`|

> Resultado == V

    x <= 20 && x == 10 && x != 3 

| Tabela Verdade |
| :---: | :--- | 
| X <= 20 | `Verdadeiro` | 
| x == 10 | `Falso` |
| x != 3 | `Verdadeiro`|

> Resultado == F

## Tabela verdade do operador "E" 

| A | B | A && B | 
| :---: | :---: | :--- | 
| `F` | `F` | `F` | 
| `F` | `V` | `F` | 
| `V` | `V` | `F` | 
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
    x == 10 || x <= 20 

| Tabela verdade | 
| :---: | :--- | 
| x == 10 | `F` |  
| x <= 20 | `V` | 

> Resultado == V 

    x > 0 || x != 3 

| Tabela veradade |
| :---: | :--- | 
| x > 0 | `V` |
| x != 3 | `V` |

> Resultado == V

    x <= 0 || x != 3 || x != 5

| Tabela veradade |
| :---: | :--- | 
| x <= 0 | `F` |
| x != 3 | `V` |
| x != 5 | `F` |

> Resultado == V

## Tabela verdade do operador "OU" 

| A | B | A && B | 
| :---: | :---: | :--- | 
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

| Tabela verdade | 
| :---: | :--- | 
| x == 10 | `F` |  
| **!(x == 10 )** | `V` | 

> Resultado == V

    !(x >= 2)

| Tabela verdade | 
| :---: | :--- | 
| x >= 2 | `V` |  
| **!(x >= 2 )** | `F` |

> Resultado == F

    !(x <= 20 && x == 10)

| Tabela verdade | 
| :---: | :--- | 
| x <= 20 | `V` |  
| x == 10 | `F` |  
| (x <= 20 && X == 10 )| `F` |
| **!(x <= 20 && X == 10 )** | `V` |

> Resultado == V

## Tabela verdade do operador "NÃO"

| A | !A | 
| :---: | | :--- | 
| `F` | `V` | 
| `V` | `F` |
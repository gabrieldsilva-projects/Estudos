# Prof° Dr. Nelio Alves

# Algoritmo

Sequência finita de instruções para resolver um problema.

## Exemplo: 

### Problema: Lavar roupa suja

### Algoritmo:
1) Coloca a roupa em um recipiente
2) Colocar um pouco de sabão e amaciante
3) Encher de água
4) Mexer tudo até dissolver todo o sabão 
5) Deixar de molho por vinte minutos
6) Esfregar a roupa
7) Enxaguar 
8) Torcer

# Automação

Consiste em utilizar máquina(s) para executar o procedimento desejado de fora automática ou semiautomática.

# O que é preciso para se fazer um programa de computador?

- Linguagem de programação: regras léxicas e sintáticas par se escrever o programa
- IDE: software para editar e testar o programa
- Compilador: software para transformar o código fonte em código objeto
- Gerador de Códigos ou Máquina Virtual: software que permite que o programa seja executado

## Linguagem de Programação

Conjunto de regras léxicas (ortografia) e sintáticas (grámatica) para se escrever programas.

## Exemplo de linguagem de programação :

- C#
- Java
- Python
- PHP
- JavaScript
- Ruby

## Léxica

Diz respito à correção das palavras "isoladas" (ortografia).

## Sintática 

Diz respeit à correção das sentenças (grámatica).

# Exemplo (Português) :                                       Linguagem de Programação :

O cachorro está com fome.                                     x = 2 + y; 
A cachorra está com fome. (Erro gramatical)                   x = + 2 y; (Erro de Sintaxe)

# IDE : Ambiente Integrado de Desenvolvimento 

Conjunto de software utiliazdo para a contrução de programas.

## Exemplos :

- C/C++ : Code Blocks
- Java : Eclipse, NetBeans
- C# : Microsoft Visual Studio

## Funcionalidades de uma IDE :

- Edição de código fonte (endentação, autocompletar, destaque de palavras, etc.)
- Depuração e testes
- Construção do produto final (build)
- Sugestão de modelos (teamplates)
- Auxiliar em várias tarefas do seu projeto.
- Etc.

# Compilação e Interpretação do Código Fonte e Objeto Máquina Vitual

# Código Fonte : 

Escrito pelo programador em linguagem de programação 

## Exemplo :

Linguagem Python:

Print("Olá Mendo")

# Compilação 
 ______________                             _______________                                            ___________________
|              |  COMPILADOR: compilação   |               |    Gerador de código: contrução (build)  |                   |
| CÓDIGO FONTE | ========================> | CÓDIGO OBJETO |  ======================================> | CÓDIGO EXECUTÁVEL | ==> EXECUÇÃO
|______________|       análise léxica      |_______________|              geração e código            |___________________|
                             +
                      análise sintática

# Interpretação

 ______________                                       
|              |    INTERPRETADOR: interpretação        
| CÓDIGO FONTE | ==================================>  Execução
|______________|          análise léxica
                                 +
                         análise sintática
                                 +    
                         geração de código
                            SOB DEMANDA


# Abordagem Híbrida

 ______________                                ______________                                       
|              |  COMPILADOR: precompilador   |              |    Máquina Vitrtual: interpretação                          
| CÓDIGO FONTE | ========================>    |   ByteCode   |  ===================================> EXECUÇÃO
|______________|       análise léxica         |______________|           geração e código            
                             +                                             SOB DEMANDA
                      análise sintática


## Vantagens :

### Compilação :

- Velocidade do programa
- Auxilio do compilador antes da execução 

### Interpretação :

- Flexibilidade de manutenção do aplicativo em produçaõ
- Expressividade da linguagem (Capaciadade de escrever uma solução elegante em poucas linhas)
- Código fonte não precisa ser recomplida para rodar em plataformas diferentes.
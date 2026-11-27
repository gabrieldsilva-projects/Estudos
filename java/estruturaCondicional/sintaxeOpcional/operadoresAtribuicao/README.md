 # 📘 Operadores de Atribuição

> Material de estudo baseado nas aulas do **Prof. Dr. Nélio Alves**.

Os operadores de atribuição atribuem um valor a uma variável. Além do operador simples `=`, Java oferece operadores compostos que atualizam o valor usando uma operação aritmética.

| Operador | Nome | Equivalente | Exemplo |
|---|---|---|---|
| `=` | Atribuição simples | `a = b` | `a = 10` |
| `+=` | Atribuição com soma | `a = a + b` | `numero += 5` |
| `-=​` | Atribuição com subtração | `a = a - b` | `numero -= 3` |
| `*=` | Atribuição com multiplicação | `a = a * b` | `numero *= 2` |
| `/=` | Atribuição com divisão | `a = a / b` | `numero /= 4` |
| `%=` | Atribuição com módulo | `a = a % b` | `numero %= 4` |

## Exemplo no Java

```java
public class OperadoresAtribuicao {
	public static void main(String[] args) {
		int numero = 10; // = atribui o valor inicial

		numero += 5; // igual a numero = numero + 5
		System.out.println("Depois de += 5: " + numero); // 15

		numero -= 3; // igual a numero = numero - 3
		System.out.println("Depois de -= 3: " + numero); // 12

		numero *= 2; // igual a numero = numero * 2
		System.out.println("Depois de *= 2: " + numero); // 24

		numero /= 4; // igual a numero = numero / 4
		System.out.println("Depois de /= 4: " + numero); // 6

		numero %= 4; // igual a numero = numero % 4
		System.out.println("Depois de %= 4: " + numero); // 2
	}
}
```

**Resumo:** `+=` soma, `-=` subtrai, `*=` multiplica, `/=` divide e `%=` guarda o resto da divisão. Cada operador composto armazena o resultado novamente na variável à esquerda.

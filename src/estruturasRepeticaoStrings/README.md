<!-- TOC -->
* [Estruturas de Repetição](#estruturas-de-repetio)
  * [Repetição condicional do tipo while...do](#repetio-condicional-do-tipo-whiledo)
  * [Repetição condicional do tipo do...while](#repetio-condicional-do-tipo-dowhile)
  * [Repetição contável do tipo for](#repetio-contvel-do-tipo-for)
  * [String](#string)
    * [Alguns métodos de String](#alguns-mtodos-de-string)
<!-- TOC -->
# Estruturas de Repetição
- Permitem que um bloco de comandos seja executado diversas vezes
- **Repetição condicional**: Executa um bloco de código enquanto uma condição for verdadeira
  - **Do...While**
  - **While...do**
- **Repetição contável**: Executa um bloco de código um número predeterminado de vezes
  - **For**
## Repetição condicional do tipo while...do
- Executa o bloco de instruções enquanto a condição for verdadeira
- A condição é uma expressão booleana que pode fazer uso de quaisquer operadores
- A condição deve sempre estar entre parênteses
- Pode omitir **{** e **}** caso execute somente uma instrução

````java
package estruturasRepeticaoStrings;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com um número inteiro positivo: ");
        int numero = teclado.nextInt();

        long fatorial = 1;
        while (numero > 0) {
            fatorial *= numero--;
        }
        System.out.println("O fatorial desse número é " + fatorial);
    }
}
````
- Evitar forçar loops infinitos
## Repetição condicional do tipo do...while
- Executa o bloco de instruções enquanto a condição for verdadeira
- **Garante que ocorrerá ao menos uma execução**
  - A verificação da condição é feita depois do bloco de instruções
- Valem as mesmas condições do while...do
## Repetição contável do tipo for
- Executa o bloco de instruções por um número predeterminado de vezes
- **Expressão de inicialização**
  - Utilizada para iniciar a variável de controle do loop (cursor)
  - Executada uma única vez, antes do primeiro loop
- **Expressão de condição**
  - Termina a execução do loop quando tiver o valor false
  - Verificada antes de cada loop
- **Expressão de incremento**
  - Pode incrementar ou decrementar a variável de controle (curso)
  - Executada no final de cada loop
- As expressões devem sempre estar entre parênteses e separadas por ponto-e-vírgula
- Pode omitir { e } caso execute somente uma instrução
## String 
- Classe em Java para representar variáveis textuais
- Possui uma variedade de métodos para manipulação de texto
- Métodos podem ser chamados a partir de uma variável ou do texto em si
  - `System.out.println(texto.charAt(2))`
  - `System.out.println("Texto".charAt(2))`
- Para manipulações mais eficientes com strings, veja a classe **StringBuffer**
### Alguns métodos de String
- `equals(Object)`
  - Informa se duas Strings são iguais
  - Ex: `"Flamengo".equals("flamengo")` -> false
  - Ex: `"Flamengo".equals("Flamengo")` -> true
- `length()`
  - Retorna o tamanho da String
  - Ex: `"Flamegon".length()` -> 8
- `concat(String)`
  - Concatena duas strings, de forma equivalente ao operador **+**
  - Ex: `"Fla".concat("mengo")` -> "Flamengo"
- `charAt(int)`
  - Retorna o caractere na posição informada
  - A primeira posição é zero
  - Ex: `"Flamengo".charAt(2)` -> 'a'
- `compareTo(String)`
  - Retorna 0 se as strings forem **iguais**, <0 se a string for lexicalmente menor e >0 se for lexicalmente maior que o parâmetro
  - Ex: `"Fla".compareTo("Flu")` -> -20
  - se for lexicalmente diferente, ele retorna a diferença entre as posições das letras, nesse exemplo, como o "a" é lexicalmente menor que o "u", então retorna a distância entre às duas, mas com o sinal **-**
- `compareToIgnoreCase(String)`
  - Idem ao anterior, sem considerar diferenças entre maiúsculas e minúsculas
  - Ex: `"Fla".compareToIgnoreCase("fla")` -> 0
- `indexOf(String, int)`
  - Busca pela primeira ocorrência de uma substring ou caractere a partir de uma posição informada
  - Retorna -1 se não encontrar a substring
  - Ex: `"Fla x Flu".indexOf("Fl", 0)` -> 0
  - Ex: `"Fla x Flu".indexOf("Fl", 1)` -> 6
- `substring(int,int)`
  - Retorna a substring que vai da posição inicial (inclusive) até a posição final (exclusive), ambas informadas
  - Ex: `"Flamengo".substring(3,6)` -> "men"
- `toLowerCase()`
  - Retorna a string em minúsculas
  - Ex: `"Flamengo".toLowerCase()` -> "flamengo"
- `toUpperCase()`
  - Retorna a string em maiúsculas
  - Ex: `"Flamengo".toUpperCase()` -> "Flamengo"
- `trim()
  - Remove espaços antes e depois da string
  - Ex: `" Flamengo ".trim()` -> "Flamengo"
- Ver os demais métodos em
  - (https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String.html)
- Documentação toda
  - (https://docs.oracle.com/en/java/javase/18/docs/api/index.html)
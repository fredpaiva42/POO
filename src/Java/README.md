# Java
<!-- TOC -->
* [Java](#java)
  * [Organização Geral de um Programa Java](#organizao-geral-de-um-programa-java)
  * [Regras Básicas](#regras-bsicas)
  * [Comentários](#comentrios)
  * [Quais são os tipos de dados disponíveis?](#quais-so-os-tipos-de-dados-disponveis)
  * [Números Inteiros](#nmeros-inteiros)
  * [Números Reais](#nmeros-reais)
  * [Outros tipos de dados](#outros-tipos-de-dados)
  * [Valores Padrão](#valores-padro)
  * [Declaração de variáveis](#declarao-de-variveis)
  * [Atribuição de valores](#atribuio-de-valores)
  * [Entrada de Dados](#entrada-de-dados)
  * [Saída de dados](#sada-de-dados)
<!-- TOC -->
## Organização Geral de um Programa Java
````java
import bibliotecaExterna;
class nomeDoPrograma {
    public static void main(String[] args){
        // Código do Programa
    }
}
````

## Regras Básicas
- **;** no final dos comandos
- **{}** delimitam blocos

## Comentários
- Comentários são trechos do programa voltados para a leitura por humanos, e ignorados pela JVM
- Existem diferentes formas de escrever comentários
- **/* COMENTÁRIO */**
  - Conhecido como comentário de bloco
  - Tudo entre /* e */ é ignorado pelo interpretador
- **// COMENTÁRIO**
  - Conhecido como comentário de linha
  - Tudo na linha após // é ignorado pelo interpretador

>**Note:** Exemplo de um programa java nessa pasta

## Quais são os tipos de dados disponíveis?
- Em Java, toda variável tem que ter um tipo
- Com isso, o computador pode **reservar o espaço correto de memória**
- Os tipos básicos podem ser divididos em dois grupos:
  - Tipos numéricos (Inteiro e Real)
  - Tipos não numéricos (caractere booleano)
- Também existe texto como tipo complexo (classe)
  - String

## Números Inteiros
- byte
  - 8-bits (aceita valores de -128 a 127)
- short
  - 16-bits (aceita valores de -32.768 a 32.767)
- int
  - 32-bits (aceita valores de -2.147.483.648 a 2.147.483.647)
- long
  - 64-bits (aceita valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
- Por padrão, qualquer número inteiro é do tipo int
  - Para forçar long, deve-se adicionar L ou l ao final (**123L**)

## Números Reais
- float
  - Precisão simples 32-bits (IEEE 754 SPFP)
  - Precisão de 7 casas decimais com magnitude de 10^38
- double
  - Precisão dupla 64-bits (IEEE 754 DPFP)
  - Precisão de 15 casas decimais com magnitude de 10^308
- Por padrão, qualquer número real é do tipo double
  - Para forçar float, deve adicionar F ou f ao final (**0.5f**)
- Notação científica pode ser utilizada (0.5e3)

## Outros tipos de dados
- char
  - Caractere 16-bit (Unicode)
- String
  - Texto de tamanho variável
- boolean
  - Tipo lógico, com valores **true** ou **false**

## Valores Padrão
- Algumas linguagens não limpam o espaço de memória ao alocar uma nova variável
- Java toma esse cuidado para nós
  - Tipos numéricos são inicializados com 0
  - Tipo char é iniciado com '\u0000'
  - Tipo booleano é inicializado com false
- De qualquer forma, sempre inicialize as suas variáveis por precaução

## Declaração de variáveis
- Para serem usadas, as variáveis precisam ser declaradas (criadas)
- Toda variável é declarada da seguinte forma:
  - `TIPO NOME = VALOR INICIAL;`
  ou
  - `TIPO NOME1, NOME2, ...;`
- Os tipos são os que já vimos, assim como os valores iniciais possíveis
- Os nomes devem respeitar algumas regras
  - São case-sensitive
  - Podem ter tamanho ilimitado
  - Devem começar com letra, seguida de letras ou números
  - Não pode ter espaço nem acentos
  - Não podem ser uma palavra reservada da linguagem
- Usualmente nomes compostos de variáveis seguem a notação **Camel Case** inciando com minúsculas, com conectores (de, e, ou, etc.) omitidos e demais palavras concatenadas iniciando com maiúsculas
- Um caso especial é referente a variáveis que nunca trocam de valor
  - Mais conhecidas como **contantes**
- Em Java, constantes são identificadas com o modificador **final** antes do tipo
- Usualmente, os nomes de constantes são em maiúsculas com as palavras separadas por **underscore (_)** quando for um nome composto

## Atribuição de valores
- Em Java, o operador de igualdade (**=**) é usado para atribuir valores à variáveis
- Sempre na forma: `variável = valor ou expressão`
  - A expressão do lado direito é avaliada
  - O valor gerado é atribuído à variável

## Entrada de Dados
- Para entrada de dados, é necessário usar uma classe externa responsável por interpretar o que foi escrito
  - **java.util.Scanner**
- Para não ter que escrever o nome completo da classe a cada uso, é possível **importar a classe** para o programa
  - `import java.util.Scanner;`
  -  A partir desse momento, a máquina virtual java sabe onde encontrar a classe (no pacote java.util), e nós podemos chamá-la somente pelo nome Scanner
- Além de importar a classe Scanner, é necessário criar uma variável que permita acessá-la
  - `Scanner input = new Scanner(System.in)`
  - A leitura só ocorre de fato após o usuário teclar Enter

## Saída de dados
- A saída de dados é mais simples, acessando direto a classe que representa o sistema
  - **java.lang.System**
- O pacote java.lang não precisa ser importado, pois é visível automaticamente a todos os programas
- A partir dessa classe System, e possível escrever qualquer tipo de dados (x)
  - `System.out.print(x)`
  - `System.out.println(X)` pula a linha após a impressão
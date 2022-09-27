# Operadores e Estruturas de Decisão
<!-- TOC -->
* [Operadores e Estruturas de Decisão](#operadores-e-estruturas-de-deciso)
  * [Operadores Aritméticos](#operadores-aritmticos)
  * [Type Casting](#type-casting)
  * [Funções Matemáticas](#funes-matemticas)
  * [Números aleatórios](#nmeros-aleatrios)
  * [Operadores relacionais](#operadores-relacionais)
  * [Operadores lógicos](#operadores-lgicos)
  * [Ou e E otimizados](#ou-e-e-otimizados)
  * [Decisão](#deciso)
    * [Decisão do tipo if...then](#deciso-do-tipo-ifthen)
    * [Decisão do tipo if...then...else](#deciso-do-tipo-ifthenelse)
    * [Decisão do tipo switch...case](#deciso-do-tipo-switchcase)
<!-- TOC -->
## Operadores Aritméticos
- Operadores com a mesma prioridade (precedência)
  - são analisados da esquerda para a direita
- Aritméticas de inteiros
  - Numerador e denominador inteiros
  - Resultado é somente a parte inteira da divisão
- Aritmética em modo misto
  - Numerador ou denominador real
  - Resultado real
## Type Casting
- Em algumas situações o programador deseja transformar o tipo de uma expressão
  - Para isso, basta preceder a expressão por "(tipo)"
  - **Type casting** tem prioridade superior a **(*, /, e %)**
## Funções Matemáticas
- A classe Math
  - Contém constantes (PI e número de Euler)
  - Contém diversas funções matemáticas
  - Não é necessário importar o seu pacote, java.lang, pois está sempre disponível
- Constantes
  - Math.PI = 3.141592653589793
  - Math.E = 2.718281828459045
- Tabela de algumas funções matemáticas:
  - 
| Método                 | Descrição                  |
|------------------------|----------------------------|
| `Math.abs(exp)`        | Valor absoluto             |
| `Math.round(exp)`      | Arredonda um número        |
| `Math.ceil(exp)`       | Arredonda para cima        |
| `Math.floor(exp)`      | Arredonda para baixo       |
| `Math.max(exp1, exp2)` | Maior de dois números      |
| `Math.min(exp1, exp2)` | Menor de dois números      |
| `Math.sqrt(exp)`       | Raiz quadrada              |
| `Math.pow(exp1, exp2)` | Potência                   |
| `Math.log10(exp)`      | Logaritmo na base 10       |
| `Math.log(exp)`        | Logaritmo natural (base E) |
| `Math.exp(exp)`        | Exponencial (e^exp)        |
- Funções trigonométricas trabalham com radianos
## Números aleatórios
- Algumas aplicações necessitam que o computador sorteie um número
  - Método `Math.random()`
  - Gera número pseudo aleatório entre 0 e 1
- A partir desse número é possível gerar números em outros intervalos
  - inicio + (fim - inicio) * Math.random()
  - Exemplo:
    - Número entre 0 e 1: `Math.random()`
    - Número entre 5 e 6: `5 + Math.random()`
    - Número entre 0 e 10: `Math.random() * 10`
    - Número entre 50 e 70: `50 + Math.random() * 20`
## Operadores relacionais
- Prioridade sempre inferior aos operadores aritméticos
- Sempre tem **números como operandos**
- Sempre tem **resultado booleano**
## Operadores lógicos
- Prioridade sempre inferior aos operandos relacionais
- Exceção para **!**, com prioridade superior a **(*, / e %)**
- Sempre tem **booleanos como operandos**
- Sempre tem **resultado booleano**
- Tabela verdade:
  
| A     | B     | !A    | A & B<br/> A && B | A ^ B | A OR B |
|-------|-------|-------|-------------------|-------|--------|
| true  | true  | false | true              | false | true   |
| true  | false | false | false             | true  | true   |
| false | true  | true  | false             | true  | true   |
| false | false | true  | false             | false | false  |
## Ou e E otimizados
- & e &&, assim como | e || têm a mesma tabela verdade, mas
  - & e | sempre avaliam os dois operandos
  - && e || só avaliam o segundo operando se o primeiro não for conclusivo
## Decisão
- if..then
  - Executa algo somente quando uma condição é verdadeira
- if...then...else
  - Bifurca a execução do código em função de uma condição
- Switch...case
  - Executa múltiplos trechos de código em função do valor de uma expressão
### Decisão do tipo if...then
- Executa o bloco de instruções somente se a condição for verdadeira
- A condição é uma expressão booleana que pode fazer uso de quaisquer operadores
- A condição deve sempre estar entre parênteses
- Pode omitir "{" e "}" caso execute somente uma instrução
  - As variáveis declaradas dentro de um bloco (entre { e }) só valem nesse bloco ou sub-blocos
### Decisão do tipo if...then...else
- Executa um ou outro bloco de instruções em função da condição ser verdadeira, ou falsa
- Valem as mesmas regras if...then
- Qualquer combinação de instrução individual ou em bloco é aceita no then e no else
- Podem ser aninhados com outras estruturas do tipo if...then...else
### Decisão do tipo switch...case
- Aceita expressões dos tipos byte, short, int, char, e String
- É equivalente a if aninhado
  - Escolher o que tem melhor legibilidade
  - Switch...case é baseado em valores individuais
  - if..then...else pode ser baseado em intervalo de valores
- O uso de **break** é fundamental para a quebra de fluxo
  - A clausula **case** delimita somente o ponto de entrada
  - O programa executará todas as linhas seguintes até encontrar um **break** ou terminar o **switch**

# Variáveis Compostas
<!-- TOC -->
* [Variáveis Compostas](#variveis-compostas)
  * [Vetores](#vetores)
    * [Declaração de vetores](#declarao-de-vetores)
    * [Utilização de vetores](#utilizao-de-vetores)
  * [Matrizes](#matrizes)
<!-- TOC -->
- É possível definir variáveis que guardam mais de um valor de um mesmo tipo
- Essas variáveis são conhecidas como **variáveis compostas**, **variáveis subscritras**, **variáveis indexáveis** ou **arranjos** (array)
- Existem dois tipos principais de variáveis compostas:
  - Vetores
  - Matrizes
## Vetores
- Variável composta **unidimensional**
  - Contém espaço para armazenar diversos valores de um mesmo tipo
  - É acessada via índice
- A ideia de vetor é comum na matemática, com o nome de variável subscrita
  - Exemplo: x1, x2,..., xn
- O que vimos até agora são variáveis com somente um valor
  - Exemplo: x = 123
- No caso de vetores, uma mesma variável guarda ao mesmo tempo múltiplos valores
  - Exemplo: x1 = 123, x2 = 456, ...
### Declaração de vetores
- Forma geral:
  - `TIPO[] NOME = new TIPO[TAMANHO];`
  - `TIPO[] NOME;` e depois atribuir o tamanho: `NOME = new TIPO[TAMANHO]`
- Exemplos
````java
class Exemplo {
    String[] nomes = new String[40];
    float[] notas = new float[40];
    boolean presenca = new boolean[5];
}
````
- É possível saber o tamanho de um vetor acessando a propriedade **length**
  - Exemplo: `notas.length` -> 40
- No Java, todo vetor inicia na posição 0 (zero) e termina na posição length - 1
  - Exemplo: `float[] notas = new float[3];` -> inicia no 0 e termina no 2
### Utilização de vetores
- Também é possível iniciar os valores de vetores diretamente no código, colocando-os entre chaves, separados por vírgula
````java
class Exemplo {
    float[] notas = {8, 5.5f, 1.5f};
    float media = (notas[0] + nota[1] + notas[2])/3;
}
````
- Outra possibilidade é de iterar por todos os seus valores
````java
class Exemplo{
    float[] notas = new float[40];
    for (int i = 0; i < notas.length; i++){
        System.out.println(notas[i]);
    }
}
````
## Matrizes
- Variável composta **multidimensional**
  - É equivalente a um vetor, contudo permite a utilização de diversas dimensões acessadas via diferentes índices
  - Pode ser pensada como um vetor cujo tipo é outro vetor, recursivamente
  - Em diversas situações matrizes são necessárias para correlacionar informações
- Exemplo motivacional
  - Assumindo que **um aluno é avaliado com três notas**, seria necessário um vetor de três posições para guardar as notas de um aluno
  - Contudo, assumindo que **uma turma tem cinco alunos**, seria necessária uma matriz bidimensional para guardar as notas de todos os alunos de uma turma
````java
class Exemplo {
  float [][] notas = new float[5][3]; // Declaração
  System.out.println(nota[1][0]); // Acessando dado da matriz linha 1 e coluna 0
````
  - Ainda, assumindo que **uma disciplina tem duas turmas**, seria necessária uma matriz tridimensional para guardar as notas de todos os alunos de todas as turmas da disciplina;
````java
class Exemplo{
    float[][][] = notas = new float[2][5][3];
    System.out.println(notas[0][1][0]); // imprime a nota 0 do aluno 1 da turma 0
}
````
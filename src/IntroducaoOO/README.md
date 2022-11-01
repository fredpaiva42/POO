# Introdução a Orientação a Objetos

## Paradigma Procedimental vs OO
- O paradigma procedimental organiza o programa em termos de **algoritmos**.
- O paradigma OO organiza o programa em termos de **objetos**.

## Paradigma de Orientação a Objetos
- Principais nomes:
  - Bosch
  - Jacobson
  - Rumbaugh
- Passos:
  - **OOA** (Object-Oriented Analysis) - Análises
    - **CRC** (Class-Responsibility-Collaboration)
    - **Use case**
    - **Robustness diagram**
  - **ODD** (Object-Oriented Design) - Projetar/Projeto
  - **OOP** (Object-Oriented Programming) - Implementação
- **UML**: Unified Modeling Language
  - Things
  - Relationships
  - Diagrams

## Objetos
- **Definição**:
  - Um objeto é a **representação computacional de um elemento ou processo do mundo real**.
  - Cada objeto possui suas **características** e seu **comportamento**.
  - Exemplos de Objetos: cadeira, mesa, caneta, lápis, carro, piloto, venda, programa, cliente.
## Características de Objetos
- **Definição**:
  - Uma característica descreve uma propriedade de um objeto, ou seja, algum elemento que descreva o objeto.
  - Cada característica é chamada de **atributo** e funciona como uma **variável** pertencente ao objeto.
  - Exemplo de características do objeto carro:
    - cor
    - marca
    - número de portas
    - Ano de fabricação
    - Tipo de combustível
## Comportamento de Objeto
- **Definição**:
  - Um comportamento representa uma ação ou resposta de um Objeto a uma ação do mundo real.
  - Cada comportamento é chamado **método** e funciona como um **procedimento/função** pertencente ao objeto.
  - Exemplos de comportamento para o objeto carro:
    - Acelerar
    - Frear
    - Virar para a direita
    - Virar para a esquerda
## Mapeamento de Objetos
- Objeto no mundo real:
  - Características
  - Comportamento
- Objeto computacional
  - Atributos
  - Métodos
## Paradigma Procedimental vs OO (Exemplo: Agenda)
- **Paradigma Procedimental**:
  - Variáveis
    - Vetor de nomes
    - Vetor de endereços
    - Vetor de telefones
  - Procedimentos
    - Listagem de todos os nomes
    - Listagem do endereço dado um nome
    - Listagem do telefone dado um nome
    - Adição de nome, telefone e endereço
    - Remoção de nome, telefone e endereço
- **Paradigma OO**
  - Objeto Agenda
    - Atributo
      - Vetor de Contatos
    - Métodos
      - Listagem de Contatos
      - Adição de um Contato
      - Remoção de um Contato
- Objeto Contato
  - Atributos
    - Nome
    - Endereço
    - Telefone
  - Métodos
  - Exibição de nome, endereço e telefone
  - Edição de nome, endereço e telefone
- Exemplo **total da compra** OO:
  - Como obter o total da compra?
    1. O objeto **Caixa** pediria ao objeto **Pedido** seu valor total
    2. O objeto **Pedido**, por sua vez, percorreria todos os seus objetos **Item** perguntando o seu valor subtotal e somaria esses valores para responder ao objeto **caixa**.
    3. Cada objeto **Item** perguntaria ao objeto **Produto** o seu preço e multiplicaria esse preço pela quantidade que está sendo comprada, para responder o objeto **Pedido**.
## Classes
- A classe descreve as características e comportamento de um conjunto de objetos
  - Em Java, **cada objeto pertence a uma única classe**
  - O objeto possuíra os atributos e métodos definidos na classe
  - O objeto é chamado de instância de sua classe
  - A classe é o bloco básico para a construção de programas OO
- Exemplo de Classe
````java
public class Carro {
    /*
       Atributos (características) são variáveis globais acessíveis por todos os métodos da classe
     */
    private int velocidade;
    
    public void acelera() {
        velocidade++;
    }
    
    public void freia(){
        velocidade--;
    }
}
````
### Classes vs Objetos
- A classe é o tipo do Objeto
- Valores têm tipos primitivos
  - 123 é um valor inteiro
  - True é booleano
  - 12,3 é um valor real
- Objetos pertencem a classes
  - Flamengo e Fluminense são da classe Time
- Uma **classe é uma forma**, capaz de **produzir objetos**
- Os **programadores criam classes**, as **classes instanciam objetos**
### Criação de objetos
- A classe é responsável pela criação de seus objetos via método construtor
  - Mesmo nome da classe
  - Sem tipo de retorno
````java
public Carro(int velocidadeInicial){
    velocidade = velocidadeInicial;
}
````
- Objetos devem ser instanciados antes de ser utilizados
  - O comando **new** instancia um objeto, chamando o seu construtor
````java
public class Carro {
    public Carro(int velocidadeInicial){
        velocidade = velocidadeInicial;
    }
    
    Carro fusca = new Carro(10);
    Carro bmw = new Carro(15);
    fusca.freia();
    bmw.acelera();
    fusca = bmw; // aqui é como se tivesse passando o endereço do objeto bmw
}
````
- Valor _null_:
  - Utilizado para representar um objeto não inicializado
  - Quando um método retorna um objeto, ele pode retornar _null_ para indicar, por exemplo, que o objeto não foi encontrado.
  - É possível atribuir _null_ para descartar um objeto previamente instanciado
- Exemplo:
````java
public class Carro {
    Carro fusca = new Carro(10);
    fusca.acelera();
    fusca = null;
}
````
## Pacotes
- Utilizado para agregar classes relacionadas
- O pacote de uma classe é indicado na primeira linha da classe
  - Declaração _package_
- Se uma classe não declara seu pacote, o interpretador assume que a classe pertence a um pacote _default_
````java
package br.uff.ic;
public class Pessoa {
    
}
````
- Modificadores permitem que determinadas classes sejam visíveis apenas para outras classes do mesmo pacote
- Sempre que for usar uma classe de outro pacote, é necessário importar
- A importação se realiza através da palavra-chave _import_, seguida do nome da classe desejada
  - As importações são apresentadas antes da declaração da classe, mas depois da declaração do pacote
  - A importação de um pacote **não importa** os subpacotes recursivamente
````java
package br.uff.ic.prog1;
import java.util.Scanner;
public class Fisica {
    
}
````
### Regra de ouro para classes e pacotes
- Classes devem ser mapeadas em arquivos com o mesmo nome
  - Classe **Pessoa**
  - Arquivo **Pessoa.java**
- Pacotes devem ser mapeados em diretórios
  - Pacote **br.uff.ic**
  - Diretório **br\uff\ic**
- Se o nome completo da classe é **br.uff.ic.Pessoa**
  - Deve haver **br\uff\ic\Pessoa.java**
## Atributos e Métodos
### Modificadores
- Atributos e métodos podem ter diferentes visibilidades e escopos
  - Estamos até agora usando somente os modificadores _public static_
  - O que significam esses modificadores?
  - Quais outros modificadores existem?
### Modificador de visibilidade
- Indica quem pode acessar o atributo ou método:
  - O modificador **private** indica que o atributo ou método pode ser chamado apenas por outros métodos da própria classe
  -  A ausência de modificador é conhecida como **package**, e indica que o atributo ou método pode ser chamado somente por classes do mesmo pacote
  - O modificador **protected** indica que o atributo ou método pode ser chamado somente por classes do mesmo pacote, ou subclasses;
  - O modificador **public** indica que o atributo ou método pode ser chamado por qualquer outra classe
### Modificador de escopo
- Indica a quem pertence o método (Ou atributo)
  - Ao objeto (instância)
  - À classe como um todo (compartilhado para todas as instâncias)
  - Atributos ou métodos estáticos (static) pertencem à classe como um todo
    - Podem ser chamados diretamente na classe sem a necessidade de instanciar objetos
    - Métodos estáticos só podem manipular atributos estáticos
  - A ausência do modificador _static_ indica que o atributo ou método é de instância
## Passagem por valor vs. Passagem por referência
- Algumas linguagens permitem passagem de argumentos por referência
  - Não é o caso de Java, que faz sempre passagem por valor
- Diferenças
  - Passagem por valor = cópia dos valores para outra posição da memória
  - Passagem por referência — reuso da posição de memória
- Variáveis que contêm tipos primitivos (byte, short, int, long, float, double, char, boolean) sempre ocupam diretamente uma posição na memória
- Variáveis que contêm objetos, na verdade, guardam a posição de memória dos objetos
- Quando é passado um objeto por valor a referência é copiada
  - Mudanças nos atributos dos objetos são vistas de fora
  - Instanciações de novos objetos nas variáveis não são vistas de fora
## Classes são tipos
- Classes podem ser utilizadas como
  - Tipos dos atributos de uma outra classe
  - Parâmetros de um método
  - Tipo de retorno de um método
````java
class Time {
    private Jogador[] jogadores;
    public Jogador getJogador(int numero){}
    public void escala(Jogador jogador){}
}
class Jogador{
    private Time time;
}
````

## Interpretando uma descrição
- Quebrar ela em propriedades e comportamentos
- Traduzir essas propriedades e comportamentos em atributos e métodos

## Construtores
- Uma classe pode ter vários construtores
- Se não criarmos nosso construtor o Java cria um para a classe
- Ele deve ter o mesmo nome da classe
- Ele pode aceitar argumentos
- Ele não possui nenhum tipo de retorno (incluindo o void)

## Encapsulamento
- É a técnica de limitar a visibilidade de uma classe para outra, restringindo quais atributos e métodos outras classes podem ver
- Os atributos não devem ser manipulados diretamente
- Os atributos somente devem ser alterados ou consultados através dos métodos do objeto

## Modificadores de Acesso
- _public_: Visível para qualquer classe
  - é menos seguro
  - Métodos são tipicamente _public_
- _package_: Visível para o diretório atual
  - Não é necessária nenhuma palavra-chave para esse nível de acesso
- _private_: Visível apenas para a classe atual
  - é mais seguro
  - Atributos são tipicamente _private_

## Métodos Getter
- Quando um atributo é private, ele não pode ser:
  - Lido
  - Modificado
- No entanto, em alguns casos é desejável que uma classe saiba pelo menos o valor dos atributos de outra classe
  - Um prisioneiro deve saber ao menos o nome de sua cela
  - É necessário que o prisioneiro possa ler o atributo nome de sua cela
- Getter métodos resolvem isso
- Também são chamados de accessors
- São públicos
- Geralmente não possuem argumentos
- Getters retornam o valor de uma variável particular
  - A maioria das variáveis private precisam de um método getter

## Métodos Setter
- Em outros casos, é desejável que uma classe possa modificar um atributo de outra classe
- No entanto, existe uma maneira segura de fazer isso
- Por exemplo:
  - Um guarda deve ser capaz de abria a porta da cela, mas um prisioneiro não
  - O saldo de uma conta do banco não deve ficar abaixo de 0
- Métodos setter proporcionam uma solução para isso
- Setters são chamados também de mutators
- Setter geralmente são públicos
- Setters geralmente aceitam argumentos
- Geralmente são do tipo void

## Benefícios da ArrayList
- Tamanho dinâmico:
  - Um ArrayList pode ser aumentado adicionado elementos
  - Um ArrayList pode ser diminuído removendo elementos
- Já tem seus métodos:
  - Um ArrayList já tem seus métodos para executar operações
  - Por exemplo, add, pegar, ou remover um elemento

## Exception
- Uma exceção é um erro que ocorre durante a execução de um programa que modifica o fluxo normal do programa
- Se uma exceção ocorre, o programa é terminado
- Uma stack trace, com os detalhes da exceção, é printada no console
- Quando o java encontra um erro ou condição que altera a execução normal, o Java "throws" an exception
- Se a exceção não for capturada pelo programador, o programa quebra
- Java possui duas categorias de Exceção:
  - Exceções verificadas:
    - O compilador verifica e lida com exceções
    - Se a exceção não é tratada pelo programa, então ele dá um erro de compilação
    - Exemplos:
      - FileNotFoundException, IOException
  - Exceções não verificadas:
    - Compilador não verifica e lida com as exceções
    - Examples:
      - ArrayOutOfBoundsException, NullPointerException, ArithmeticException
````java
try{
    
}catch(ExceptionType ex){
    
}
````
- ArrayOutOfBoundsException
  - Tentativa de acesso a um index não existente
- NullPointerException
  - Tentativa de usar a referência de um objeto sem que ele tenha sido instanciado
- IOException
  - Falha ou interrupção de operações I/O

### Boas práticas para tratar exceções
- Tente ser mais específico possível com o tipo de erro que você está tentando tratar
- Catch uma exceção genérica é frequentemente impreciso, mas pode ser usado como último recurso

## Abstração
- A representação computacional do objeto real deve se concentrar nas características que são relevantes para o problema

## Objeto
- Um objeto é a representação computacional de um elemento ou processo do mundo real
- Cada objeto possui suas características e seu comportamento
- Caracteristica descreve uma propriedade do objeto, ou seja algum elemento que descreva o objeto
- Comportamento representa uma ação ou resposta de um objeto a uma ação do mundo real

## Classe
- É o tipo do objeto
- A classe descreve as características e comportamento de um conjunto de objetos
- Cada objeto pertence a uma única classe
- O objeto possuirá os atributos e métodos definidos na classe
- O objeto é chamado de instância de sua classe
- A classe é o bloco básico para a construção de programas OO

## Modularidade
- O sistema deve ser composto de objetos altamente coesos e francamente acoplados
- coesão: métodos e atributos devem fazer sentido no contexto do problema, capacidade medir o quanto uma determinada classe ou objeto fazem sentido
- acoplados: conexão entre as classes
- objetos colaboram através de chamadas de métodos uns dos outros

## Polimorfismo
- Poli (muitos) formismo(formas)
- Uma subclasse pode redefinir (sobrescrever) um método herdado
- Se realiza através da recodificação de um ou mais métodos herdados por uma subclasse
- Em tempo de execução o java sabe qual implementação deve usar

## Interface
- A interface define as reponsabilidades de uma classe
- As responsabilidades são mapeadas em métodos
- A classe que implementa a insterface implementa os métodos
- A interface contém somente assinatura de métodos e constantes
- A interface possui apenas métodos sem implementação (abstratos) e constantes

## Classes abstratas
- Se uma classe possui algum método sem implementação (abstrato), o modificador abstract deve preceder sua declaração
- não podem instanciar objetos
- Devem ser vistas como templates para subclasses que irão dar uma implementação aos métodos abstrato

## Diferença entre error e exception
- O erro indica problemas que ocorrem principalmente devido à excassez de recursos do sistema
- Não é possível recuperar de um error
- No java, todos os errors não verificados
- O sistema no qual o programa está sendo executado é responsável por erros
- São descritos no pacote java.lang.Error
- Exceções:
  - São problemas que podem aparecer em tempo de execução e em tempo de compilação
  - é possível recuperar de uma exceção
  - No java, as exceções podem ser verificadas e não verificadas
  - O código do programa é responsável por exceções
  - Eles são descritos no pacote java.lang.Exception
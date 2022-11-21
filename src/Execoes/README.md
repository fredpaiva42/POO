# Tratamento de Exceções
## Exceções
- Conceito
  - Exceções representam situações de erro tratáveis, ocorridas durante a execução de um programa
  - Exemplos de exceções são divisão por zero ou incapacidade de ler dados de um arquivo
- Geradores de exceções
  - Interpretador Java: quando percebe uma situação de erro padrão (divisão por zero, falha de segurança,...)
  - Métodos do programa: quando percebe uma situação de erro interna do programa (informação inválida,...)
## Hierarquia de Exceção
````mermaid
flowchart TD
    Object --> Throwable
    Throwable --> |Não devemos tratar| Error
    Throwable --> |Devemos tratar| Exception
    Error --> OutOfMemoryError
    Error --> StackOverflowError
    Error --> LinkageError
    Exception --> RuntimeException
    Exception --> IOException
    IOException --> FileNotFoundException
    IOException --> SocketException
    RuntimeException --> IllegalArgumentException
    RuntimeException --> ArithmeticException
    RuntimeException --> IndexOutOfBoundsException
    IndexOutOfBoundsException --> ArrayIndexOutOfBoundsException
    IllegalArgumentException --> NumberFormatException
````
## Tipos de Exceção
- Descrição de alguns tipos de exceções:
  - Error: erro genérico (não devemos tratar)
  - Exception: exceção genérica (devemos tratar suas subclasses)
  - RuntimeException: exceção detectada em tempo de execução — não é indicada pela IDE durante a compilação
  - IOException: erros de entrada e saída
  - ArithmeticException: erro de cálculo algébrico (ex: divisão por zero)
  - NullPointerException: erro de acesso a variável nula
  - SQLException: erro de acesso a banco de dados
- Diversos métodos das bibliotecas Java geram exceções
  - Estas exceções devem ser tratadas pelas classes que utilizem as classes das bibliotecas
## Tratamento de Exceções
- A palavra reservada _throws_, seguida pela classe de exceção gerada deve ser indicada no cabeçalho de um método que gere uma exceção
- Os comandos _try-catch-finally_ executam um código que pode gerar exceções de maneira segura, realizando o tratamento das exceções
````java
public int gravaRegistro() throws IOException{
    // código que gera a exceção
    try{
        //código que pode disparar exceções
    } catch(Excecao1 e){
        // código executado caso o código no bloco try
        // dispare uma exceção do tipo Excecao1
    }finally {
        //código executado sempre, mesmo que tenha ocorrido
        // uma exceção no bloco try
    }    
}
````
- A ocorrência de uma exceção transfere o fluxo de execução para o primeiro catch que trate a exceção
- Após o tratamento da exceção no catch, o fluxo é transferido para o finally do mesmo grupo try-catch-finally
- O finally é executado sempre, tendo ou não exceção, sendo útil para fechar o arquivo, transação, etc.

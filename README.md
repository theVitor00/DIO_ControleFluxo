# Desafio Controle de Fluxo

---

## Proposta
	
	Origem: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo


Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

- Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
- Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"

1. Crie o projeto DesafioControleFluxo
2. Dentro do projeto, crie a classe _Contador.java_ para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe _ParametrosInvalidosException_ que representará a exceção de negócio no sistema.


## Sobre a Resolução


Considerei um exercício relativamente simples. Por não ter muita margem para fazer diferente do solicitado, decidi fazer
uma abordagem conservadora durante a resolução. O repositório da proposta já dava a resposta praticamente pronta, só precisei
adicionar a camada de validação das entradas e completar o método. Ainda assim, este foi o passo a passo para a solução do problema:

1. Importação do método System() para o recebimento de valores via terminal;
2. Criação da classe Contador e do método main;
3. Complemento dos trechos responsáveis pelas entradas de dados;
```
Scanner scan = new Scanner(System.in);
int parametroUm, parametroDois;

System.out.print("Digite o primeiro parâmetro: ");
parametroUm = scan.nextInt();
System.out.print("Digite o segundo parâmetro: ");
parametroDois = scan.nextInt();
```
obs: optei por declarar as variáveis antes de inicializá-las com algum valor, pois acredito que isso facilita a leitura do código.
4. Criação da classe ParametrosInvalidosException, estendendo a classe Exception, com o intuito de lançar uma exceção personalizada;
5. Configurar o catch para que este receba a Exceção personalizada, e a trate adequadamente;
```
System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
```
6. Complemento do método contar(), lançando nossa exceção personalizada em caso de falha de validação dos dados de entrada;

```
 if (parametroDois < parametroUm) throw new ParametrosInvalidosException()
```
7. Na sequência, depois de calcular a diferença entre os números inseridos, fiz um laço for sobre o range desse número, como solicitado pelo enunciado.
8. Por fim, exibi as informações. Pesquisando sobre _interpolação de strings_ em Java, o melhor que encontrei foi o uso do printf. Resolvi usar esse método para me familiarizar. Para não iniciar a exibição da contagem pelo número Zero, realizei a adição de +1 ao número exibido da vez.
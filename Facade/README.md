# Facade

## Intenção

  O padrão de projeto Facade ou também conhecido como "Fachada" tem a intenção de fornecer uma interface unificada para um conjunto de interfaces em um subsistema complexo apenas implementando uma classe que fornece uma interface única e mais razoável. 

## Propósito
  Ele define uma interface de mais alto nível permitindo que um subsistema utilizado por sistema-cliente seja mais fácil de utilizar e ser acessado. Portanto, seu objetivo é implementar uma forma de interagir com um sistema que seja mais fácil do que a atual, com a intenção de usar um subconjunto do sistema em questão e com isso facilitar também a sua reutilização dentro do código.

## Aplicabilidade
  É comumente aplicado quando:
* Se deseja uma interface simplificada para um subsistema muito complexo. 
* São muitas as dependências entre clientes e classes de implementação.
* Há o interesse em dividir seus subsistemas em camadas.

## Consequências
* Torna o sistema mais fácil de se usar, protegendo os clientes dos componentes do sistema, reduzindo o número de objetos com que terão que lidar.
* Promove fraco acoplamento entre os subsistemas e seus clientes.
* Não evita que as aplicações possam acessar as subclasses do subsistema diretamente, pode-se escolher entre a facilidade de uso ou a generalidade.

## Exemplo prático

  À respeito do exemplo prático, uma vez que o padrão Facade consiste no uso de subpartes de um sistema através de uma fachada, pensou-se em um subsistema responsável por ler o "ranking" de um certo jogo. Ranking este que está salvo previamente em um arquivo de texto.
Como classes utilizadas temos:

* AbrirArquivotexto;
* Ranking;
* ComparadorRanking;
* Main;

  Nesse contexto, Temos como implementação do padrão de projeto em questão, as classes "AbrirArquivotexto" e "Ranking", sendo a classe ComparadorRanking apenas uma classe auxiliar a nível de comparação das informações obtidas no arquivo. Cada uma delas funciona como uma interface simplificada para as demais classes que as utilizam.

  A classe "AbrirArquivotexto" funciona como uma fachada para a classe "Ranking" que utiliza seus serviços, porém não necessita "conhecer" quais são e nem a complexidade de seus processos. Da mesma forma, funciona a classe "Ranking" para a classe em um nível mais alto de abstração que irá utilizá-la. Classe essa que no exemplo cedido é a "Main", mas que facilmente poderia ser qualquer outra classe no contexto de um jogo.

  Vale ressaltar ainda a independência das classes, de modo que a classe "AbrirArquivotexto" poderia ser utilizada no contexto de qualquer aplicação que exigisse a leitura de informações de um arquivo de texto, assim como a classe "Ranking" poderia ser utilizada em qualquer jogo que tivesse o mesmo funcionamento de ranking descrito no exemplo, Demonstrando assim, a alta capacidade de reutilização das "fachadas" provenientes desse padrão de projeto.


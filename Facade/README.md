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

# Consequências
* Torna o sistema mais fácil de se usar, protegendo os clientes dos componentes do sistema, reduzindo o número de objetos com que terão que lidar.
* Promove fraco acoplamento entre os subsistemas e seus clientes.
* Não evita que as aplicações possam acessar as subclasses do subsistema diretamente, pode-se escolher entre a facilidade de uso ou a generalidade.

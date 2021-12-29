# Chain Of Responsibility 

## Intenção
Evitar o acoplamento do remetente de uma solicitação ao seu destinatário, dando a mais de um objeto a chance de tratar a solicitação. Encadeia os objetos receptores e passa a solicitação ao longo da cadeia até que um objeto a trate.

## Propósito
Permitir que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.

## Aplicabilidade
Use o Chain Of Responsibility quando:
* Seu sistema precisa processar uma requisição em várias etapas diferentes e você não quer criar uma ordem rígida para o processamento. O chain of responsibility permite que você altere a ordem dos objetos na cadeia facilmente (mesmo assim, mantendo uma ordem específica);
* Você quer aplicar o princípio da responsabilidade única para tratamento de dados da requisição. Cada objeto fica responsável por tratar apenas a parte que lhe couber;
* Você quer permitir que os objetos responsáveis pelo tratamento de requisição possam variar em tempo de execução.

## Consequências
O que é bom ou ruim no Chain Of Responsibility:
Bom:
* Aplica o princípio da responsabilidade única (SRP)
* Aplica o princípio do aberto e fechado (OCP)
* Permite que você altere a cadeia de objetos e a ordem das chamadas facilmente
Ruim:
* É comum uma requisição passar por toda a cadeia e não ser tratada

## Exemplo Prático
Sobre o exemplo prático, como o Chain of Responsability é uma requisição que é repartida em várias outras pequenas, pensou-se em um projeto de aprovação de orçamento que é feito por níveis, cada nível aprovando um orçamento até um determinado limite:

* Seller - aprova até 1.000;
* Manager - aprova até 5.000;
* Director - aprova até 50.000;
* CEO - aprova qualquer orçamento.

Se o orçamento é maior do que seu limite, o orçamento é passado para o próximo na hierarquia até que algum nível trate desse orçamento.

Dessa forma criou-se o budget_handler que é onde tem os métodos que todas as demais o classes vão usar, onde analisa o budget e retorna o budget ou passa para o próximo nível tratar dependendo do seu limite.

Customer é o cliente padrão que diz o orçamento e espera a sua aprovação por algum dos níveis.

E as demais classes são os níveis, onde são colocados seus limites, podendo retorna o budget tratado ou passar para o próximo na hierarquia.


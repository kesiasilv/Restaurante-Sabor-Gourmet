# Sistema de Gerenciamento de Pedidos para Restaurante Online

## Visão Geral

O restaurante **Sabor Gourmet** está expandindo seus serviços para pedidos online. Este sistema foi desenvolvido para permitir o gerenciamento de pedidos feitos pelos clientes de forma eficiente. A aplicação permite que os clientes se cadastrem, façam pedidos, visualizem o menu e acompanhem o status dos pedidos.

## Requisitos Funcionais

### Cadastro de Clientes
- Permitir que o cliente forneça seu nome, endereço e telefone.
- Armazenar os dados dos clientes em um array.

### Visualização do Menu
- Exibir o menu do restaurante com itens disponíveis.
- Cada item deve conter nome, preço e categoria.
- Armazenar os itens do menu em um array.

### Realização de Pedido
- Permitir ao cliente escolher itens do menu e adicioná-los ao pedido.
- Um pedido pode conter múltiplos itens e deve ser registrado no sistema.
- Calcular o total do pedido com base nos preços dos itens.

### Acompanhamento de Pedidos
- Permitir ao cliente verificar o status do pedido, que pode ser "Em preparação", "Pronto para entrega" ou "Entregue".

## Modelo de Dados

### Conceito do Banco de Dados
Crie um modelo conceitual de banco de dados que armazene as seguintes informações:
- **Cliente**: nome, endereço, telefone.
- **Item do Menu**: nome, categoria, preço.
- **Pedido**: cliente, itens escolhidos, total do pedido, status.

Utilize um software de modelagem, como MySQL Workbench ou DBDesigner, para criar o diagrama ER (Entidade-Relacionamento) do banco de dados. Estruture as tabelas para armazenar as informações de clientes, itens do menu e pedidos.

## Implementação em Java (com Arrays)

### Classes

#### Classe `Cliente`
- **Atributos**: nome, endereço, telefone.
- **Métodos**: `registrarCliente()`, `visualizarCliente()`.

#### Classe `ItemMenu`
- **Atributos**: nome, categoria, preço.
- **Métodos**: `getDetalhesItem()`, `calcularPreco()`.

#### Classe `Pedido`
- **Atributos**: itens[] (array de itens), cliente, total, status.
- **Métodos**: `adicionarItem()`, `calcularTotal()`, `atualizarStatus()`.

#### Classe `Restaurante`
- **Responsável por**: Armazenar arrays de `Cliente`, `ItemMenu` e `Pedido`.
- **Menu interativo**: Permite ao cliente se cadastrar, visualizar o menu, adicionar itens ao pedido e finalizar o pedido.

## Instruções de Uso

1. **Iniciar o Sistema**: Execute a classe `Restaurante` para iniciar o menu interativo.
2. **Cadastrar Cliente**: Selecione a opção para cadastrar um cliente e forneça os detalhes solicitados.
3. **Visualizar Menu**: Escolha a opção para visualizar os itens disponíveis no menu.
4. **Fazer Pedido**: Selecione um cliente e adicione itens ao pedido. Finalize o pedido quando terminar.
5. **Acompanhar Pedido**: Verifique o status dos pedidos realizados.

## Notas Adicionais

- O sistema utiliza arrays para armazenar clientes, itens do menu e pedidos. Não há conexão com banco de dados real neste protótipo.
- A visualização e manipulação dos pedidos são feitas diretamente através do menu interativo fornecido na classe `Restaurante`.


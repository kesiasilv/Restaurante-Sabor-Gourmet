# Sistema de Gerenciamento de Pedidos para Restaurante Online

## Visão Geral

O restaurante **Sabor Gourmet** está expandindo seus serviços para pedidos online. Este sistema foi desenvolvido para permitir o gerenciamento de pedidos feitos pelos clientes de forma eficiente. A aplicação permite que os clientes se cadastrem, façam pedidos, visualizem o menu e acompanhem o status dos pedidos.

## Implementação em Java (com Arrays)

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




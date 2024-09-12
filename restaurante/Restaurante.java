/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;

/**
 *
 * @author kesia.viana
 */
import java.util.Scanner;

public class Restaurante {

    private static Cliente[] clientes = new Cliente[100];
    private static Menu[] menu = new Menu[10];
    private static Pedido[] pedidos = new Pedido[100];
    private static int numClientes = 0;
    private static int numPedidos = 0;

    public static void main(String[] args) {
        inicializarMenu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Visualizar Menu");
            System.out.println("3. Fazer Pedido");
            System.out.println("4. Acompanhar Pedido");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            System.out.println(); // Espaço extra para clareza

            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner);
                    break;
                case 2:
                    visualizarMenu();
                    break;
                case 3:
                    fazerPedido(scanner);
                    break;
                case 4:
                    acompanharPedido(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close(); // Fechar o scanner ao sair
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void inicializarMenu() {
        menu[0] = new Menu("Costela Bovina", "Prato Principa ", 50.00);
        menu[1] = new Menu("Cordeiro", "Prato Principal", 35.00);
        menu[2] = new Menu("Camarão", "Prato Principal", 25.00);
        menu[3] = new Menu("Vinho Suave", "Bebidas", 60.00);
        menu[4] = new Menu("Drink de Morango", "Bebidas", 45.00);
        menu[5] = new Menu("Suco de Laranja", "Bebidas", 20.00);
        menu[6] = new Menu("Mousse de Chocolate", "Sobremesa", 35.00);
        menu[7] = new Menu("Brownie", "Sobremesa", 45.00);
        menu[8] = new Menu("Sorvete Artesanal", "Sobremesa", 35.00);
    }

    private static void cadastrarCliente(Scanner scanner) {
        System.out.println("\n=== CADASTRO DE CLIENTE ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        clientes[numClientes++] = new Cliente(nome, endereco, telefone);
        System.out.println("Cliente cadastrado com sucesso.");
    }

    private static void visualizarMenu() {
        System.out.println("\n=== MENU DO RESTAURANTE ===");
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != null) {
                System.out.println("Opção " + (i + 1) + ": " + menu[i].getDetalhesItem());
                System.out.println();
            }
        }
    }

    private static void fazerPedido(Scanner scanner) {
        System.out.println("\n=== FAZER PEDIDO ===");
        System.out.println("Escolha um cliente para o pedido:");
        for (int i = 0; i < numClientes; i++) {
            System.out.println((i + 1) + ". " + clientes[i].getNome());
        }
        System.out.print("Escolha o número do cliente: ");
        int clienteEscolhido = scanner.nextInt() - 1;
        scanner.nextLine();  // Limpar o buffer do scanner

        Cliente cliente = clientes[clienteEscolhido];
        Pedido pedido = new Pedido(cliente, 10);

        while (true) {
            visualizarMenu();
            System.out.print("Escolha um item para adicionar ao pedido (ou 0 para finalizar): ");
            int itemEscolhido = scanner.nextInt() - 1;
            scanner.nextLine();  // Limpar o buffer do scanner

            if (itemEscolhido == -1) {
                break;
            }

            if (itemEscolhido >= 0 && itemEscolhido < menu.length && menu[itemEscolhido] != null) {
                Menu item = menu[itemEscolhido];
                pedido.adicionarItem(item);
                System.out.println("Item adicionado ao pedido.");
            } else {
                System.out.println("Item inválido. Tente novamente.");
            }
        }

        pedidos[numPedidos++] = pedido;
        System.out.println("Pedido finalizado.");
        pedido.visualizarPedido();
    }

    private static void acompanharPedido(Scanner scanner) {
        System.out.println("\n=== ACOMPANHAR PEDIDO ===");
        System.out.println("Lista de Pedidos:");
        for (int i = 0; i < numPedidos; i++) {
            System.out.println((i + 1) + ". Pedido " + (i + 1));
        }
        System.out.print("Escolha o número do pedido para visualizar: ");
        int pedidoEscolhido = scanner.nextInt() - 1;
        scanner.nextLine();  // Limpar o buffer do scanner

        if (pedidoEscolhido >= 0 && pedidoEscolhido < numPedidos) {
            Pedido pedido = pedidos[pedidoEscolhido];
            pedido.visualizarPedido();
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }
}

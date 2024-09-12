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
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Visualizar Menu");
            System.out.println("3. Fazer Pedido");
            System.out.println("4. Acompanhar Pedido");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

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
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void inicializarMenu() {
        menu[0] = new Menu("Prato Principal opcao: 1", "Costela Bovina", 50.00);
        menu[1] = new Menu("Prato Principal opcao: 2", "Cordeiro", 35.00);
        menu[2] = new Menu("Prato Principal opcao: 3", "Camarao", 25.00);
        menu[3] = new Menu("Bebidas opcao: 4", "Vinho Suave", 60.00);
        menu[4] = new Menu("Bebidas opcao: 5", "Drink de Morango", 45.00);
        menu[5] = new Menu("Bebidas opcao: 6", "Suco de Laranja", 20.00);
        menu[6] = new Menu("Sobremesa opcao: 7", "Mousse de Chocolate", 35.00);
        menu[7] = new Menu("Sobemesa opcao: 8", "Brownie", 45.00);
        menu[8] = new Menu("Sobremesa opcao: 9", "Sorvete Artesanal", 35.00);
        
    }

    private static void cadastrarCliente(Scanner scanner) {
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
        System.out.println("\nMenu do Restaurante:");
        System.out.println("-------------------------");
        for (Menu item : menu) {
            if (item != null) {
                item.visualizarPedido();
                System.out.println();
            }
        }
    }

    private static void fazerPedido(Scanner scanner) {
        System.out.println("Escolha um cliente para o pedido:");
        for (int i = 0; i < numClientes; i++) {
            System.out.println((i + 1) + ". " + clientes[i].getNome());
        }
        int clienteEscolhido = scanner.nextInt() - 1;
        scanner.nextLine(); 
        Cliente cliente = clientes[clienteEscolhido];
        Pedido pedido = new Pedido(cliente, 10); 

        while (true) {
            visualizarMenu();
            System.out.print("Escolha um item para adicionar ao pedido (ou 0 para finalizar): ");
            int itemEscolhido = scanner.nextInt() - 1;
            scanner.nextLine(); 

            if (itemEscolhido == -1) {
                break;
            }

            Menu item = menu[itemEscolhido];
            pedido.adicionarItem(item);
            System.out.println("Item adicionado ao pedido.");
        }

        pedidos[numPedidos++] = pedido;
        System.out.println("Pedido finalizado.");
        pedido.visualizarPedido();
    }

    private static void acompanharPedido(Scanner scanner) {
        System.out.println("Lista de Pedidos:");
        for (int i = 0; i < numPedidos; i++) {
            System.out.println((i + 1) + ". Pedido " + (i + 1));
        }
        System.out.print("Escolha o número do pedido para visualizar: ");
        int pedidoEscolhido = scanner.nextInt() - 1;
        scanner.nextLine(); 

        if (pedidoEscolhido >= 0 && pedidoEscolhido < numPedidos) {
            Pedido pedido = pedidos[pedidoEscolhido];
            pedido.visualizarPedido();
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }
}


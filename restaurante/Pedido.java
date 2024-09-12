/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author kesia.viana
 */
public class Pedido {

    private Menu[] itens;
    private Cliente cliente;
    private double total;
    private String status;
    private int numItens;

    public Pedido(Cliente cliente, int capacidadeMaxima) {
        this.cliente = cliente;
        this.itens = new Menu[capacidadeMaxima];
        this.numItens = 0;
        this.status = "Em preparação";
    }

    public void adicionarItem(Menu item) {
        if (numItens < itens.length) {
            itens[numItens++] = item;
        } else {
            System.out.println("Capacidade do pedido excedida.");
        }
    }

    public double calcularTotal() {
        total = 0;
        for (int i = 0; i < numItens; i++) {
            total += itens[i].getPreco();
        }
        return total;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void visualizarPedido() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Status: " + status);
        System.out.println("Itens do Pedido:");
        for (int i = 0; i < numItens; i++) {
            System.out.println(itens[i].getDetalhesItem());
            System.out.println();
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}

    


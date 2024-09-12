/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author kesia.viana
 */
public class Menu {

    private String nome;
    private String categoria;
    private Double preco;

    // Construtor da classe Menu
    public Menu(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    // Método para obter o nome do item
    public String getNome() {
        return nome;
    }

    // Método para obter a categoria do item
    public String getCategoria() {
        return categoria;
    }

    // Método para obter o preço do item
    public Double getPreco() {
        return preco;
    }

    // Método para obter os detalhes do item
    public String getDetalhesItem() {
        return "Categoria: " + categoria + "\nItem: " + nome + "\nPreço: R$" + preco;
    }

    // Método para calcular o preço do item
    public double calcularPreco() {
        return preco;
    }
}
    


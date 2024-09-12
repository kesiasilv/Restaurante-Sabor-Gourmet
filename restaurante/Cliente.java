/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;

/**
 *
 * @author kesia.viana
 */
public class Cliente {

    private String nome;
    private String endereco;
    private String telefone;

    // Construtor da classe Cliente
    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Método para definir ou atualizar as informações do cliente
    public void registrarCliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Método para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método para obter o endereço do cliente
    public String getEndereco() {
        return endereco;
    }

    // Método para obter o telefone do cliente
    public String getTelefone() {
        return telefone;
    }

    // Método para visualizar as informações do cliente
    public void visualizarCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}

    


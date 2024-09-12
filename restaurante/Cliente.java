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

    public Cliente(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
   
    public void visualizarCliente(){
        System.out.println("nome: " + nome);
        System.out.println("endereco: " + endereco);
        System.out.println("telefone: " + telefone);
    }
}
    


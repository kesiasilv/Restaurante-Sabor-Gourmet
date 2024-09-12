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
 
    private String categoria;
    private String item;
    private Double preco;

    public Menu(String categoria, String item, Double preco){
        this.categoria = categoria;
        this.item = item;
        this.preco = preco;
    }
    
    public String getCategoria(){
        return categoria;
    }

    public String getItem(){
        return item;
    }
    
    public Double getPreco(){
        return preco;
    }
   
    public void visualizarPedido(){
        System.out.println("Categoria: " + categoria);
        System.out.println("Item: " + item);
        System.out.println("Preco: " + preco);
    }
}
    


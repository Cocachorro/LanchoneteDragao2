package com.lanchonetedragao2;

public class Produto {
    private int id;
    private String nome;
    private Double preco;
    private String desc;
    private String tipo;

    public Produto(int id, String nome, Double preco, String desc, String tipo){
        this.id=id;
        this.nome=nome;
        this.preco=preco;
        this.desc=desc;
        this.tipo=tipo;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public Double getPreco(){
        return preco;
    }
    public String getDesc(){
        return desc;
    }
    public String getTipo(){
        return tipo;
    }
}

package com.lanchonetedragao2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    public double total=0;
    public ArrayList<String> produtos = new ArrayList<>();

    public void addValor(double preco, int quantidade){
        total+=preco*quantidade;
    }
    public void addItem(String produto, int quantidade, double preco){
        String formatado = String.format("%dx - %s   R$%.2f", quantidade, produto, (preco*quantidade));
        produtos.add(formatado);
    }
    public void attLista(ListView<String> lista){
        ObservableList<String> itensObs= FXCollections.observableArrayList(produtos);
        lista.setItems(itensObs);
    }

    public double getTotal(){return total;}

    public void limparCarrinho(){
        total=0;
        produtos.clear();
    }
}

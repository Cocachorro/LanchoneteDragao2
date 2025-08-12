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
    public void addItem(String produto, int quantidade, double valor){
        String formatado = String.format("%d - %s   R$%.2f", quantidade, produto, valor);
        produtos.add(formatado);
    }
    public void addItens(ListView<String> lista){
        ObservableList<String> itensObs= FXCollections.observableArrayList(produtos);
        lista.setItems(itensObs);
    }
    public void limparCarrinho(){
        total=0;
        produtos.clear();
    }
}

package com.lanchonetedragao2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class ControlerCelula {
    @FXML
    private Label nome;
    @FXML
    private Label desc;
    @FXML
    private Label preco;
    @FXML
    private Spinner<Integer> spinner;

    public void configCelula(Produto produto) {
        nome.setText(produto.getNome());
        desc.setText(produto.getDesc());
        preco.setText(String.format("R$%.2f", produto.getPreco()));
        SpinnerValueFactory<Integer> spn = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 20, 0);
        spinner.setValueFactory(spn);
    }
    public int spnQuantidade(){
        return spinner.getValue();
    }
}

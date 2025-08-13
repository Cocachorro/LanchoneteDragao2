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

    private Produto produto;
    private ControlerMain controlerMain;

    public void configCelula(Produto produto, ControlerMain controlerMain) {
        this.produto = produto;
        this.controlerMain = controlerMain;

        nome.setText(produto.getNome());
        desc.setText(produto.getDesc());
        preco.setText(String.format("R$%.2f", produto.getPreco()));

        SpinnerValueFactory<Integer> spn = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1);
        spinner.setValueFactory(spn);
    }
    @FXML
    private void btnAddClick() {
        int quantidade = spinner.getValue();
        if (controlerMain != null && produto != null) {
            controlerMain.addCarrinho(produto, quantidade);
        }
    }
}

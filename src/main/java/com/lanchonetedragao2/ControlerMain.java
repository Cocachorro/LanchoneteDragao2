package com.lanchonetedragao2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.util.Callback;

import java.util.List;

public class ControlerMain {
    //Paineis
    @FXML
    private Pane pnlMenu;
    @FXML
    private Pane pnlSanduiche;
    @FXML
    private Pane pnlPastel;
    @FXML
    private Pane pnlSorvete;
    @FXML
    private Pane pnlAlcool;
    @FXML
    private Pane pnlNAlcool;

    //Listas
    @FXML
    private ListView<Produto> lstSanduiche;
    @FXML
    private ListView<Produto> lstPastel;
    @FXML
    private ListView<Produto> lstSorvete;
    @FXML
    private ListView<Produto> lstAlcool;
    @FXML
    private ListView<Produto> lstNAlcool;

    //Carrinho
    @FXML
    private Pane pnlCarrinho;
    @FXML
    private ListView<String> lstCarrinho;

    private ProdutoDB produtoDB = new ProdutoDB();
    private Carrinho carrinho = new Carrinho();


    @FXML
    public void initialize() {
        configListas();
        pnlMenu.setVisible(true);
    }

    private void addItens(String categoria, ListView<Produto> lista){
        if(!lista.getItems().isEmpty())return;
        List<Produto> prodDB= produtoDB.buscaProduto(categoria);
        ObservableList<Produto> itensLista=FXCollections.observableArrayList(prodDB);
        lista.setItems(itensLista);
    }

    private void configListas(){
        lstSanduiche.setCellFactory(new Callback<ListView<Produto>, ListCell<Produto>>() {
            @Override
            public ListCell<Produto> call(ListView<Produto> ListView) {
                return new ListCelula();
            }
        });
        lstPastel.setCellFactory(new Callback<ListView<Produto>, ListCell<Produto>>() {
            @Override
            public ListCell<Produto> call(ListView<Produto> ListView) {
                return new ListCelula();
            }
        });
        lstSorvete.setCellFactory(new Callback<ListView<Produto>, ListCell<Produto>>() {
            @Override
            public ListCell<Produto> call(ListView<Produto> ListView) {
                return new ListCelula();
            }
        });
        lstAlcool.setCellFactory(new Callback<ListView<Produto>, ListCell<Produto>>() {
            @Override
            public ListCell<Produto> call(ListView<Produto> ListView) {
                return new ListCelula();
            }
        });
        lstNAlcool.setCellFactory(new Callback<ListView<Produto>, ListCell<Produto>>() {
            @Override
            public ListCell<Produto> call(ListView<Produto> ListView) {
                return new ListCelula();
            }
        });
    }

    //Botoes do cardapio
    @FXML
    protected void btnVoltarClick(){
        pnlSanduiche.setVisible(false);
        pnlSorvete.setVisible(false);
        pnlPastel.setVisible(false);
        pnlAlcool.setVisible(false);
        pnlNAlcool.setVisible(false);
        pnlCarrinho.setVisible(false);

        pnlMenu.setVisible(true);
    }
    @FXML
    protected void btnFinalizarClick(){

    }
    @FXML
    protected void btnSanduicheClick() {
        pnlMenu.setVisible(false);
        pnlSanduiche.setVisible(true);
        addItens("sanduiche", lstSanduiche);
    }
    @FXML
    protected void btnPastelClick() {
        pnlMenu.setVisible(false);
        pnlPastel.setVisible(true);
        addItens("pastel", lstPastel);
    }
    @FXML
    protected void btnSorveteClick() {
        pnlMenu.setVisible(false);
        pnlSorvete.setVisible(true);
        addItens("sorvete", lstSorvete);
    }
    @FXML
    protected void btnAlcoolClick() {
        pnlMenu.setVisible(false);
        pnlAlcool.setVisible(true);
        addItens("alcoolica", lstAlcool);
    }
    @FXML
    protected void btnNAlcoolClick() {
        pnlMenu.setVisible(false);
        pnlNAlcool.setVisible(true);
        addItens("nAlcoolica", lstNAlcool);
    }
}
/*@FXML
    private ListView<String> minhaLista;

    // Lista de dados que será exibida
    private ObservableList<String> itensDaLista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Adiciona alguns dados de exemplo à lista
        itensDaLista.add("Hamburguer de Dragão");
        itensDaLista.add("Batatas Fritas Encantadas");
        itensDaLista.add("Poção de Refrigerante");
        itensDaLista.add("Sobremesa Mágica");
        itensDaLista.add("Snack dos Aventureiros");

        // Associa os dados à ListView para que eles sejam exibidos
        minhaLista.setItems(itensDaLista);
    }*/
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
    @FXML private Pane pnlMenu;
    @FXML private Pane pnlSanduiche;
    @FXML private Pane pnlPastel;
    @FXML private Pane pnlSorvete;
    @FXML private Pane pnlAlcool;
    @FXML private Pane pnlNAlcool;

    //Listas
    @FXML private ListView<Produto> lstSanduiche;
    @FXML private ListView<Produto> lstPastel;
    @FXML private ListView<Produto> lstSorvete;
    @FXML private ListView<Produto> lstAlcool;
    @FXML private ListView<Produto> lstNAlcool;

    //Carrinho
    @FXML private Pane pnlCarrinho;
    @FXML private ListView<String> lstCarrinho;
    @FXML private Label lblTotal;

    private ProdutoDB produtoDB = new ProdutoDB();
    private Carrinho carrinho = new Carrinho();


    @FXML
    public void initialize() {
        configListas();
    }

    private void addItens(String categoria, ListView<Produto> lista){
        if(!lista.getItems().isEmpty())return;
        List<Produto> prodDB= produtoDB.buscaProduto(categoria);
        ObservableList<Produto> itensLista=FXCollections.observableArrayList(prodDB);
        lista.setItems(itensLista);
    }

    private void configListas(){
        Callback<ListView<Produto>, ListCell<Produto>> fabrica = listView -> new ListCelula(this);

        lstSanduiche.setCellFactory(fabrica);
        lstPastel.setCellFactory(fabrica);
        lstSorvete.setCellFactory(fabrica);
        lstAlcool.setCellFactory(fabrica);
        lstNAlcool.setCellFactory(fabrica);
    }

    public void addCarrinho(Produto produto, int quantidade){
        carrinho.addItem(produto.getNome(), quantidade, produto.getPreco());
        carrinho.addValor(produto.getPreco(), quantidade);
        attCarrinho();
    }

    private void attCarrinho(){
        carrinho.attLista(lstCarrinho);
        lblTotal.setText(String.format("R$%.2f", carrinho.getTotal()));
    }

    //Botoes do cardapio
    @FXML
    protected void configPainel(Pane pnlPane){
        pnlSanduiche.setVisible(false);
        pnlSorvete.setVisible(false);
        pnlPastel.setVisible(false);
        pnlAlcool.setVisible(false);
        pnlNAlcool.setVisible(false);
        pnlCarrinho.setVisible(false);
        pnlMenu.setVisible(false);

        pnlPane.setVisible(true);
    }
    @FXML
    protected void btnVoltarClick(){
        configPainel(pnlMenu);
    }
    @FXML
    protected void btnFinalizarClick(){

    }
    @FXML
    protected void btnSanduicheClick() {
        configPainel(pnlSanduiche);
        addItens("sanduiche", lstSanduiche);
    }
    @FXML
    protected void btnPastelClick() {
        configPainel(pnlPastel);
        addItens("pastel", lstPastel);
    }
    @FXML
    protected void btnSorveteClick() {
        configPainel(pnlSorvete);
        addItens("sorvete", lstSorvete);
    }
    @FXML
    protected void btnAlcoolClick() {
        configPainel(pnlAlcool);
        addItens("alcoolica", lstAlcool);
    }
    @FXML
    protected void btnNAlcoolClick() {
        configPainel(pnlNAlcool);
        addItens("nAlcoolica", lstNAlcool);
    }
    @FXML
    protected void btnCarrinhoClick(){
        configPainel(pnlCarrinho);
        attCarrinho();
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
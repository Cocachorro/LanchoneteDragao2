package com.lanchonetedragao2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.Pane;

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
    private ListView<String> lstSanduiche;
    @FXML
    private ListView<String> lstPastel;
    @FXML
    private ListView<String> lstSorvete;
    @FXML
    private ListView<String> lstAlcool;
    @FXML
    private ListView<String> lstNAlcool;

    //Spinners Sanduiches
    @FXML
    private Spinner<Integer> spnSanduiche1;
    @FXML
    private Spinner<Integer> spnSanduiche2;
    @FXML
    private Spinner<Integer> spnSanduiche3;
    @FXML
    private Spinner<Integer> spnSanduiche4;
    @FXML
    private Spinner<Integer> spnSanduiche5;
    //Spinners Pasteis
    @FXML
    private Spinner<Integer> spnPasteis1;
    @FXML
    private Spinner<Integer> spnPasteis2;
    @FXML
    private Spinner<Integer> spnPasteis3;
    @FXML
    private Spinner<Integer> spnPasteis4;
    @FXML
    private Spinner<Integer> spnPasteis5;
    //Spinners Sorvetes
    @FXML
    private Spinner<Integer> spnSorvetes1;
    @FXML
    private Spinner<Integer> spnSorvetes2;
    @FXML
    private Spinner<Integer> spnSorvetes3;
    @FXML
    private Spinner<Integer> spnSorvetes4;
    @FXML
    private Spinner<Integer> spnSorvetes5;
    //Spinners Alcoolicas
    @FXML
    private Spinner<Integer> spnAlcool1;
    @FXML
    private Spinner<Integer> spnAlcool2;
    @FXML
    private Spinner<Integer> spnAlcool3;
    @FXML
    private Spinner<Integer> spnAlcool4;
    @FXML
    private Spinner<Integer> spnAlcool5;
    //Spinners Não Alcoolicas
    @FXML
    private Spinner<Integer> spnNAlcool1;
    @FXML
    private Spinner<Integer> spnNAlcool2;
    @FXML
    private Spinner<Integer> spnNAlcool3;
    @FXML
    private Spinner<Integer> spnNAlcool4;
    @FXML
    private Spinner<Integer> spnNAlcool5;

    // Lista de dados que será exibida
    private ProdutoDB produtoDB=new ProdutoDB();

    @FXML
    public void initialize() {
        configSpinners();
    }
    private void configSpinners(){
        //Config Spinners Sanduiches
        configSpinner(spnSanduiche1);
        configSpinner(spnSanduiche2);
        configSpinner(spnSanduiche3);
        configSpinner(spnSanduiche4);
        configSpinner(spnSanduiche5);
        //Config Spinners Pasteis
        configSpinner(spnPasteis1);
        configSpinner(spnPasteis2);
        configSpinner(spnPasteis3);
        configSpinner(spnPasteis4);
        configSpinner(spnPasteis5);
        //Config Spinners Sorvetes
        configSpinner(spnSorvetes1);
        configSpinner(spnSorvetes2);
        configSpinner(spnSorvetes3);
        configSpinner(spnSorvetes4);
        configSpinner(spnSorvetes5);
        //Config Spinners Alcoolicas
        configSpinner(spnAlcool1);
        configSpinner(spnAlcool2);
        configSpinner(spnAlcool3);
        configSpinner(spnAlcool4);
        configSpinner(spnAlcool5);
        //Config Spinners Não Alcoolicas
        configSpinner(spnNAlcool1);
        configSpinner(spnNAlcool2);
        configSpinner(spnNAlcool3);
        configSpinner(spnNAlcool4);
        configSpinner(spnNAlcool5);
    }
    private void configSpinner(Spinner<Integer> spinner){
        SpinnerValueFactory<Integer> spn = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,20,0);
        spinner.setValueFactory(spn);
    }
    private void configLista(String tipo, ListView<String> lstEx){
        List<Produto> prodDB = produtoDB.buscaProduto(tipo);
        ObservableList<String> prodExibir= FXCollections.observableArrayList();
        for(Produto produto:prodDB){
            String produtoFormat=String.format("%s - %.2f", produto.getNome(), produto.getPreco());
            prodExibir.add(produtoFormat);
        }
    }

    //Botoes do cardapio
    @FXML
    protected void btnSanduicheClick() {
        pnlMenu.setVisible(false);
        pnlSanduiche.setVisible(true);
        configLista("sanduiche", lstSanduiche);
    }
    @FXML
    protected void btnPastelClick() {
        pnlMenu.setVisible(false);
        pnlPastel.setVisible(true);
    }
    @FXML
    protected void btnSorveteClick() {
        pnlMenu.setVisible(false);
        pnlSorvete.setVisible(true);
    }
    @FXML
    protected void btnAlcoolClick() {
        pnlMenu.setVisible(false);
        pnlAlcool.setVisible(true);
    }
    @FXML
    protected void btnNAlcoolClick() {
        pnlMenu.setVisible(false);
        pnlNAlcool.setVisible(true);
    }


    //Botoes de Confirmar
    @FXML
    protected void btnSandConfirm() {
        pnlSanduiche.setVisible(false);
        pnlMenu.setVisible(true);
    }
    @FXML
    protected void btnPastelConfirm() {
        pnlPastel.setVisible(false);
        pnlMenu.setVisible(true);
    }
    @FXML
    protected void btnSorveteConfirm() {
        pnlSorvete.setVisible(false);
        pnlMenu.setVisible(true);
    }
    @FXML
    protected void btnAlcoolConfirm() {
        pnlAlcool.setVisible(false);
        pnlMenu.setVisible(true);
    }
    @FXML
    protected void btnNAlcoolConfirm() {
        pnlNAlcool.setVisible(false);
        pnlMenu.setVisible(true);
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
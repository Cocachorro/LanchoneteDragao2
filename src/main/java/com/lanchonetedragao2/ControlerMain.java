package com.lanchonetedragao2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.layout.Pane;

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
    private Spinner<Integer> spnSanduiche;
    @FXML
    private Spinner<Integer> spnPastel;
    @FXML
    private Spinner<Integer> spnSorvete;
    @FXML
    private Spinner<Integer> spnAlcool;
    @FXML
    private Spinner<Integer> spnNAlcool;


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
        lstSanduiche.setItems(itensDaLista);
    }

    //Acessar o cardápio
    @FXML
    protected void btnSanduicheClick() {
        pnlMenu.setVisible(false);
        pnlSanduiche.setVisible(true);
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
package com.lanchonetedragao2;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ListCelula extends ListCell<Produto> {
    private AnchorPane pane;
    private ControlerCelula controlerCelula;
    private ControlerMain controlerMain;

    public ListCelula(ControlerMain controlerMain){
        super();
        this.controlerMain = controlerMain;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("customCelula.fxml"));
            pane = loader.load();
            controlerCelula = loader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void updateItem(Produto produto, boolean empty){
        super.updateItem(produto, empty);
        if (empty || produto == null){
            setGraphic(null);
        }else {
            controlerCelula.configCelula(produto, controlerMain);
            setGraphic(pane);
        }
    }
}

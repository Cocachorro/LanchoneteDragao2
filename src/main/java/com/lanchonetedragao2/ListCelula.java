package com.lanchonetedragao2;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ListCelula extends ListCell<Produto> {
    private AnchorPane pane;
    private ControlerCelula controler;

    public ListCelula(){
        super();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("customCelula.fxml"));
            pane = loader.load();
            controler = loader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void attItem(Produto produto, boolean empty){
        super.updateItem(produto, empty);
        if (empty || produto == null){
            setGraphic(null);
        }else {
            controler.configCelula(produto);
            setGraphic(pane);
        }
    }
}

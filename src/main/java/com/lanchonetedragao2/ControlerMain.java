package com.lanchonetedragao2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class ControlerMain {
    @FXML
    private Pane pnlMenu;

    @FXML
    protected void btnMenuClick() {
        pnlMenu.setVisible(!pnlMenu.isVisible());
    }
}
package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    /*@FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("se anadio restaurante!");
    }*/

    @FXML
    private TextField campoNombre;

    @FXML
    protected void aniadirButtonClick(){
        String nombre = campoNombre.getText();
        System.out.println(nombre);
        //return nombre;
    }
}
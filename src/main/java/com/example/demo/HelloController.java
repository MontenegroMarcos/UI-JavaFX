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
    private TextField campotelefono;

    @FXML
    private TextField campodireccion;



    @FXML
    protected void aniadirButtonClick(){
        String nombre = campoNombre.getText();
        String telefono = campotelefono.getText();
        String direccion  = campodireccion.getText();
        System.out.println(nombre + " | " + telefono + " | " + direccion);
        //return nombre;
    }


    @FXML
    protected void aniadirRestaurante(){
        if (campoNombre.getText().equals(null) || campodireccion.getText().equals(null) || campotelefono.getText().equals(null)){

            //HAY UN ERROR , no se anaide
        } else {

            try {
                String nombreRestaurante = campoNombre.getText();
                String direccionRestaurante = campodireccion.getText();
                String telefonoRestaurante = campotelefono.getText();

                //Aqui uso inyeccion de dependecnias y creo el restaurante


            }catch (Exception e){

            }

        }


    }



}
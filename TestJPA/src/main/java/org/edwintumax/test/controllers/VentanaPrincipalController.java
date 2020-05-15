package org.edwintumax.test.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.edwintumax.test.App;

import javafx.fxml.Initializable;

public class VentanaPrincipalController implements Initializable {

    private App directorEscena;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

    }

    public void mostrarVentanaSalon(){
        this.directorEscena.mostrarVentanaSalon();
    }

    public App getDirectorEscena() {
        return directorEscena;
    }

    public void setDirectorEscena(App directorEscena) {
        this.directorEscena = directorEscena;
    }

    

}
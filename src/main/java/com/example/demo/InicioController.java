package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class InicioController {

    @FXML
    private TableColumn<?, ?> Domingo;

    @FXML
    private TableColumn<?, ?> Jueves;

    @FXML
    private TableColumn<?, ?> Lunes;

    @FXML
    private TableColumn<?, ?> Martes;

    @FXML
    private TableColumn<?, ?> Miercoles;

    @FXML
    private TableColumn<?, ?> Sabado;

    @FXML
    private TableColumn<?, ?> Viernes;

    @FXML
    private Button buttonAgregar;

    @FXML
    private ListView<?> taskList;

    @FXML
    private TextField textDescripcion;

    @FXML
    private TextField textDia;

    @FXML
    private TextField textTitulo;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println("Hola");
    }

    }


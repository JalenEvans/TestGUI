package com.example.fxmlexample2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class FXMLExampleController {
    @FXML
    private TextField nameField;

    @FXML
    private String name;

    @FXML
    private Label testLabel;

    @FXML
    private Button showBtn;

    @FXML
    private ImageView pokemon;

    @FXML
    private Image pokeImage;

    private HashMap<String, String> pokeNames = new HashMap<>();

    public FXMLExampleController() {
        pokeNames.put("bulbasaur", "src/main/resources/Pokemon_Images/bulbasaur.png");
    }

    @FXML
    private void showPokemon() {
        name = "C:\\Users\\redfl\\Desktop\\bulbasaur.png"; //nameField.getText();
        pokeImage = new Image("C:\\Users\\redfl\\Desktop\\CIRDLES\\Pokemon\\bulbasaur.png");
        pokemon.setImage(pokeImage);
        testLabel.setText(pokeNames.get(name));
    }
}
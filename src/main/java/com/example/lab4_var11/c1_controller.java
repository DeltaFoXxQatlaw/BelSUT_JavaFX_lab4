package com.example.lab4_var11;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * This class is an c1 scene action controller
 * @author Evgeny Litvinov
 * @version 1.0.0
 * Switch... functions are the methods of transition to the corresponding scene
 */
public class c1_controller{

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToAud (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("c1.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToStartMenu (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StartScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchTolecture (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("c2.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchTocomputer (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("c3.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void aboutAuthor (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("about.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToauthor (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("author.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void go_away(ActionEvent event){
        System.exit(1);
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField с1_num;

    @FXML
    private TextField c1_sq;

    @FXML
    private Label c1_pl;

    @FXML
    private Button c1_b_calc;

    @FXML
    private Button c1_b_res;

    @FXML
    private Button m_p;

    @FXML
    private Button c1_p;

    @FXML
    private Button c2_p;

    @FXML
    private Button c3_p;

    @FXML
    private Button aut_p;

    @FXML
    private Button exit_p;

    @FXML
    void initialize() {
    }

    public void calc(ActionEvent event){
        audience a1 = new audience(Integer.parseInt(с1_num.getText()), Float.parseFloat(c1_sq.getText()));
        System.out.println(a1.calc_pl());
        c1_pl.setText(Integer.toString(a1.calc_pl()));
    }

    public void reset(ActionEvent event){
        с1_num.setText("");
        c1_sq.setText("");
        c1_pl.setText("*");
    }
}

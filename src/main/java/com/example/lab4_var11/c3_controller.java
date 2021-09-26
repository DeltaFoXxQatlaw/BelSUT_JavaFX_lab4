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
 * This class is an c3 scene action controller
 * @author Evgeny Litvinov
 * @version 1.0.0
 * Switch... functions are the methods of transition to the corresponding scene
 */
public class c3_controller{

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
    private TextField c3_num;

    @FXML
    private TextField c3_sq;

    @FXML
    private Label c3_pl;

    @FXML
    private TextField c3_lvl;

    @FXML
    private Button c3_b_calc;

    @FXML
    private Button c3_b_res;

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
        computer a3 = new computer();
        a3.s_num(Integer.parseInt(c3_num.getText()));
        a3.s_square(Float.parseFloat(c3_sq.getText()));
        a3.s_P(Integer.parseInt(c3_lvl.getText()));
        c3_pl.setText(Integer.toString(a3.calc_pl()));
    }

    public void reset(ActionEvent event){
        c3_num.setText("");
        c3_sq.setText("");
        c3_lvl.setText("");
        c3_pl.setText("*");
    }
}

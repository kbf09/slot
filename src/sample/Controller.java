package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label t1;
    @FXML
    private Label t2;
    @FXML
    private Label t3;

    Random rnd1 = new Random();


    @FXML
    public void ac1(ActionEvent event) {

            t1.setText("" +rnd1.nextInt(10));

    }
    @FXML
    private void ac2(ActionEvent event) {

            t2.setText("" +rnd1.nextInt(10));

    }
    @FXML
    private void ac3(ActionEvent event) {

            t3.setText("" +rnd1.nextInt(10));

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {}
}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;
import java.util.TimerTask;

public class Controller extends TimerTask {

    @FXML
    public static Label t1;
    @FXML
    public Label t2;
    @FXML
    public Label t3;

    private Random rand = new Random();

    @FXML
    public void ac1(ActionEvent event) {
        t1.setText("" + rand.nextInt(10));
    }
    @FXML
    public void ac2(ActionEvent event) {

    }
    @FXML
    public void ac3(ActionEvent event) {

    }
    @Override
    public void run() {

        Controller.t1.setText("" + rand.nextInt(10));
        //this.t2.setText("" + rand.nextInt(10));
        //this.t3.setText("" + rand.nextInt(10));
    }

}


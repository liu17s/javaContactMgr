package sample;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;

public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

	public Button button; //the fxid needs to be the same as the object name.
	public void handleButtonClick(){
		System.out.println("I've been clicked.");
	}
	

}
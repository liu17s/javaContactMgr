package contactApp;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.application.Platform;

public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }
	
	public MenuItem quitMenuItem;
	public void quitApp(){
		Platform.exit();
	}

	public Button submitButton; //the fxid needs to be the same as the object name.
	public TextField nameEntry;
	public TextField emailEntry;
	public TextField phoneEntry;
	public void submitButtonClick(){
		System.out.println("Contact Data:");
		System.out.println("Name: " + nameEntry.getText());
		System.out.println("Email: " + emailEntry.getText());
		System.out.println("Phone #: " + phoneEntry.getText());
		System.out.println();
		makeNewContact(nameEntry.getText(), emailEntry.getText(), phoneEntry.getText());
//		submitButton.setText("Clicked!");
	}

	//public ArrayList<Contact> contacts = new ArrayList<>();
	public void makeNewContact(String name, String email, String phone){
	
	}
	

}
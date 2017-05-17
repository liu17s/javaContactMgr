package contactApp;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
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

	//To make new contact
	public Button newContactButton;
	public Label nameField;
	public void newContactScreen(){
		//TODO: move to new contact making screen
		System.out.println("User wants to make a new contact.");
		
	}
	
	//Converts a label to a TextField
	public void toTextField(Label oLabel){
		String value = oLabel.getText();
		System.out.println(value);
	}


//The following might be useful for the update screen.
//	public Button submitButton; //the fxid needs to be the same as the object name.
//	public TextField nameEntry;
//	public TextField emailEntry;
//	public TextField phoneEntry;
//	public void submitButtonClick(){
//		System.out.println("Contact Data:");
//		System.out.println("Name: " + nameEntry.getText());
//		System.out.println("Email: " + emailEntry.getText());
//		System.out.println("Phone #: " + phoneEntry.getText());
//		System.out.println();
//		makeNewContact(nameEntry.getText(), emailEntry.getText(), phoneEntry.getText());
//		submitButton.setText("Clicked!");
//	}

	//public ArrayList<Contact> contacts = new ArrayList<>();
	public void makeNewContact(String name, String email, String phone){
	
	}
	

}
package contactApp;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.application.Platform;

public class Controller implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }
	
	public MenuItem quitMenuItem;
	/**
	*	Method that quits the app using Platform.exit().
	*/
	public void quitApp(){
		Platform.exit();
	}

	//To make new contact
	public Button newContactButton;
	public Button saveButton;
	public Button updateButton;
	
	//Original Labels with contact info (initially visible)
	public Label nameLbl;
	public Label addressLbl;
	public Label emailLbl;
	public Label phoneLbl;
	
	//TextFields used to edit contact info (initially not visible)
	public TextField nameField;
	public TextField addressField;
	public TextField emailField;
	public TextField phoneField;
	
	public Pane editPane;
	
	/**
	*	Used to change to editPane to something that is functional for making a new contact.
	*/
	public void newContactScreen(){
		//TODO: move to new contact making screen
		System.out.println("User wants to make a new contact.");
		
		//Adds new TextFields to visible Pane for edits
		//editPane.getChildren().addAll(toTextField(nameLbl), toTextField(addressLbl), toTextField(emailLbl), toTextField(phoneLbl));
		nameLbl.setVisible(false);
		nameField.setVisible(true);
		addressLbl.setVisible(false);
		addressField.setVisible(true);
		emailLbl.setVisible(false);
		emailField.setVisible(true);
		phoneLbl.setVisible(false);
		phoneField.setVisible(true);
		updateButton.setVisible(false);
		newContactButton.setVisible(false);
		saveButton.setVisible(true);
	}

	public void makeNewContact(String name, String email, String phone){
	
	}
	

}
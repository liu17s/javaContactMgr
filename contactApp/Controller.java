package contactApp;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.control.ScrollPane;
import javafx.application.Platform;
import java.util.HashMap;

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
	
	//Can be used to pass new objects to the Pane where contact information can be edited -- not currently in use.
	//public Pane editPane;
	
	//shows the id number of the contact currently on the screen. 0 = no contact.
	public Contact currentContact = null;
	//used to assign new contacts an id.
	public Integer counter = 0;
	//used to make sure that buttons on menu line up appropriately.
	public double buttonY = 0;
	//HashMap that holds the contacts by id
	public HashMap<Integer, Contact> contactMap = new HashMap<>();
	
	//Scroll Pane on the left where the contact names are stored.
	public Pane contactList;
	
	/**
	*	Used to change to editPane to something that is functional for making a new contact.
	*/
	public void newContactScreen(){
		System.out.println("User wants to make a new contact.");
		
		//Adds new TextFields to visible Pane for edits
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
	
	/**
	*	Returns the Pane to a view that is used to view contact information.  Used after editing or making a new contact.
	*/
	public void toInfoScreen(){
		
		//Adds new TextFields to visible Pane for edits
		nameLbl.setVisible(true);
		nameField.setVisible(false);
		addressLbl.setVisible(true);
		addressField.setVisible(false);
		emailLbl.setVisible(true);
		emailField.setVisible(false);
		phoneLbl.setVisible(true);
		phoneField.setVisible(false);
		updateButton.setVisible(true);
		newContactButton.setVisible(true);
		saveButton.setVisible(false);
		updateInfo();
	}
	
	/**
	*	Saves the information on the screen to a new contact object.
	*/
	public void saveNewContact(){
		System.out.println("User wants to save the new contact.");
		String name = nameField.getText();
		String address = addressField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		counter++;
		int id = counter.intValue();
		contactMap.put(id, new Contact(counter.intValue(), name, address, email, phone));
		Button nButton = new Button(name);
		nButton.setOnAction(e -> {
			currentContact = contactMap.get(id);
			updateInfo();
			});
		nButton.setLayoutY(buttonY);
		if(buttonY > contactList.getHeight() - 30){
			contactList.setPrefHeight(contactList.getHeight() + 30);
		}
		buttonY = buttonY + 30;
		contactList.getChildren().addAll(nButton);
		currentContact = contactMap.get(id);
		toInfoScreen();
	}
	
	/**
	*	Updates the info of the currentContact to the Pane that displays contact information.
	*/
	public void updateInfo(){
		nameLbl.setText(currentContact.getName());
		addressLbl.setText(currentContact.getAddress());
		emailLbl.setText(currentContact.getEmail());
		phoneLbl.setText(currentContact.getPhone());
	}
	
	public void growContactPane(){
	
	}
	

}
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
	public Button updateButton;
	public Label nameLbl;
	public Label addressLbl;
	public Label emailLbl;
	public Label phoneLbl;
	public Pane editPane;
	
	/**
	*	Used to change to editPane to something that is functional for making a new contact.
	*/
	public void newContactScreen(){
		//TODO: move to new contact making screen
		System.out.println("User wants to make a new contact.");
		
		//Adds new TextFields to visible Pane for edits
		editPane.getChildren().addAll(toTextField(nameLbl), toTextField(addressLbl), toTextField(emailLbl), toTextField(phoneLbl));
		nameLbl.setVisible(false);
		addressLbl.setVisible(false);
		emailLbl.setVisible(false);
		phoneLbl.setVisible(false);
	}
	
	/**
	*	Converts a label to a TextField.
	*	@param oLabel is of type Label
	*	@returns a new TextField with the same value and position as oLabel with a similar id (except with "Filed" in place of "Lbl" at the end).
	*/
	public TextField toTextField(Label oLabel){
		
		//Takes value and position from original label
		String value = oLabel.getText();
		String id = oLabel.getId();
		double x = oLabel.getLayoutX();
		double y = oLabel.getLayoutY();
		
		//New id has same beginning but replaces "Lbl" with "Field"
		id = id.substring(0, id.length() - 3) + "Field";
		
		//Creates a new TextField with the same position and value as oLabel
		TextField nTF = new TextField(value);
		nTF.setId(id);
		nTF.setLayoutX(x);
		nTF.setLayoutY(y - 5); //5 is subtracted to correct an appearance problem.
		System.out.println(nTF.getId());
		return nTF;
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
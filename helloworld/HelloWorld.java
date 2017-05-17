/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;

public class HelloWorld extends Application {
    public static void main(String[] args) {
        
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dynamic Creation Test");
   
        VBox vbox = new VBox(8);
        TextField text1 = new TextField();
        
        
        HBox hbox = new HBox();
        hbox.getChildren().add(vbox);
 
        Label lbl1 = new Label("Name:");
        Label lbl2 = new Label("Address:");
        Label lbl3 = new Label("Email:");
        Label lbl4 = new Label("Phone:");
        TextField text2 = new TextField();
        TextField text3 = new TextField();
        TextField text4 = new TextField();
        
             Button btn = new Button();
        btn.setText("Create Contact");
        
        Label lbl5 = new Label("Name:");
        Label lbl6 = new Label("Address:");
        Label lbl7 = new Label("Email:");
        Label lbl8 = new Label("Phone:");
        Label lbl9 = new Label("Bob");
        Label lbl10 = new Label("1219 Broad St");
        Label lbl11 = new Label("bob@ncssm.edu");
        Label lbl12 = new Label("919-123-4567");
        
        
        
        
        
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        Button btn7 = new Button();
        Button btn8 = new Button();
        Button btn9 = new Button();
        Button btn10 = new Button();
        Button btn11 = new Button();
        Button btn12 = new Button();
        Button btn13 = new Button();
        Button btn14 = new Button();
        Button btn15 = new Button();
        Button btn16 = new Button();
        Button btn17 = new Button();
        Button btn18 = new Button();
        Button btn19 = new Button();
        Button btn20 = new Button();
        Button btn21 = new Button();
        Button btn22 = new Button();
        Button btn23 = new Button();
        Button btn24 = new Button();
        Button btn25 = new Button();
        Button btn26 = new Button();
        Button btn27 = new Button();
        Button btn28 = new Button();
        Button btn29 = new Button();
        Button btn30 = new Button();
        Button btn31 = new Button();
        Button btn32 = new Button();
        Button btn33 = new Button();
        Button btn34 = new Button();
        
        
        Button[] barray = new Button[32];
        barray[0] = btn2;
        barray[1] = btn3;
        barray[2] = btn4;
        barray[3] = btn5;
        barray[4] = btn6;
        barray[5] = btn7;
        barray[6] = btn8;
        barray[7] = btn9;
        barray[8] = btn10;
        barray[9] = btn11;
        barray[10] = btn12;
        barray[11] = btn13;
        barray[12] = btn14;
        barray[13] = btn15;
        barray[14] = btn16;
        barray[15] = btn17;
        barray[16] = btn18;
        barray[17] = btn19;
        barray[18] = btn20;
        barray[19] = btn21;
        barray[20] = btn22;
        barray[21] = btn23;
        barray[22] = btn24;
        barray[23] = btn25;
        barray[24] = btn26;
        barray[25] = btn27;
        barray[26] = btn28;
        barray[27] = btn29;
        barray[28] = btn30;
        barray[29] = btn31;
        barray[30] = btn32;
        barray[31] = btn33;
     
        
        String[] address = new String[32];
        String[] phone = new String[32];
        String[] email = new String[32];
 
        
        
      
        
        
        String qwerty = text1.getText();
        btn.setOnAction(new EventHandler<ActionEvent>() {
            int counter = 0;
            @Override
            public void handle(ActionEvent event) {
                if (counter<32)
                {
                barray[counter].setText((counter+1) + ": " + text1.getText());
                address[counter] = text2.getText();
                email[counter] = text3.getText();
                phone[counter] = text4.getText();
                
                vbox.getChildren().add(barray[counter]);
                text1.clear();
                text2.clear();
                text3.clear();
                text4.clear();
                
                for (int i = 0; i < counter+1; i++)
                {
                int counter2 = i;
                barray[i].setOnAction(new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    
                    lbl9.setText(barray[counter2].getText());
                    lbl10.setText(address[counter2]);
                    lbl11.setText(email[counter2]);
                    lbl12.setText(phone[counter2]);
                    
                }
                });
                }
                counter++;
                }
                
                
                else
                {
                    System.out.println("Contact Limit Reached");
                }
            }   
            
        });
        
               
        
      
      
        
        
        ScrollPane s1 = new ScrollPane();
 s1.setPrefSize(200, 120);
 s1.setContent(hbox);
 HBox hbox1 = new HBox();
 VBox vbox2 = new VBox();
 GridPane grid = new GridPane();
 GridPane grid1 = new GridPane();
 Label lbl14 = new Label("Add New");
 grid1.getChildren().addAll(text1, lbl1, lbl2, lbl3, lbl4, text2, text3, text4, lbl14, btn);
 GridPane.setConstraints(lbl14, 1, 0);
 GridPane.setConstraints(text1, 2, 1);
 GridPane.setConstraints(text2, 2, 2);
 GridPane.setConstraints(text3, 2, 3);
 GridPane.setConstraints(text4, 2, 4);
 GridPane.setConstraints(lbl1, 1, 1);
 GridPane.setConstraints(lbl2, 1, 2);
 GridPane.setConstraints(lbl3, 1, 3);
 GridPane.setConstraints(lbl4, 1, 4);
 GridPane.setConstraints(btn, 2, 5); // column=2 row=0

 
 grid1.getColumnConstraints().add(new ColumnConstraints(100)); // column 0 is 100 wide
 grid1.getColumnConstraints().add(new ColumnConstraints(100));
 
 grid1.getRowConstraints().add(new RowConstraints(40));
 grid1.getRowConstraints().add(new RowConstraints(40));
 grid1.getRowConstraints().add(new RowConstraints(40));
 grid1.getRowConstraints().add(new RowConstraints(40));
 grid1.getRowConstraints().add(new RowConstraints(40));
 grid1.getRowConstraints().add(new RowConstraints(40));
 
 
 
 
 Label lbl13 = new Label("Contact Info");
 grid.getChildren().addAll(lbl13, lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11,lbl12);
 GridPane.setConstraints(lbl13, 1,0);
  GridPane.setConstraints(lbl9, 2, 1);
 GridPane.setConstraints(lbl10, 2, 2);
 GridPane.setConstraints(lbl11, 2, 3);
 GridPane.setConstraints(lbl12, 2, 4);
 GridPane.setConstraints(lbl5, 1, 1);
 GridPane.setConstraints(lbl6, 1, 2);
 GridPane.setConstraints(lbl7, 1, 3);
 GridPane.setConstraints(lbl8, 1, 4);


 
 grid.getColumnConstraints().add(new ColumnConstraints(100)); // column 0 is 100 wide
 grid.getColumnConstraints().add(new ColumnConstraints(100));
 
 grid.getRowConstraints().add(new RowConstraints(40));
 grid.getRowConstraints().add(new RowConstraints(40));
 grid.getRowConstraints().add(new RowConstraints(40));
 grid.getRowConstraints().add(new RowConstraints(40));
 grid.getRowConstraints().add(new RowConstraints(40));
 grid.getRowConstraints().add(new RowConstraints(40));
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  vbox2.getChildren().addAll(grid, grid1);
 hbox1.getChildren().addAll(s1,vbox2);
        StackPane root = new StackPane();
        root.getChildren().add(hbox1);
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }
}
 

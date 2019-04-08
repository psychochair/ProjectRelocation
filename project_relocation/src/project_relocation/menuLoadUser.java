/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javax.swing.JComboBox;
import static project_relocation.Project_Relocation.buttonStyle1;
import static project_relocation.Project_Relocation.buttonStyle2;
import static project_relocation.Project_Relocation.comboBoxStyle1;
import static project_relocation.Project_Relocation.labelStyle1;
import static project_relocation.Project_Relocation.user;

/**
 *
 * @author chasa
 */
public class menuLoadUser extends BorderPane implements UI {
    
    public menuLoadUser() {
        

        
//Background image
        Image background = new Image("menu1Background2.png",1300,650,true,true);
        ImageView backgroundView = new ImageView(background);
        
        this.getChildren().add(backgroundView);
        
//Code starts here        
        BufferedReader in = null;
        try {
            //Creating interface
            GridPane mainPane = new GridPane();
            mainPane.setAlignment(Pos.CENTER);
            VBox vBox=new VBox(10);
            HBox buttonBox=new HBox(10);
            
            Label message=new Label("Search for your username \nthen press enter");
            message.setStyle(labelStyle1);
            
//storing every username into an array for combobox
            in = new BufferedReader(new FileReader("resources/usernames.txt"));
            String str;
            List<String> list = new ArrayList<String>();
            while((str = in.readLine()) != null){
                list.add(str);
            }   String[] stringArr = list.toArray(new String[0]);
            ObservableList<String> options = FXCollections.observableArrayList(list);
            final ComboBox comboBox = new ComboBox(options);
            comboBox.setStyle(comboBoxStyle1);
            
            Button confirm=new Button("Confirm");
            confirm.setStyle(buttonStyle1);
            
            Button back=new Button("Back");
            back.setStyle(buttonStyle1);
            
            
            Label errorMessage=new Label("");
            
            buttonBox.getChildren().addAll(confirm,back);
            vBox.getChildren().addAll(message,comboBox,buttonBox,errorMessage);
            mainPane.getChildren().addAll(vBox);
            this.setCenter(mainPane);
            //button actions
            //back button
            back.setOnAction(new EventHandler <ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    Project_Relocation.setScene(Project_Relocation.getMenu1());
                }
            }); 
//confirm button
            confirm.setOnAction(new EventHandler <ActionEvent>(){
                @Override
                public void handle(ActionEvent event) {
                    if(comboBox.getSelectionModel().isEmpty()){
                        errorMessage.setText("Pick a username from the list first!");
                    }else{
                        ObservableList userList=comboBox.getItems();
                        String username=(String)comboBox.getValue();
                        System.out.println(username);
                        user.setUsername(username);
                        

                        try {
                            user.actualizeFile();
                        } catch (IOException ex) {
                            Logger.getLogger(menuLoadUser.class.getName()).log(Level.SEVERE, null, ex);
                        }
//If successful, launch next scene                        
                        Project_Relocation.setScene(Project_Relocation.getSelectionMenu());
                    }
                }
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(menuLoadUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(menuLoadUser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(menuLoadUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        
    }
    

}

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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javax.swing.JComboBox;

/**
 *
 * @author chasa
 */
public class menuLoadUser extends BorderPane implements UI {
    
    public menuLoadUser() throws FileNotFoundException, IOException{
//Creating interface
        GridPane mainPane = new GridPane();
        mainPane.setAlignment(Pos.CENTER);
        VBox vBox=new VBox(10);
        HBox buttonBox=new HBox(10);
        
        Label message=new Label("Search for your username, the press enter");
        
//storing every username into an array for combobox       
        BufferedReader in = new BufferedReader(new FileReader("resources/usernames.txt"));
        String str;
        List<String> list = new ArrayList<String>();
        while((str = in.readLine()) != null){
            list.add(str);
        }

        String[] stringArr = list.toArray(new String[0]);
        
        
        ObservableList<String> options = FXCollections.observableArrayList(list);
        final ComboBox comboBox = new ComboBox(options);
        
        
        Button confirm=new Button("Confirm");
        Button back=new Button("Back");
        
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
        
    }
    

}

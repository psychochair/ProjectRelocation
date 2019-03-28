/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import java.io.File;
import java.nio.file.Paths;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Marc
 */
public class menu1 extends BorderPane implements UI{
    
    public menu1(){

//Design Values
        
        int insetSize1=10;
        
        int fontSize1=32;
        String fontFamily1="\"AR Delaney\"";
        
        String style1="-fx-background-color: "
                    + "linear-gradient(#ffd65b, #e68400), "
                    + "linear-gradient(#ffef84, #f2ba44), "
                    + "linear-gradient(#ffea6a, #efaa22), "
                    + "linear-gradient(#ffe657 0%, #f8c202 50%, #eea10b 100%), "
                    + "linear-gradient(from 0% 0% to 15% 50%, "
                    + "rgba(255,255,255,0.9), "
                    + "rgba(255,255,255,0)); "
                + "-fx-font-family: "+fontFamily1+"; "
                + "-fx-background-radius: 30; "
                + "-fx-background-insets: 0,1,2,3,0; "
                + "-fx-text-fill: #654b00; "
                + "-fx-font-weight: bold; "
                + "-fx-font-size: "+fontSize1+"px; "
                + "-fx-padding: 10 20 10 20;";
        
        
        
        
        
    //Background image
        Image background = new Image("menu1Background.png",1300,650,true,true);
        ImageView backgroundView = new ImageView(background);

        
        
        
        
        
    //CREATE GRID PANE MENU1
        
        //GRID PANE FOR THE TOP MENU 1
        GridPane gridPaneTop = new GridPane();
                
        gridPaneTop.setAlignment(Pos.CENTER);
        
        
        
        
        VBox buttonBox=new VBox(insetSize1);
        buttonBox.setAlignment(Pos.CENTER);
        
        //BUTTONS FOR THE ACTIONS
        Button newGameButton = new Button("New Game");
        newGameButton.setStyle(style1);
        
        Button loadGameButton = new Button("Load Game");
        loadGameButton.setStyle(style1);
        
        
        
        //ADD BUTTONS TO GRIDPANE and VBOX
        buttonBox.getChildren().addAll(newGameButton, loadGameButton);
        
        //ADD NODE MENU1 GRID PANE
        this.getChildren().add(backgroundView);
        this.setCenter(buttonBox);
        this.setTop(gridPaneTop);
        
        
        //BUTTON ACTIONS TO CHANGE SCENE
        newGameButton.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getNewUserMenu());
            }
        });
        
        loadGameButton.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getLoadGameMenu());
            }
        });
    }
    
    
}


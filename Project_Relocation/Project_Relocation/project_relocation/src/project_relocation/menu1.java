/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Marc
 */
public class menu1 extends BorderPane implements UI{
    
    public menu1(){
    //CREATE GRID PANE MENU1
        
        //GRID PANE FOR THE TOP MENU 1
        GridPane gridPaneTop = new GridPane();
        Label titleName = new Label("Project_Relocation");
        gridPaneTop.setAlignment(Pos.CENTER);
        gridPaneTop.add(titleName, 1, 0);
        
        
        //GRID PANE FOR THE CENTER MENU 1
        GridPane gridPaneMenus = new GridPane();
        gridPaneMenus.setAlignment(Pos.CENTER);
        
        //BUTTONS FOR THE ACTIONS
        Button newGameButton = new Button("New Game");
        Button loadGameButton = new Button("Load Game");
        
        //ADD BUTTONS TO GRIDPANE
        gridPaneMenus.add(newGameButton, 0, 0);
        gridPaneMenus.add(loadGameButton,0,1);
        
        //ADD NODE MENU1 GRID PANE
        this.setCenter(gridPaneMenus);
        this.setTop(gridPaneTop);
        
        
        //BUTTON ACTIONS TO CHANGE SCENE
        newGameButton.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getNewGameMenu());
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


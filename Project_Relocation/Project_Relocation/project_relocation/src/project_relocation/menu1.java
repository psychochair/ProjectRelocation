/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Marc
 */
public class menu1 extends BorderPane implements UI{
    
    public menu1(){
    //CREATE GRID PANE MENU1
        
        //GRID PANE FOR THE TOP MENU 1
        GridPane gridPaneTop = new GridPane();
        Label titleName = new Label("Projetc_Relocation");
        gridPaneTop.setAlignment(Pos.CENTER);
        gridPaneTop.add(titleName, 1, 0);
        
        
        //GRID PANE FOR THE CENTER MENU 1
        GridPane gridPaneMenus = new GridPane();
        gridPaneMenus.setAlignment(Pos.CENTER);
        Label newGameLabel = new Label("New Game");
        Label loadGameLabel = new Label("Load Game");
        gridPaneMenus.add(newGameLabel, 0, 0);
        gridPaneMenus.add(loadGameLabel,0,1);
        
        
        //ADD NODE MENU1 GRID PANE
        this.setCenter(gridPaneMenus);
        this.setTop(gridPaneTop);
   
        
    }
    
    
}

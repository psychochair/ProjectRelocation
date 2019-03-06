/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.scene.layout.VBox;

/**
 *
 * @author Marc
 */
public class OrdersList extends VBox{
    
    public OrdersList(){
    this.setSpacing(5);
    this.setMaxWidth(110);
    this.setMinWidth(110);
    this.setMinHeight(Project_Relocation.sceneHeight - 90);
    this.setMaxHeight(Project_Relocation.sceneHeight - 90);
this.setStyle("-fx-background-color: #fff;-fx-border-width: 2;" +
                      "-fx-border-radius: 5;" + 
                      "-fx-border-color: black;");

this.setTranslateX(0);

//CREATE THE 3 BLOCKS
Acceleration AccBlock = new Acceleration();
Wait WaitBlock = new Wait();
Rotation RotBlock = new Rotation();

this.getChildren().addAll(AccBlock, RotBlock, WaitBlock);
    }
    
    
    
}

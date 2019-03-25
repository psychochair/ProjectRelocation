/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Marc
 */
public class OrdersList extends GridPane{
   

    public OrdersList(){
    this.setMaxWidth(120);
    this.setMinWidth(120);
    this.setMinHeight(Project_Relocation.sceneHeight - 120);
    this.setMaxHeight(Project_Relocation.sceneHeight - 120);
this.setStyle("-fx-background-color: #fff;-fx-border-width: 2;" +
                      "-fx-border-radius: 5;" + 
                      "-fx-border-color: black;");

this.setTranslateX(0);

//CREATE THE 3 BLOCKS
Acceleration AccBlock = new Acceleration();
Wait WaitBlock = new Wait();
Rotation RotBlock = new Rotation();


this.add(AccBlock,0,0);
add(WaitBlock,0,1);
add(RotBlock,0,2);
AccBlock.toBack();




    }
    
    
    public void newBlock(Orders x, int row){
    add(x,0,row);
    }
    public void deleteOrder(Orders x){
    this.getChildren().remove(x);
    }
    
    
    public void scrollBlocs(double xvalue){
        
    ((GameUI) getParent()).scrollBlocs(xvalue);
    }
    
    public void sendOrderToTimeline(Orders order, double x, double y){
    ((GameUI) getParent()).sendOrderToTimeline(order, x, y);
    
    }
}

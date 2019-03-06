/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import java.util.ArrayList;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author sandr
 */



//public Rocket() throws FileNotFoundException{
//Image img = new Image(new FileInputStream("C:\\Users\\Marc\\Desktop\\rocketProjFinal.png"));
//this.setFill(new ImagePattern(img));
//this.setRadiusX(100);
//this.setRadiusY(100);
//this.setCenterX(100);
//this.setCenterY(100);
//this.setStroke(Color.BLACK);
//this.setStrokeWidth(1);
//}



public class Timeline extends HBox{
    
    private ArrayList<Orders> orders;
    
    public Timeline(){
    this.setWidth(Project_Relocation.sceneWidth);
    this.setMinHeight(90);
    this.setMaxHeight(90);
this.setStyle("-fx-background-color: #fff;-fx-border-width: 2;" +
                      "-fx-border-radius: 5;" + 
                      "-fx-border-color: black;");
    this.setTranslateX(0);
        
        
    }
    
    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void addOrder(Orders order) {
      
    } 
    
    public void modifyOrder(Orders[] orders) {
      
    } 
    
    public void swapOrder(Orders[] orders) {
      
    } 
    
    public void removeOrder(Orders[] orders) {
      
    } 
}


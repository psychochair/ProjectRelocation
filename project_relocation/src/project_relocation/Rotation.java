/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

/**
 *
 * @author Marc
 */
public class Rotation extends Orders{
    private double angle = 25;
    public Rotation(){
        Label l1 = new Label("Angle");    
    TextField tf1 = new TextField();
    this.getChildren().addAll(l1,tf1);
    
    tf1.setOnKeyPressed( e -> {
         
         try{
         if(e.getCode() == KeyCode.ENTER){
            if(((Double.parseDouble(tf1.getText())) <= 360) && ((Double.parseDouble(tf1.getText())) >= 0)){
                //COPY TO TIMELINE THE BLOCK
                //r1.setRate(Double.parseDouble(tf1.getText()));
         }
            else{
                tf1.setText("0 to 360");
            }
         }
         }
         catch(NumberFormatException ex){
             tf1.setText("No Result");
         }
        });

    }
    
    public double getAngle(){
    return angle;
    }
    public void setAngle(double x){
    angle = x;
    }
}

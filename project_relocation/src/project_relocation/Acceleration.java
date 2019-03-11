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
public class Acceleration extends Orders{
  
    private double accelerationValue = 0;
    private double durationAcceleration = 0;

    public Acceleration(){
    Label l1 = new Label("Acceleration (m/s)");    
    TextField tf1 = new TextField();
    Label l2 = new Label("Duration (s)");    
    TextField tf2 = new TextField();
    this.getChildren().addAll(l1,tf1,l2,tf2);
    
    tf1.setOnKeyPressed( e -> {
         
         try{
         if(e.getCode() == KeyCode.ENTER){
             //DETERMINE ACCELERATION MAX
            if(((Double.parseDouble(tf1.getText())) <= 0) && ((Double.parseDouble(tf1.getText())) >= 0)){
                //COPY TO TIMELINE THE BLOCK
                //r1.setRate(Double.parseDouble(tf1.getText()));
         }
            else{
                //DETERMINE ACCELERATION MAX
                tf1.setText("0 to -------");
            }
         }
         }
         catch(NumberFormatException ex){
             tf1.setText("No Result");
         }
        });
    
    tf2.setOnKeyPressed( e -> {
         
         try{
         if(e.getCode() == KeyCode.ENTER){
            if(((Double.parseDouble(tf2.getText())) <= 60) && ((Double.parseDouble(tf2.getText())) >= 0)){
                //COPY TO TIMELINE THE BLOCK
                //r1.setRate(Double.parseDouble(tf1.getText()));
         }
            else{
                tf2.setText("0 to 60");
            }
         }
         }
         catch(NumberFormatException ex){
             tf2.setText("No Result");
         }
        });

    }
    
    public double getAcceleration() {
        return accelerationValue;
    }

    public double getDuration() {
        return durationAcceleration;
    }

    public void setAcceleration(double accelerationValue) {
        this.accelerationValue = accelerationValue;
    }

    public void setDuration(double durationAcceleration) {
        this.durationAcceleration = durationAcceleration;
    }
    
    
}

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
public class Wait extends Orders{
    
    private double duration = 2;
    
    
    public Wait(){
        Label l1 = new Label("Duration (s)");    
    TextField tf1 = new TextField();
    this.getChildren().addAll(l1,tf1);
    
    tf1.setOnKeyPressed( e -> {
         
         try{
         if(e.getCode() == KeyCode.ENTER){
            if(((Double.parseDouble(tf1.getText())) <= 60) && ((Double.parseDouble(tf1.getText())) >= 0)){
                //COPY TO TIMELINE THE BLOCK
                //r1.setRate(Double.parseDouble(tf1.getText()));
         }
            else{
                tf1.setText("0 to 60");
            }
         }
         }
         catch(NumberFormatException ex){
             tf1.setText("No Result");
         }
        });

    }
    public double getDuration(){
    return duration;
    }
    
    public void setDuration(double x){
    duration = x;
    }
    
}

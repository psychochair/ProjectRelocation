/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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

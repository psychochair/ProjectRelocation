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
public class Wait extends Orders{
    
    private double duration = 0;
    
    
    public Wait(){
        Label l1 = new Label("Duration (s)");    
    TextField tf1 = new TextField();
    this.getChildren().addAll(l1,tf1);
    }
    public double getDuration(){
    return duration;
    }
    
    public void setDuration(double x){
    duration = x;
    }
    
}

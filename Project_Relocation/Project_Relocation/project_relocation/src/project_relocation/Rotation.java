/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

/**
 *
 * @author Marc
 */
public class Rotation extend/*
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
public class Rotation extends Orders{
    private double angle = 0;
    public Rotation(){
        Label l1 = new Label("Angle");    
    TextField tf1 = new TextField();
    this.getChildren().addAll(l1,tf1);
    }
    
    public double getAngle(){
    return angle;
    }
    public void setAngle(double x){
    angle = x;
    }
    
}
s Orders{
    private double angle = 0;
    
    public double getAngle(){
    return angle;
    }
    public void setAngle(double x){
    angle = x;
    }
    
}

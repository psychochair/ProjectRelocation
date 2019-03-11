
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

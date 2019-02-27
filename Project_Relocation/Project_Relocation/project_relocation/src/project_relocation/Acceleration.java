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
public class Acceleration extends Orders{
  
    private double accelerationValue = 0;
    private double durationAcceleration = 0;

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

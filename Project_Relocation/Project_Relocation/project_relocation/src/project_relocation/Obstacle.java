/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

/**
 *
 * @author sandr
 */
public class Obstacle {
    
    private double coi;
    private double[][] positions;
    private String imageLink= "";
    
    public Obstacle(){
        
    }

    public double getCoi() {
        return coi;
    }

    public void setCoi(double coi) {
        this.coi = coi;
    }

    public double[][] getPositions() {
        return positions;
    }

    public void setPositions(double[][] positions) {
        this.positions = positions;
    }

    public String getImagelink() {
        return imageLink;
    }

    public void setImagelink(String imagelink) {
        this.imageLink = imagelink;
    }
    
}

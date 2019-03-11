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
public class DynamicObject {
    
    private String imageLink = "";
    private double positionX = 0;
    private double positionY = 0;
    
    public DynamicObject(String imageLink, double positionY, double positionX){
    
    this.imageLink = imageLink;
    this.positionX = positionX;
    this.positionY = positionY;
      
    }
    
    public String getImageLink(){
    return imageLink;
    }
    public double getPositionX(){
    return positionX;
    }
    public double getPositionY(){
    return positionY;
    }
    
    public void setImageLink(String imageLink){
    this.imageLink = imageLink;
    
    }
    public void setPositionX(double x){
    this.positionX = x;
    }
    public void setPositionY(double y){
    this.positionY = y;
    }
    
}

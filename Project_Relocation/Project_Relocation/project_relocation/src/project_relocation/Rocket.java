/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.scene.shape.Ellipse;

/**
 *
 * @author sandr
 */
public class Rocket extends Ellipse {
    
    private double life;
    private double fuel;
    private int fuelCapacity;
    private int protection;
    private int engineType;
    private double posX= 0;
    private double posY= 0;
    private double angle= 0;
    private double time;
    private double acceleration= 0;
    
    public Rocket(double life, double fuel, int fuelC, int protection, int engineT ){
        this.life= life;
        this.fuel= fuel;
        this.fuelCapacity= fuelC;
        this.protection= protection;
        this.engineType= engineT;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getEngineType() {
        return engineType;
    }

    public void setEngineType(int engineType) {
        this.engineType = engineType;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration, double time) {
        
    }
    
    public double getActualSpeed(){
        
        return;
    }
    
    public void rotate(double angle){
        
    }
    
    public void move(){
        
    }
}

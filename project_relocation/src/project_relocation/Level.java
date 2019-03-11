/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.scene.layout.Pane;

/**
 *
 * @author sandr
 */
public class Level extends Pane{
    
    private String backgroundImgLink= ""; 
    private String floorImgLink= "";
    private Platform[] platforms;
    private String name;
    private String gravity;
    private DynamicObject[] dynamicObjs;
    private Obstacle[] obstacles;
    
    public Level(){
        
    }
    
    public String getBackgroundImg() {
        return backgroundImgLink;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImgLink = backgroundImg;
    }

    public String getFloorImg() {
        return floorImgLink;
    }

    public void setFloorImg(String floorImg) {
        this.floorImgLink = floorImg;
    }

    public Platform[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Platform[] platforms) {
        this.platforms = platforms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String game) {
        this.gravity = game;
    }

    public DynamicObject[] getDynamicObjs() {
        return dynamicObjs;
    }

    public void setDynamicObjs(DynamicObject[] dynamicObjs) {
        this.dynamicObjs = dynamicObjs;
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

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
    
    
    double levelHeight = Project_Relocation.sceneHeight - 120;
    double levelWidth = Project_Relocation.sceneWidth - 120;
    public Level(){
        
        this.setLayoutY(0);
        this.setLayoutX(120);
        this.setMinHeight(levelHeight);
        this.setMinWidth(levelWidth);
        setHeight(levelHeight);
        this.setStyle("-fx-border-width: 1;" +
                      "-fx-border-radius: 5;" + 
                      "-fx-border-color: black;");
        
        
        
        
        
        Rocket rocketShape = new Rocket();
        rocketShape.setRadiusX(20);
        rocketShape.setRadiusY(40);
        rocketShape.setFill(Color.BLACK);
      Image rocketImage = new Image("rocketProjFinal.png", 80,80,true,true);
      ImageView rocketImageView = new ImageView(rocketImage);
      rocketImageView.setLayoutX(-25.5);
      rocketImageView.setLayoutY(-44);
        Group rocketGroup = new Group();
        rocketGroup.getChildren().addAll(rocketShape, rocketImageView);
        rocketGroup.setLayoutY(levelHeight - 40);
        rocketGroup.setLayoutX(levelWidth/2);
        
        this.getChildren().add(rocketGroup);
        
        
        
        
        
        
        
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

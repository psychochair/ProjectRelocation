/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import java.time.Duration;
import java.util.ArrayList;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
    AnimationTimer timer;
    boolean rocketHasDied = false;
SequentialTransition theTimelineAnimation = new SequentialTransition();
      
        Group rocketGroup = new Group();
        
    private double rocketTranslateX = 0;
    private double rocketTranslateY = 0;
    Rocket rocketShape = new Rocket();
    
    private String backgroundImgLink= ""; 
    private String floorImgLink= "";
    private Platform[] platforms;
    private String name;
    private double gravity = 14;
    private DynamicObject[] dynamicObjs;
    private Obstacle[] obstacles;
    
    
    double levelHeight = Project_Relocation.sceneHeight - 120;
    double levelWidth = Project_Relocation.sceneWidth - 120;
    public Level(){

this.toBack();
        this.setLayoutY(0);
        this.setLayoutX(120);
        this.setMinHeight(levelHeight);
        this.setMinWidth(levelWidth);
        this.setMaxHeight(levelHeight);
        this.setMaxWidth(levelWidth);
        this.setStyle("-fx-border-width: 1;" +
                      "-fx-border-radius: 5;" + 
                      "-fx-border-color: black;");
        
        
        
        
        
        
        rocketShape.setRadiusX(20);
        rocketShape.setRadiusY(40);
        rocketShape.setFill(Color.BLACK);
      Image rocketImage = new Image("rocketProjFinal.png", 80,80,true,true);
      ImageView rocketImageView = new ImageView(rocketImage);
      rocketImageView.setLayoutX(-25.5);
      rocketImageView.setLayoutY(-44);
      
        rocketGroup.getChildren().addAll(rocketShape, rocketImageView);
        rocketGroup.setLayoutY(levelHeight - 60);
        rocketGroup.setLayoutX(levelWidth/2);
        
        
       this.getChildren().add(rocketGroup);
        
        
        
        
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                if(!rocketHasDied){
double realValueX = rocketGroup.getLayoutX() + rocketGroup.getTranslateX();
double realValueY = rocketGroup.getLayoutY() + rocketGroup.getTranslateY();
if(realValueX <=115+30 || realValueX >= (levelWidth +120 -40)){
rocketHasDied = true;
System.out.println("IS DEAD");
theTimelineAnimation.stop();
}else if(realValueY > levelHeight - 35 || realValueY <40){
    rocketHasDied = true;
    System.out.println("IS DEAD");
    theTimelineAnimation.stop();
}
            }  
            }
 
        };
        
        
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

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double game) {
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
    
    public void readOrders(ArrayList<Orders> x){
        
        rocketGroup.setTranslateX(0);
        rocketGroup.setTranslateY(0);
        rocketGroup.setRotate(0);
        rocketShape.setAngle(90);
        rocketShape.setPosX(0);
        rocketShape.setPosY(0);
        System.out.println(theTimelineAnimation.getChildren().size());
        
        theTimelineAnimation.stop();
        theTimelineAnimation.getChildren().clear();
        
        
    for(int i=0;i<x.size();i++){
    Orders theBlock = x.get(i);
                switch (theBlock.getClass().getName()) {
            case "project_relocation.Acceleration":
                
                double currentTranslateX = rocketShape.getPosX();
                double currentTranslateY = rocketShape.getPosY();
                
                Timeline accelerateTimeline = new Timeline();
                double accelerationValue = ((Acceleration)(theBlock)).getAcceleration();
                double accXValue = 0;
                if(rocketShape.getAngle() != 90 && rocketShape.getAngle() != 180){
                accXValue = accelerationValue*Math.cos(rocketShape.getAngle()*Math.PI/180);
                 }
                double accYValue = (accelerationValue *Math.sin(rocketShape.getAngle()*Math.PI/180)) - gravity;

                double accelerationTime = ((Acceleration)(theBlock)).getDuration();
                double finalX = currentTranslateX + (0.5*accelerationTime*accelerationTime*accXValue);
                double finalY = currentTranslateY + (-0.5*accelerationTime*accelerationTime*accYValue);
                rocketShape.setPosY(finalY);
                rocketShape.setPosX(finalX);
                
        KeyFrame move = new KeyFrame(javafx.util.Duration.millis(accelerationTime*1000),
                new KeyValue (rocketGroup.translateYProperty(), finalY),
                new KeyValue(rocketGroup.translateXProperty(), finalX));
        accelerateTimeline.getKeyFrames().add(move);
        accelerateTimeline.setAutoReverse(false);
        accelerateTimeline.setCycleCount(1);
                
        theTimelineAnimation.getChildren().add(accelerateTimeline);
                break;
                
                
                
                
                
                
                
                
            case "project_relocation.Wait":
                
            double currentTranslateForWait = rocketShape.getPosY();  
            Timeline waitTimeline = new Timeline();

            double waitValue = ((Wait)(theBlock)).getDuration();
            
            double finalYAfterWait = 0;
            if(currentTranslateForWait != 0){
            finalYAfterWait = currentTranslateForWait + (0.5*waitValue*waitValue*gravity);
            }
            
                
                
        KeyFrame wait = new KeyFrame(javafx.util.Duration.millis(waitValue*1000),
                new KeyValue (rocketGroup.translateYProperty(), finalYAfterWait));
        waitTimeline.getKeyFrames().add(wait);  
        waitTimeline.setAutoReverse(false);
        waitTimeline.setCycleCount(1);
        rocketShape.setPosY(finalYAfterWait);
        theTimelineAnimation.getChildren().add(waitTimeline);
        System.out.println("WAIT");              
                
                break;
                
                
                
                
                
            case "project_relocation.Rotation":
                
            double currentTranslateForRot = rocketShape.getPosY();
            Timeline rotationTimeline = new Timeline();
                
                
            double rotationValue = ((Rotation)(theBlock)).getAngle();
            
        double actualAngle = rocketShape.getAngle();
        double finalAngle = actualAngle + rotationValue;
        
        System.out.println(finalAngle + "ANGLE");
        if(finalAngle >=360){
        finalAngle -= 360;
        }
        
        rocketShape.setAngle(finalAngle);
            double finalYAfterRotation = 0;
            if(currentTranslateForRot != 0){
            finalYAfterRotation = currentTranslateForRot + (0.5*2*2*gravity);
            }
            
                
                
                
        KeyFrame rotate = new KeyFrame(javafx.util.Duration.millis(2000),
                new KeyValue (rocketGroup.translateYProperty(), finalYAfterRotation),
                new KeyValue(rocketGroup.rotateProperty(), -finalAngle + 90));
        rotationTimeline.getKeyFrames().add(rotate);  
        rotationTimeline.setAutoReverse(false);
        rotationTimeline.setCycleCount(1);
        
        theTimelineAnimation.getChildren().add(rotationTimeline);
        
        rocketShape.setPosY(finalYAfterRotation);
        System.out.println("ROTATE");
                
                
                
                
                

break;
        }

    }
    
    
    
    
        theTimelineAnimation.play();
        theTimelineAnimation.setOnFinished(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
theTimelineAnimation.stop();
            }
        
        
        });
        
        
        timer.start();
        
        
        
        
        
        
        
    }
}

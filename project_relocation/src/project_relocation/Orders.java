/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 *
 * @author Marc
 */
public class Orders extends VBox {

    double mouseX = 0;
    double mouseY = 0;

    double dropX = 0;
    double dropY = 0;

    double blocXPosition = this.getLayoutX();
    double blocYPosition = this.getLayoutY();
    boolean inTimeline = false;

    int positionInTimeline = 0;

    public Orders() {
        this.setSpacing(5);

        this.setStyle("-fx-background-color: #fff;"
                + "-fx-border-radius: 5;"
                + "-fx-border-color: black;" + "-fx-padding:5;-fx-border-width: 2;");

        this.setOnMouseDragged(new EventHandler<MouseEvent>() {
            
            public void handle(MouseEvent event) {
                if(!inTimeline){
                
                setTranslateX(event.getSceneX() - mouseX);
                setTranslateY(event.getSceneY() - mouseY);
                
                }else{
                setTranslateX(event.getSceneX() - mouseX);
                setTranslateY(event.getSceneY() - mouseY);
                }

            }
        });

        this.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                setMouseXY(event.getSceneX(), event.getSceneY());
            }
        });

        this.setOnMouseReleased(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                double yMouseDrop = event.getSceneY();
                double xMouseDrop = event.getSceneX();
                dropX = xMouseDrop;
                dropY = yMouseDrop;
                if (!inTimeline) {
                    //block was not already in the timeline
                    if (yMouseDrop > Project_Relocation.sceneHeight - 120) {
                    newBlocTordersList();
                        
                        inTimeline = true;

                        //ADD BLOCK TO TIMELINE
                        sendToTimeline();

                    } else {
                        inTimeline = false;
                        setTranslateX(0);
                        setTranslateY(0);
                    }

                } else {
//BLOCK WAS ALREADY IN TIMELINE
                    Timeline.removeOrder(positionInTimeline);
                    if (yMouseDrop > Project_Relocation.sceneHeight - 120) {
                        sendToTimeline();
                        inTimeline = true;

                    } else {
                        inTimeline = false;
deleteThisBlock();
                    }

                }

            }

        });

    }

    
    public void newBlocTordersList(){
                            

                        switch(this.getClass().getName()){
                            case "project_relocation.Acceleration": ((OrdersList)getParent()).newBlock(new Acceleration(),0);
                            break;
                            case "project_relocation.Wait": ((OrdersList)getParent()).newBlock(new Wait(),1);
                            break;
                            case "project_relocation.Rotation": ((OrdersList)getParent()).newBlock(new Rotation(),2);
                            break;
                        }
                        
    }
    public void setMouseXY(double x, double y) {
        this.mouseX = x -getTranslateX();
        this.mouseY = y - getTranslateY();
    }

    public void sendToTimeline() {
        GameUI.sendOrderToTimeline(this, dropY, dropX);

    }

    public void setPositionInTimeline(int x) {
        positionInTimeline = x;
    }
    
    public void deleteThisBlock(){
    ((OrdersList)getParent()).deleteOrder(this);
    }
}

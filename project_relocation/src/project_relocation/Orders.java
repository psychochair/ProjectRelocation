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
    double dropY= 0;
    
    double blocXPosition = this.getLayoutX();
    double blocYPosition = this.getLayoutY();
    boolean inTimeline = false;
    
    int positionInTimeline = 0;
    
    
    public Orders() {
        this.setSpacing(5);
        this.setStyle("-fx-background-color: #fff;-fx-padding:10;-fx-border-width: 2;"
                + "-fx-border-radius: 5;"
                + "-fx-border-color: black;");

        this.setOnMouseDragged(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                setTranslateX(event.getSceneX() - mouseX);
                setTranslateY(event.getSceneY() - mouseY);
                blocXPosition = getLayoutX() + getTranslateX();
                blocYPosition = getLayoutY() + getTranslateY();
            }
        });

        this.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                setMouseXY(event.getX(), event.getSceneY());
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
                    if (yMouseDrop > Project_Relocation.sceneHeight - 110) {
                        System.out.println("is dropped in timeline");

                        inTimeline = true;
                        
                        //ADD BLOCK TO TIMELINE
                        sendToTimeline();
 
                    } else {
                        System.out.println("is not dropped timeline");
                        inTimeline = false;
                        setTranslateX(0);
                        setTranslateY(0);
                    }

                } else {

                    System.out.println("WAS ALREADY IN TIMELINE");
                    Timeline.removeOrder(positionInTimeline);
                    if (yMouseDrop > Project_Relocation.sceneHeight - 110) {
                        System.out.println("is dropped in timeline");
                        sendToTimeline();
                        
                    } else {
                        System.out.println("is not dropped timeline");
                        inTimeline = false;
                        setTranslateX(0);
                        setTranslateY(0);

                    }

                }

            }

        });

    }

    public void setMouseXY(double x, double y) {
        this.mouseX = x;
        this.mouseY = y;
    }
    
    public void sendToTimeline(){
    GameUI.sendOrderToTimeline(this, dropY, dropX);
        
        
    }
}

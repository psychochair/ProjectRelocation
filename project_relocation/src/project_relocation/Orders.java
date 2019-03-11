/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

/**
 *
 * @author Marc
 */
public class Orders extends VBox{
    
    public Orders(){
        this.setSpacing(5);
        this.setStyle("-fx-background-color: #fff;-fx-padding:10;-fx-border-width: 2;" +
                      "-fx-border-radius: 5;" + 
                      "-fx-border-color: black;");
    
//      
//        this.setOnMouseDragged(new EventHandler<MouseEvent>() {
//            public void handle(MouseEvent event) {
//                block1.setX(event.getX() - 5);
//                block1.setY(event.getY() - 5);
//            }
//        });
//
//        block1.setOnMouseReleased(new EventHandler<MouseEvent>() {
//            public void handle(MouseEvent event) {
//                double xCenter = block1.getX() + 5;
//                double yCenter = block1.getY() + 5;
//                if (!block1.inTimeline()) {
//                    //block is not already in the timeline
//                    if (yCenter > timeline.getY() && yCenter < (timeline.getY() + timeline.getHeight()) && xCenter > timeline.getX() && xCenter < (timeline.getX() + timeline.getWidth())) {
//                        System.out.println("is dropped in timeline");
//                        
//                        block1.setInTimeline(true);
//                        int timelineSize = ordersList.size();
//                        if (timelineSize == 0) {
//                            block1.setX((timeline.getWidth() / 2) - 5);
//                            block1.setY(timeline.getY() + (timeline.getHeight() / 2) - 5);
//                            block1.setPositionInTimeline(0);
//                            ordersList.add(block1);
//
//                        } else {
//                            for (int i = 0; i < timelineSize; i++) {
//                                double timelineX = ordersList.get(i).getXCenter();
//                                if (xCenter < timelineX) {
//                                    block1.setPositionInTimeline(i);
//                                    ordersList.add(i, block1);
//                                    return;
//                                }
//
//                            }
//                            ordersList.add(block1);
//                        }
//                    } else {
//                        System.out.println("is not dropped timeline");
//                        block1.setInTimeline(false);
//                        block1.setPositionInTimeline(-1);
//                        block1.setX(originalX);
//                        block1.setY(originalY);
//                    }
//
//                } else {
////the block was already in the timeline
//                ordersList.remove(block1.getPositionInTimeline());
//                    if (yCenter > timeline.getY() && yCenter < (timeline.getY() + timeline.getHeight()) && xCenter > timeline.getX() && xCenter < (timeline.getX() + timeline.getWidth())) {
//                        System.out.println("is dropped in timeline");
//                        
//                        block1.setInTimeline(true);
//                        
//                        int timelineSize = ordersList.size();
//                        if (timelineSize == 0) {
//                            block1.setX((timeline.getWidth() / 2) - 5);
//                            block1.setY(timeline.getY() + (timeline.getHeight() / 2) - 5);
//                            block1.setPositionInTimeline(0);
//                            ordersList.add(block1);
//
//                        } else {
//                            for (int i = 0; i < timelineSize; i++) {
//                                double timelineX = ordersList.get(i).getXCenter();
//                                if (xCenter < timelineX) {
//                                    block1.setPositionInTimeline(i);
//                                    ordersList.add(i, block1);
//                                    return;
//                                }
//
//                            }
//                            ordersList.add(block1);
//                        }
//                    } else {
//                        System.out.println("is not dropped in timeline");
////the block is not dropped into the timeline so it is returned to the beginning position
//                        block1.setPositionInTimeline(-1);
//                        block1.setInTimeline(false);
//                        block1.setX(originalX);
//                        block1.setY(originalY);
//
//                    }
//
//                }
//
//            }
//
//        });
//
//        
//        
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}

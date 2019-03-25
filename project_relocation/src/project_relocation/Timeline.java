/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import java.util.ArrayList;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author sandr
 */
//public Rocket() throws FileNotFoundException{
//Image img = new Image(new FileInputStream("C:\\Users\\Marc\\Desktop\\rocketProjFinal.png"));
//this.setFill(new ImagePattern(img));
//this.setRadiusX(100);
//this.setRadiusY(100);
//this.setCenterX(100);
//this.setCenterY(100);
//this.setStroke(Color.BLACK);
//this.setStrokeWidth(1);
//}
public class Timeline extends Pane {
    
    
    private static ArrayList<Orders> ordersList = new ArrayList<Orders>();

    public Timeline() {
        
        Pane playAroundButton = new Pane();
        playAroundButton.setStyle("-fx-background-color: #fff;"
                + "-fx-border-radius: 5;");
        playAroundButton.setMinWidth(100);
        playAroundButton.setMaxWidth(100);
        playAroundButton.setMinHeight(100);
        playAroundButton.setMaxHeight(100);
        playAroundButton.setLayoutX(Project_Relocation.sceneWidth - 110);
        playAroundButton.setLayoutY(10);
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(new Double[]{
        30.0,20.0
        ,30.0,80.0
        ,80.0,50.0}
        );
        triangle.setFill(Color.WHITE);
        
        Circle playButton = new Circle(50,50,50, Color.RED);
        playAroundButton.getChildren().addAll(playButton, triangle);
        playAroundButton.setTranslateZ(300);
        
        
        
        
        
        this.getChildren().add(playAroundButton);
        
        //SET WIDTH AND HEIGHT TIMELINE
        this.setWidth(Project_Relocation.sceneWidth);
        this.setMinHeight(120);
        this.setMaxHeight(120);

        //STYLE OF TIMELINE
        this.setStyle("-fx-background-color: #fff;-fx-border-width: 2;"
                + "-fx-border-radius: 5;"
                + "-fx-border-color: black;");
        this.setTranslateX(0);
        
        

    }
    
    public void scrollBlocs(double xvalue){
        if(!ordersList.isEmpty()){
                if(ordersList.get(0).getTranslateX()+xvalue<=2){
     for(int i=0;i<ordersList.size();i++){
    ordersList.get(i).setTranslateX(ordersList.get(i).getTranslateX()+xvalue);
    
    
    }
        }
        
        }


    
    }
    

    public ArrayList<Orders> getOrders() {
        return ordersList;
    }

    public void addOrder(Orders order, double positionX, double positionY) {        

        if (ordersList.isEmpty()) {
            order.setTranslateX(2);
            order.setTranslateY(0 -order.getLayoutY()+Project_Relocation.sceneHeight-120+(60 - order.getHeight()/2));
            ordersList.add(order);
            

        } else {

            double blockPositionX = order.getTranslateX();
            boolean isAlreadyAdded = false;
            for (int i = 0; i < ordersList.size(); i++) {
                double timelineX = ordersList.get(i).getTranslateX();
                if (blockPositionX < timelineX && !isAlreadyAdded) {
                    ordersList.get(i).setTranslateX(timelineX);
                    order.setTranslateX(timelineX);
                    ordersList.add(i, order);
                    ordersList.get(i).setPositionInTimeline(i+1);
                    order.positionInTimeline = i;
                    isAlreadyAdded = true;
                    order.setTranslateY(-order.getLayoutY()+Project_Relocation.sceneHeight-60-(order.getHeight()/2));
                } else {
                    if (isAlreadyAdded) {
                        ordersList.get(i).setTranslateX(timelineX + 120);
                        ordersList.get(i).setPositionInTimeline(i);
                        
                    }

                }

            }
            if (!isAlreadyAdded) {
                order.setTranslateY(-order.getLayoutY()+Project_Relocation.sceneHeight-60-(order.getHeight()/2));      
                order.setTranslateX(ordersList.get(ordersList.size()-1).getTranslateX()+120);
                ordersList.add(order);
                order.positionInTimeline = ordersList.size()-1;
            }


        }
        System.out.println("SIZE AFTER DROPPED = "+ordersList.size());
    }

    public void modifyOrder(Orders[] orders) {

    }

    public void swapOrder(Orders[] orders) {

    }

    public static void removeOrder(int x) {
        ordersList.remove(x);
        if(x!=ordersList.size()){
        boolean reachedX = false;
                    for (int i = 0; i < ordersList.size(); i++) {
                        
                        
                        ordersList.get(i).setPositionInTimeline(i);
                        
                        if(i==x){
                        reachedX = true;
                        }
                        if(reachedX){
                        ordersList.get(i).setTranslateX(ordersList.get(i).getTranslateX()-120);
                        }
                

                }
        }
        
        
        System.out.println("Size after removed = "+ordersList.size());
        
                    
    }

    public double getWidthTimeline() {

        return this.getWidth();
    }
    
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import java.util.ArrayList;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
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
public class Timeline extends HBox {

    private static ArrayList<Orders> ordersList = new ArrayList<Orders>();

    public Timeline() {
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

    public ArrayList<Orders> getOrders() {
        return ordersList;
    }

    public void addOrder(Orders order, double positionX, double positionY) {        
        
        if(order.getClass().getName() == "project_relocation.Acceleration"){
        
        }else if(order.getClass().getName() == "project_relocation.Wait"){
        
        }else if(order.getClass().getName() == "project_relocation.Rotation"){
        
        }
        
        
        System.out.println(order.getClass().getName());

        if (ordersList.isEmpty()) {
            order.setTranslateX(2);
            order.setTranslateY(0 -order.getLayoutY()+Project_Relocation.sceneHeight-120+(60 - order.getHeight()/2));
            ordersList.add(order);

        } else {

            int timelineSize = ordersList.size();
            double blockPositionX = order.getTranslateX();
            boolean isAlreadyAdded = false;
            for (int i = 0; i < timelineSize; i++) {
                double timelineX = ordersList.get(i).getTranslateX();
                if (blockPositionX < timelineX && !isAlreadyAdded) {
                    ordersList.get(i).setTranslateX(timelineX + 120);
                    order.setTranslateX(timelineX);
                    ordersList.add(i, order);
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
        System.out.println(ordersList.size());
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
                    
    }

    public double getWidthTimeline() {

        return this.getWidth();
    }

}

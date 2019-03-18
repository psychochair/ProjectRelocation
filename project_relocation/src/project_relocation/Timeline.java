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
        this.setMinHeight(90);
        this.setMaxHeight(90);

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
        System.out.println(order.getClass().getName());

        if (ordersList.isEmpty()) {
            order.setTranslateX((getWidthTimeline() / 2) - order.getWidth() / 2);
            ordersList.add(order);

        } else {

            int timelineSize = ordersList.size();
            double blockPositionX = order.getTranslateX();
            boolean wasAdded = false;
            for (int i = 0; i < timelineSize; i++) {
                double timelineX = ordersList.get(i).getTranslateX();
                if (blockPositionX < timelineX && !wasAdded) {
                    ordersList.get(i).setTranslateX(timelineX + 55);
                    order.setTranslateX(timelineX - 110);
                    ordersList.add(i, order);
                    order.positionInTimeline = i;
                    wasAdded = true;
                } else {
                    if (wasAdded) {
                        ordersList.get(i).setTranslateX(timelineX + 55);
                    } else {
                        ordersList.get(i).setTranslateX(timelineX - 55);
                    }

                }

            }
            if (!wasAdded) {
                ordersList.add(order);

            }

System.out.println(ordersList.size());
        }
    }

    public void modifyOrder(Orders[] orders) {

    }

    public void swapOrder(Orders[] orders) {

    }

    public static void removeOrder(int x) {
        ordersList.remove(x);
    }

    public double getWidthTimeline() {

        return this.getWidth();
    }

}

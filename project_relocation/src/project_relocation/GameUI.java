/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.scene.layout.BorderPane;

/**
 *
 * @author Marc
 */
public class GameUI extends BorderPane{
static Timeline timeline = new Timeline();
OrdersList ordersList = new OrdersList();

    public GameUI(){




this.setBottom(timeline);
this.setLeft(ordersList);
        
        
        
}
    
    
public static void sendOrderToTimeline(Orders order, double positionx, double positiony){
timeline.addOrder(order, positionx, positiony);
}
}

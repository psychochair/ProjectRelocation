/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Marc
 */
public class GameUI extends BorderPane{
Timeline timeline = new Timeline();
OrdersList ordersList = new OrdersList();

    public GameUI(){
        
    timeline.setOnScroll(new EventHandler<ScrollEvent>() {
        @Override
        public void handle(ScrollEvent event) {
            scrollBlocs(event.getDeltaX());
        }
    });

this.setBottom(timeline);
this.setLeft(ordersList);
        
        
        
}

public void sendOrderToTimeline(Orders order, double positionx, double positiony){
timeline.addOrder(order, positionx, positiony);
}

public void scrollBlocs(double xvalue){
timeline.scrollBlocs(xvalue);

}
}

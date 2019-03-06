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
    
    public GameUI(){
Timeline timeline = new Timeline();
OrdersList ordersList = new OrdersList();
this.setBottom(timeline);
this.setLeft(ordersList);
        
        
        
}
    
}

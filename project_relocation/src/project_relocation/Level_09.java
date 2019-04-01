/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import java.util.ArrayList;

/**
 *
 * @author sandr
 */
public class Level_09 extends GameUI{
    
    Level levelUI=new Level();
     
    public Level_09(){



    
    this.getChildren().add(levelUI);
    
    }
public void readOrders(ArrayList<Orders> x){
levelUI.readOrders(x);


}
}

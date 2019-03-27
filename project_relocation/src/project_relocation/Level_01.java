package project_relocation;

import java.util.ArrayList;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


/**
 *
 * @author chasa
 */
public class Level_01 extends GameUI{
        Level levelUI=new Level();
    public Level_01(){



    
    this.getChildren().add(levelUI);
    
    }
public void readOrders(ArrayList<Orders> x){
levelUI.readOrders(x);


}
}
    

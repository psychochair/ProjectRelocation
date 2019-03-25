package project_relocation;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


/**
 *
 * @author chasa
 */
public class Level_01 extends GameUI{
    
    public Level_01(){
    
    Pane pane= new Pane();

    Level level_1=new Level();
    
    pane.getChildren().add(level_1);
    
   this.getChildren().addAll(pane);
    
    }
    
    
}

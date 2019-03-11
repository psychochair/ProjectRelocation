package project_relocation;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author chasa
 */
public class Level_1 extends GameUI{
    
    Level level_1=new Level();
    public static Button testButton=new Button("test");    
    public static BorderPane bp=new BorderPane(testButton);
    public static Scene levelScene=new Scene(bp);
    

    
    
}

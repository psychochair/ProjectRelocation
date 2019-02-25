/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Marc
 */
public class Project_Relocation extends Application{

    /**
     * @param args the command line arguments
     */
   

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        menu1 menu1 = new menu1();
        menu2 menu2 = new menu2();

        
        Scene sceneMenu1 = new Scene(menu1, 1300,800);
        Scene sceneMenu2 = new Scene(menu2, 1300,800);
        
        //scene.
        primaryStage.setTitle("Project_Relocation");
        primaryStage.setScene(sceneMenu1);
        primaryStage.show();
        
    }
    
    
     public static void main(String[] args) {
        launch(args);
    }
    
}

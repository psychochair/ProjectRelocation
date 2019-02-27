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

   
private static Stage mainStage;


//SET METHOD FOR THE MAIN STAGE - SET A NEW SCENE
public static void setScene(Scene x) {
        mainStage.setScene(x);
    }

//DIMENSIONS OF SCENE
static double sceneHeight = 900;
static double sceneWidth = 1700;

//CREATE NEW MENUS
static menu1 menu1 = new menu1();
static menu2 menu2 = new menu2();

//CREATE NEW SCENES FROM MENUS
static Scene sceneMenu1 = new Scene(menu1, sceneWidth,sceneHeight);
static Scene sceneMenu2 = new Scene(menu2, sceneWidth,sceneHeight);

//METHOD TO RETURN THE MENUS
public static Scene getMenu1(){
return sceneMenu1;
}
public static Scene getMenu2(){
return sceneMenu2;
}

    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        
        
        
        
        
        
        
        //scene.
        primaryStage.setTitle("Project_Relocation");
        primaryStage.setScene(sceneMenu1);
        primaryStage.show();
        
    }
    
    
     public static void main(String[] args) {
        launch(args);
    }
    
}


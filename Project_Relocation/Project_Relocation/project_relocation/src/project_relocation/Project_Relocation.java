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
final static double sceneHeight = 900;
final static double sceneWidth = 1700;


//CREATE NEW MENUS
static menu1 menu1 = new menu1();
static menu2 newGameMenu = new menu2();
static menu3 loadGameMenu = new menu3();


//CREATE LEVELS
static Level_1 level1 = new Level_1();
static Scene sceneLevel1 = new Scene(level1, sceneWidth,sceneHeight);



//CREATE NEW SCENES FROM MENUS
static Scene sceneMenu1 = new Scene(menu1, sceneWidth,sceneHeight);
static Scene sceneNewGameMenu = new Scene(newGameMenu, sceneWidth,sceneHeight);
static Scene sceneLoadGameMenu = new Scene(loadGameMenu, sceneWidth,sceneHeight);

//METHOD TO RETURN THE MENUS
public static Scene getMenu1(){
return sceneMenu1;
}
public static Scene getNewGameMenu(){
return sceneNewGameMenu;
}
public static Scene getLoadGameMenu(){
return sceneLoadGameMenu;
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


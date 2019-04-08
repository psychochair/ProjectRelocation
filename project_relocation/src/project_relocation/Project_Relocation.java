/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import java.nio.file.Paths;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author Marc
 */
public class Project_Relocation extends Application{
    
//Design Values
        static int insetSize1=10;
        
        static int buttonFontSize1=32;
        static int buttonFontSize2=14;
        static String buttonFontFamily1="\"AR Delaney\"";
        
        static int labelFontSize1=44;
        static String labelFontFamily1="\"AR Delaney\"";
        
        static int comboBoxFontSize1=28;
        static String comboBoxFontFamily1="\"AR Delaney\"";        
        
        
        static String buttonStyle1="-fx-background-color: "
                    + "linear-gradient(#ffd65b, #e68400), "
                    + "linear-gradient(#ffef84, #f2ba44), "
                    + "linear-gradient(#ffea6a, #efaa22), "
                    + "linear-gradient(#ffe657 0%, #f8c202 50%, #eea10b 100%), "
                    + "linear-gradient(from 0% 0% to 15% 50%, "
                    + "rgba(255,255,255,0.9), "
                    + "rgba(255,255,255,0)); "
                + "-fx-font-family: "+buttonFontFamily1+"; "
                + "-fx-background-radius: 30; "
                + "-fx-background-insets: 0,1,2,3,0; "
                + "-fx-text-fill: #654b00; "
                + "-fx-font-weight: bold; "
                + "-fx-font-size: "+buttonFontSize1+"px; "
                + "-fx-padding: 10 20 10 20;";
        
        static String buttonStyle2="-fx-background-color: "
                    + "linear-gradient(#ffd65b, #e68400), "
                    + "linear-gradient(#ffef84, #f2ba44), "
                    + "linear-gradient(#ffea6a, #efaa22), "
                    + "linear-gradient(#ffe657 0%, #f8c202 50%, #eea10b 100%), "
                    + "linear-gradient(from 0% 0% to 15% 50%, "
                    + "rgba(255,255,255,0.9), "
                    + "rgba(255,255,255,0)); "
                + "-fx-font-family: "+buttonFontFamily1+"; "
                + "-fx-background-radius: 30; "
                + "-fx-background-insets: 0,1,2,3,0; "
                + "-fx-text-fill: #654b00; "
                + "-fx-font-weight: bold; "
                + "-fx-font-size: "+buttonFontSize2+"px; "
                + "-fx-padding: 10 20 10 20;";
        
        static String labelStyle1="-fx-font-color: "
                    + "linear-gradient(#ffd65b, #e68400), "
                    + "linear-gradient(#ffef84, #f2ba44), "
                    + "linear-gradient(#ffea6a, #efaa22), "
                    + "linear-gradient(#ffe657 0%, #f8c202 50%, #eea10b 100%), "
                    + "linear-gradient(from 0% 0% to 15% 50%, "
                    + "rgba(255,255,255,0.9), "
                    + "rgba(255,255,255,0)); "
                + "-fx-font-family: "+labelFontFamily1+"; "
                + "-fx-text-fill: #654b00; "
                + "-fx-font-weight: bold; "
                + "-fx-font-size: "+labelFontSize1+"px; "
                + "-fx-padding: 10 20 10 20;";
        
        static String comboBoxStyle1="-fx-background-color: "
                    + "linear-gradient(#ffd65b, #e68400), "
                    + "linear-gradient(#ffef84, #f2ba44), "
                    + "linear-gradient(#ffea6a, #efaa22), "
                    + "linear-gradient(#ffe657 0%, #f8c202 50%, #eea10b 100%), "
                    + "linear-gradient(from 0% 0% to 15% 50%, "
                    + "rgba(255,255,255,0.9), "
                    + "rgba(255,255,255,0)); "
                + "-fx-font-family: "+comboBoxFontFamily1+"; "
                + "-fx-background-radius: 30; "
                + "-fx-background-insets: 0,1,2,3,0; "
                + "-fx-text-fill: #654b00; "
                + "-fx-font-weight: bold; "
                + "-fx-font-size: "+comboBoxFontSize1+"px; "
                + "-fx-padding: 10 20 10 20;";    

//Creating default user
    public static User user=new User();
   
    private static Stage mainStage;

    //Songs
        Media song=new Media(Paths.get("src/song1.mp3").toUri().toString());
        MediaPlayer songPlayer=new MediaPlayer(song);    

    //SET METHOD FOR THE MAIN STAGE - SET A NEW SCENE
    public static void setScene(Scene x) {
            mainStage.setScene(x);
        }

    //DIMENSIONS OF SCENE
    final static double sceneHeight = 650;
    final static double sceneWidth = 1300;


    //CREATE NEW MENUS
    static menu1 menu1 = new menu1();
    static menu2 newGameMenu = new menu2();
    static menuLoadUser loadUserMenu = new menuLoadUser();
    static menuNewUser newUserMenu=new menuNewUser();
    static menuSelection selectionMenu = new menuSelection();



    //CREATE LEVELS
    static Level_01 level1 = new Level_01();
    static Level_02 level2 = new Level_02();
    static Level_03 level3 = new Level_03();
    static Level_04 level4 = new Level_04();
    static Level_05 level5 = new Level_05();
    static Level_06 level6 = new Level_06();
    static Level_07 level7 = new Level_07();
    static Level_08 level8 = new Level_08();
    static Level_09 level9 = new Level_09();
    static Level_10 level10 = new Level_10();
    static Level_11 level11 = new Level_11();
    static Level_12 level12 = new Level_12();
    static Level_13 level13 = new Level_13();
    static Level_14 level14 = new Level_14();
    static Level_15 level15 = new Level_15();
    static Level_16 level16= new Level_16();
    static Level_17 level17 = new Level_17();
    static Level_18 level18 = new Level_18();


    //CREATE NEW SCENES FROM MENUS
    static Scene sceneMenu1 = new Scene(menu1, sceneWidth,sceneHeight);
    static Scene sceneNewGameMenu = new Scene(newGameMenu, sceneWidth,sceneHeight);
    static Scene sceneNewUserMenu= new Scene(newUserMenu, sceneWidth,sceneHeight);
    static Scene sceneLoadUserMenu = new Scene(loadUserMenu, sceneWidth,sceneHeight);
    static Scene sceneSelectionMenu = new Scene(selectionMenu, sceneWidth, sceneHeight);

    static Scene sceneLevel1 = new Scene(level1, sceneWidth,sceneHeight);
    static Scene sceneLevel2 = new Scene(level2, sceneWidth,sceneHeight);
    static Scene sceneLevel3 = new Scene(level3, sceneWidth,sceneHeight);
    static Scene sceneLevel4 = new Scene(level4, sceneWidth,sceneHeight);
    static Scene sceneLevel5 = new Scene(level5, sceneWidth,sceneHeight);
    static Scene sceneLevel6 = new Scene(level6, sceneWidth,sceneHeight);
    static Scene sceneLevel7 = new Scene(level7, sceneWidth,sceneHeight);
    static Scene sceneLevel8 = new Scene(level8, sceneWidth,sceneHeight);
    static Scene sceneLevel9 = new Scene(level9, sceneWidth,sceneHeight);
    static Scene sceneLevel10 = new Scene(level10, sceneWidth,sceneHeight);
    static Scene sceneLevel11 = new Scene(level11, sceneWidth,sceneHeight);
    static Scene sceneLevel12 = new Scene(level12, sceneWidth,sceneHeight);
    static Scene sceneLevel13 = new Scene(level13, sceneWidth,sceneHeight);
    static Scene sceneLevel14 = new Scene(level14, sceneWidth,sceneHeight);
    static Scene sceneLevel15 = new Scene(level15, sceneWidth,sceneHeight);
    static Scene sceneLevel16 = new Scene(level16, sceneWidth,sceneHeight);
    static Scene sceneLevel17 = new Scene(level17, sceneWidth,sceneHeight);
    static Scene sceneLevel18 = new Scene(level18, sceneWidth,sceneHeight);


    //METHOD TO RETURN THE MENUS
    public static Scene getMenu1(){
            //Music 
            Media song=new Media(Paths.get("src/song1.mp3").toUri().toString());
            MediaPlayer songPlayer=new MediaPlayer(song);
            songPlayer.play();
            return sceneMenu1;
        }
        public static Scene getNewGameMenu(){
            return sceneNewGameMenu;
        }
        public static Scene getLoadGameMenu(){
            return sceneLoadUserMenu;
        }
        public static Scene getNewUserMenu(){
                return sceneNewUserMenu;
            }
        public static Scene getSelectionMenu() {
            return sceneSelectionMenu;
        }

        public static Scene getSceneLevel1() {
            return sceneLevel1;
        }

        public static Scene getSceneLevel2() {
            return sceneLevel2;
        }

        public static Scene getSceneLevel3() {
            return sceneLevel3;
        }

        public static Scene getSceneLevel4() {
            return sceneLevel4;
        }

        public static Scene getSceneLevel5() {
            return sceneLevel5;
        }

        public static Scene getSceneLevel6() {
            return sceneLevel6;
        }

        public static Scene getSceneLevel7() {
            return sceneLevel7;
        }

        public static Scene getSceneLevel8() {
            return sceneLevel8;
        }

        public static Scene getSceneLevel9() {
            return sceneLevel9;
        }

        public static Scene getSceneLevel10() {
            return sceneLevel10;
        }

        public static Scene getSceneLevel11() {
            return sceneLevel11;
        }

        public static Scene getSceneLevel12() {
            return sceneLevel12;
        }

        public static Scene getSceneLevel13() {
            return sceneLevel13;
        }

        public static Scene getSceneLevel14() {
            return sceneLevel14;
        }

        public static Scene getSceneLevel15() {
            return sceneLevel15;
        }

        public static Scene getSceneLevel16() {
            return sceneLevel16;
        }

        public static Scene getSceneLevel17() {
            return sceneLevel17;
        }

        public static Scene getSceneLevel18() {
            return sceneLevel18;
        }


        public void start(Stage primaryStage) throws Exception {
            mainStage = primaryStage;

            //scene.
            primaryStage.setTitle("Project_Relocation");
            primaryStage.setScene(sceneMenu1);
            primaryStage.show();
    //Music 
            songPlayer.play();        
        
    }
    
    
     public static void main(String[] args) {
        launch(args);
    }
    
}


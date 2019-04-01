/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author sandr
 */
public class menuSelection extends BorderPane implements UI {
    
        double heightImage = 100;
        double widthImage = 100;
        
    public menuSelection(){
        
//Design Values
        int insetSize1=10;
        
        int buttonFontSize1=32;
        int buttonFontSize2=14;
        String buttonFontFamily1="\"AR Delaney\"";
        
        int labelFontSize1=44;
        String labelFontFamily1="\"AR Delaney\"";
        
        int comboBoxFontSize1=28;
        String comboBoxFontFamily1="\"AR Delaney\"";        
        
        
        String buttonStyle1="-fx-background-color: "
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
        
        String labelStyle1="-fx-font-color: "
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
        
        String comboBoxStyle1="-fx-background-color: "
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
        
//Background image
        Image background = new Image("menu1Background2.png",1300,650,true,true);
        ImageView backgroundView = new ImageView(background);
        
        this.getChildren().add(backgroundView);





//Code starts here        
        
        GridPane table = new GridPane();
        table.setAlignment(Pos.CENTER);
        table.setHgap(widthImage);
        table.setVgap(heightImage/4);
        
        //GRID PANE FOR BUTTONS CHOICE
        
        Button bMission1 = new Button("Mission 1");
        Button bMission2 = new Button("Mission 2");
        Button bMission3 = new Button("Mission 3");
        Button bMission4 = new Button("Mission 4");
        Button bMission5 = new Button("Mission 5");
        Button bMission6 = new Button("Mission 6");
        Button bMission7 = new Button("Mission 7");
        Button bMission8 = new Button("Mission 8");
        Button bMission9 = new Button("Mission 9");
        Button bMission10= new Button("Mission 10");
        Button bMission11= new Button("Mission 11");
        Button bMission12= new Button("Mission 12");
        Button bMission13= new Button("Mission 13");
        Button bMission14= new Button("Mission 14");
        Button bMission15= new Button("Mission 15");
        Button bMission16= new Button("Mission 16");
        Button bMission17= new Button("Mission 17");
        Button bMission18= new Button("Mission 18");
        
        bMission1.setStyle(buttonStyle1);
        bMission2.setStyle(buttonStyle1);
        bMission3.setStyle(buttonStyle1);
        bMission4.setStyle(buttonStyle1);
        bMission5.setStyle(buttonStyle1);
        bMission6.setStyle(buttonStyle1);
        bMission7.setStyle(buttonStyle1);
        bMission8.setStyle(buttonStyle1);
        bMission9.setStyle(buttonStyle1);
        bMission10.setStyle(buttonStyle1);
        bMission11.setStyle(buttonStyle1);
        bMission12.setStyle(buttonStyle1);
        bMission13.setStyle(buttonStyle1);
        bMission14.setStyle(buttonStyle1);
        bMission15.setStyle(buttonStyle1);
        bMission16.setStyle(buttonStyle1);
        bMission17.setStyle(buttonStyle1);
        bMission18.setStyle(buttonStyle1);
        
        
        
        
        

         this.setCenter(table);
        
       
        imageLevelLayout("testLevel.jpg", 1, table);
        imageLevelLayout("testLevel.jpg",  2, table);
        imageLevelLayout("testLevel.jpg",  3, table);
        imageLevelLayout("testLevel.jpg",  4, table);
        imageLevelLayout("testLevel.jpg",  5, table);
        imageLevelLayout("testLevel.jpg",  6, table);
        imageLevelLayout("testLevel.jpg",  7, table);
        imageLevelLayout("testLevel.jpg",  8, table);
        imageLevelLayout("testLevel.jpg",  9, table);
        imageLevelLayout("testLevel.jpg",  10, table);
        imageLevelLayout("testLevel.jpg",  11, table);
        imageLevelLayout("testLevel.jpg",  12, table);
        imageLevelLayout("testLevel.jpg",  13, table);
        imageLevelLayout("testLevel.jpg",  14, table);
        imageLevelLayout("testLevel.jpg",  15, table);
        imageLevelLayout("testLevel.jpg",  16, table);
        imageLevelLayout("testLevel.jpg",  17, table);
        imageLevelLayout("testLevel.jpg",  18, table);
        
        buttonLevelLayout(bMission1, 1, table);
        buttonLevelLayout(bMission2,  2, table);
        buttonLevelLayout(bMission3,  3, table);
        buttonLevelLayout(bMission4,  4, table);
        buttonLevelLayout(bMission5,  5, table);
        buttonLevelLayout(bMission6,  6, table);
        buttonLevelLayout(bMission7,  7, table);
        buttonLevelLayout(bMission8,  8, table);
        buttonLevelLayout(bMission9,  9, table);
        buttonLevelLayout(bMission10,  10, table);
        buttonLevelLayout(bMission11,  11, table);
        buttonLevelLayout(bMission12,  12, table);
        buttonLevelLayout(bMission13,  13, table);
        buttonLevelLayout(bMission14,  14, table);
        buttonLevelLayout(bMission15,  15, table);
        buttonLevelLayout(bMission16,  16, table);
        buttonLevelLayout(bMission17,  17, table);
        buttonLevelLayout(bMission18,  18, table);

            
        bMission1.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel1());
            }
        });
        bMission2.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel2());
            }
        });
        bMission3.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel3());
            }
        });
        bMission4.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel4());
            }
        });
        bMission4.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel4());
            }
        });
        bMission5.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel5());
            }
        });
        bMission6.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel6());
            }
        });
        bMission7.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel7());
            }
        });
        bMission8.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel8());
            }
        });
        bMission9.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel9());
            }
        });
        bMission10.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel10());
            }
        });
        bMission11.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel11());
            }
        });
        bMission12.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel12());
            }
        });
        bMission13.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel13());
            }
        });
        bMission14.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel14());
            }
        });
        bMission15.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel15());
            }
        });
        bMission16.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel16());
            }
        });
        bMission17.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel17());
            }
        });
        bMission18.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.getSceneLevel18());
            }
        });
        
            
    }
        public void imageLevelLayout(String url, Integer numberMission, GridPane table){
        
            int x=0;
            int y=0;
            ImageView image1 = new ImageView();
            Image imageMission1 = new Image(url);
            image1.setPreserveRatio(true);
            image1.setFitHeight(heightImage);
            image1.setFitWidth(widthImage);
            image1.setImage(imageMission1);
            
            if(numberMission==1 || numberMission==4 || numberMission==7 || numberMission==10 || numberMission==13 || numberMission==16 ){
                x= 0;
                y= (numberMission+2) /3 -1;
            }
            
            else if(numberMission%3 == 0){
                if(numberMission==3 || numberMission==6 || numberMission==9 || numberMission==12 || numberMission==15 || numberMission==18 ){
                    x= 2;
                    y= (numberMission/3) - 1;
                }
            }
               else if((numberMission+1) %3 == 0){
                
                    x= 1;
                    y= ((numberMission+1)/3) - 1;
                
            }
            
            
            table.add(image1, x, y);
            
        }
        
        public void buttonLevelLayout(Button bMission, Integer numberMission, GridPane table){
        
            int x=0;
            int y=0;
            
           
            if(numberMission==1 || numberMission==4 || numberMission==7 || numberMission==10 || numberMission==13 || numberMission==16 ){
                x= 0;
                y= (numberMission+2) /3 -1;
            }
            
            else if(numberMission%3 == 0){
                if(numberMission==3 || numberMission==6 || numberMission==9 || numberMission==12 || numberMission==15 || numberMission==18 ){
                    x= 2;
                    y= (numberMission/3) - 1;
                }
            }
            else if((numberMission+1) %3 == 0){
                
                    x= 1;
                    y= ((numberMission+1)/3) - 1;
                
            }
             
            table.add(bMission, x, y);
            
        }
        
        
}


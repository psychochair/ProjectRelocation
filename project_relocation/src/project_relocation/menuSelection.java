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
        

         this.setCenter(table);
        
       
        imageLevelLayout("alien.png", 1, table);
        imageLevelLayout("alien.png",  2, table);
        imageLevelLayout("alien.png",  3, table);
        imageLevelLayout("alien.png",  4, table);
        imageLevelLayout("alien.png",  5, table);
        imageLevelLayout("alien.png",  6, table);
        imageLevelLayout("alien.png",  7, table);
        imageLevelLayout("alien.png",  8, table);
        imageLevelLayout("alien.png",  9, table);
        imageLevelLayout("alien.png",  10, table);
        imageLevelLayout("alien.png",  11, table);
        imageLevelLayout("alien.png",  12, table);
        imageLevelLayout("alien.png",  13, table);
        imageLevelLayout("alien.png",  14, table);
        imageLevelLayout("alien.png",  15, table);
        imageLevelLayout("alien.png",  16, table);
        imageLevelLayout("alien.png",  17, table);
        imageLevelLayout("alien.png",  18, table);
        
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
            image1.setFitHeight(heightImage- 25);
            image1.setFitWidth(widthImage- 25);
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


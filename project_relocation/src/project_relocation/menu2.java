/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import static project_relocation.Project_Relocation.buttonStyle1;


/**
 *
 * @author Marc
 */
public class menu2 extends BorderPane implements UI{
    
    double heightImage =500;
    double widthImage =500;
    
    public menu2(){
  
//Background image
        Image background = new Image("menu2Background.png",1300,650,true,true);
        ImageView backgroundView = new ImageView(background);
        this.getChildren().add(backgroundView);
        
//insets        
        this.setPadding(new Insets(10, 20, 10, 20));
        
//GRID PANE FOR BUTTONS CHOICE
        HBox box = new HBox(10);
        Button buttonYesIntro = new Button("YES");
        Button buttonNoIntro = new Button("NO");
        
        buttonYesIntro.setStyle(buttonStyle1);
        buttonNoIntro.setStyle(buttonStyle1);
        
        
        box.getChildren().addAll(buttonYesIntro, buttonNoIntro);
        box.setAlignment(Pos.CENTER);
        this.setBottom(box);
        
        
        
        
        buttonYesIntro.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.sceneLevel1);
            }
        });
        buttonNoIntro.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.sceneMenu1);
            }
        });
        
    }
    
    
}

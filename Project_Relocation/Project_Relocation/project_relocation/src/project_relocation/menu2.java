/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_relocation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Marc
 */
public class menu2 extends BorderPane implements UI{
    
    
    public menu2(){
  
        
      
        ImageView imageViewPageIntro = new ImageView();
//      Image imageBobTalking = new Image("");
//      imageViewPageIntro.setImage(imageBobTalking);
        this.setCenter(imageViewPageIntro);
        
        
        //GRID PANE FOR BUTTONS CHOICE
        GridPane gridPaneChoiceIntro = new GridPane();
        Button buttonYesIntro = new Button("YES");
        Button buttonNoIntro = new Button("NO");
        
        gridPaneChoiceIntro.add(buttonNoIntro, 1, 0);
        gridPaneChoiceIntro.add(buttonYesIntro, 0,0);
        gridPaneChoiceIntro.setAlignment(Pos.CENTER);
        this.setBottom(gridPaneChoiceIntro);
        
        
        
        
        buttonYesIntro.setOnAction(new EventHandler <ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            Project_Relocation.setScene(Project_Relocation.sceneLevel1);
            }
        });
        
        
    }
    
    
}

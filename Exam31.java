package exam3.pkg1;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exam31 extends Application {
    
    int time=0;
    boolean running=false;
    boolean started=false;
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Label timeShow=new Label("0");
        timeShow.setFont(new Font("Serif", 50));
        
        HBox controls=new HBox(10);
        Button start=new Button("Start");
        Button clear=new Button("Clear");
        
        controls.getChildren().addAll(start,clear);
        controls.setAlignment(Pos.CENTER);
        
        root.setCenter(timeShow);
        root.setBottom(controls);
        
        Timeline tick = new Timeline(new KeyFrame(Duration.seconds(1), (ActionEvent event) -> {
            time++;
            timeShow.setText(Integer.toString(time));
        }));
        tick.setCycleCount(Timeline.INDEFINITE);
        
        
        start.setOnAction((ActionEvent event) -> {
            if(!running&&!started){
                tick.play();
                start.setText("Pause");
                running=true;
                started=true;
            }
            else if(running&&started){
                tick.pause();
                start.setText("Resume");
                running=false;
                started=true;
            }else if(!running&&started){
                tick.play();
                start.setText("Pause");
                running=true;
                started=true;
            }
        });
        clear.setOnAction((ActionEvent event)->{
            
            time=0;
            timeShow.setText("0");
            tick.stop();
            started=false;
            running=false;
            start.setText("Start");
        });
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("question 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

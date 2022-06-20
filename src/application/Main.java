package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button Button1 = new Button("Button1"); 
        Button Button2 = new Button("Button2"); 
        Button Button3 = new Button("Button3"); 
             
        //VBox layout = new VBox(Button1, Button2, Button3);
        VBox layout = new VBox();
        //layout.setAlignment(Pos.BASELINE_CENTER);
        //layout.setAlignment(Pos.BOTTOM_CENTER);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);
        layout.getChildren().addAll(Button1, Button2, Button3);
        
        Scene scene = new Scene(layout, 300, 300);  
 
        primaryStage.setTitle("Les Layouts en JavaFX");
        primaryStage.setScene(scene);   
        primaryStage.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

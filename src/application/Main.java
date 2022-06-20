package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	String nom;
	@Override
	public void start(Stage primaryStage) {
		Button Button1 = new Button("Button1"); 
        Button Button2 = new Button("Button2"); 
        Button Button3 = new Button("Button3"); 
             
        
        //VBox layout = new VBox();
        //layout.setAlignment(Pos.BASELINE_CENTER);
        //layout.setAlignment(Pos.BOTTOM_CENTER);
        //layout.setAlignment(Pos.CENTER);
        //layout.setSpacing(20);
        VBox layout = new VBox(Button1, Button2, Button3);
        
        VBox.setMargin(Button1, new Insets(40,0,60,120)); // top right buttom left
        VBox.setMargin(Button2, new Insets(40,0,0,120));
        VBox.setMargin(Button3, new Insets(40,0,0,120));
        
        //layout.getChildren().addAll(Button1, Button2, Button3);
        
        Scene scene = new Scene(layout, 300, 300);  
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("Les Layouts en JavaFX");
        primaryStage.setScene(scene);   
        primaryStage.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

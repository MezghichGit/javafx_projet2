package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application  implements EventHandler<ActionEvent>{
	
	Button Button1 = new Button("Réussi"); 
    Button Button2 = new Button("Perdu"); 
    Button Button3 = new Button("Essaye encore"); 
    TextField nom = new TextField();
    Label label = new Label("Vous êtes : ");
    Button btn = new Button("Valider"); 
    
	public void handle(ActionEvent event) {
        if(event.getSource() == Button1) {
            System.out.println("Réussi");
        }
        if(event.getSource() == Button2) {
            System.out.println("Perdu");
        }
        if(event.getSource() == Button3) {
            System.out.println("Essaye encore");
        }
        if(event.getSource() == btn) {
        	String text = nom.getText();
            System.out.println("Vous êtes : "+text);
            label.setText(label.getText()+" "+text);
        }
             
    }
	@Override
	public void start(Stage primaryStage){
		
        
        Button1.setOnAction(this);
        Button2.setOnAction(this);
        Button3.setOnAction(this);
        btn.setOnAction(this);
        //VBox layout = new VBox();
        //layout.setAlignment(Pos.BASELINE_CENTER);
        //layout.setAlignment(Pos.BOTTOM_CENTER);
        //layout.setAlignment(Pos.CENTER);
        //layout.setSpacing(20);
       
        VBox layout = new VBox(Button1, Button2, Button3,nom,label,btn);
        
        VBox.setMargin(Button1, new Insets(40,0,10,100)); // top right buttom left
        VBox.setMargin(Button2, new Insets(40,0,10,100));
        VBox.setMargin(Button3, new Insets(40,0,10,100));
        
        //layout.getChildren().addAll(Button1, Button2, Button3);
        
        Scene scene = new Scene(layout, 300, 500);  
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("Les Layouts en JavaFX");
        primaryStage.setScene(scene);   
        primaryStage.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package chap14JavaFXBasics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class tenRectangles extends Application {
	@Override // Override the start method in the application class
	public void start(Stage primaryStage) {
		// Create a GridPane
		
		Group group = new Group();
		// Create nine rectangles and add to pane
		double s = 100; // side of rectangle
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {				
				Rectangle r = new Rectangle(100*i, 100*j, s, s);
				r.setFill(Color.WHITE);
				// default stroke is black
				r.setStroke(Color.BLACK);
				r.setStrokeWidth(1.0);
				group.getChildren().add(r);
			}
		}
		
		// add a big rectangle
		Rectangle bigr = new Rectangle(0, 0, 300, 300);
		// set the big rectangle as transparent so that the smaller rectangles will be shown.
		bigr.setFill(Color.TRANSPARENT);
		bigr.setStroke(Color.BLACK);
		bigr.setStrokeWidth(3.0);
		group.getChildren().add(bigr);
		
		BorderPane pane = new BorderPane(group);

		// Create a scene and place it in the stage
		Scene scene = new Scene (pane, 500, 500);
		primaryStage.setTitle("nine rectangles"); // Set the stage title
		primaryStage.setScene(scene); // Place in scene in the stage
		primaryStage.show(); // Display the stage;
	}
	
	   public static void main(String[] args) {
	        Application.launch(args);

	    }
}

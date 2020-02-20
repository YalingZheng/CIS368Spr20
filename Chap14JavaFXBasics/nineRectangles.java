package chap14JavaFXBasics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class nineRectangles extends Application {
	@Override // Override the start method in the application class
	public void start(Stage primaryStage) {
		// Create a GridPane
		GridPane pane = new GridPane();

		// Create nine rectangles and add to pane
		double s = 100; // side of rectangle
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {				
				Rectangle r = new Rectangle(s, s, s, s);
				if (count % 2 == 0)
					r.setFill(Color.WHITE);
				/*
				 * public void add(Node child, int columnIndex, int rowIndex)
				 * 
				 * Adds a child to the gridpane at the specified column,row position.This
				 * convenience method will set the gridpane column and row constraintson the
				 * child.
				 */			
				pane.add(r, j, i);
				count++;
			}
		}
		// Create a scene and place it in the stage
		Scene scene = new Scene (pane);
		primaryStage.setTitle("nine rectangles"); // Set the stage title
		primaryStage.setScene(scene); // Place in scene in the stage
		primaryStage.show(); // Display the stage;
	}
	
	   public static void main(String[] args) {
	        Application.launch(args);

	    }
}

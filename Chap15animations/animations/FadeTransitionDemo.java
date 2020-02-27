package animations;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Place an ellipse to the pane
    Pane pane = new Pane();
    // an ellipse with center x-value 10, y-value 10, width 100, height 50. 
    Ellipse ellipse = new Ellipse(10, 10, 100, 50);
    ellipse.setFill(Color.RED); 
    ellipse.setStroke(Color.BLACK);
    // ellipse center x-value is at the center of the pane
    ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
    // ellipse center y-value is at the center of the pane
    ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
    // ellipse radiusx bind to 0.4 * width (of the pane)
    ellipse.radiusXProperty().bind(
      pane.widthProperty().multiply(0.4));    
    // ellipse radiusy bind to 0.4 * height (of the pane) 
    ellipse.radiusYProperty().bind(
      pane.heightProperty().multiply(0.4)); 
    pane.getChildren().add(ellipse);
    
    // Apply a fade transition to ellipse
    FadeTransition ft = 
      new FadeTransition(Duration.millis(3000), ellipse);
    ft.setFromValue(1.0);
    ft.setToValue(0.1);
    ft.setCycleCount(Timeline.INDEFINITE);
    ft.setAutoReverse(true);
    ft.play(); // Start animation 
    
    // Control animation
    ellipse.setOnMousePressed(e -> ft.pause());
    ellipse.setOnMouseReleased(e -> ft.play());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 150);
    primaryStage.setTitle("FadeTransitionDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

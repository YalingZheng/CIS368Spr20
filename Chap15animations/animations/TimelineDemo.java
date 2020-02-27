package animations;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class TimelineDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    StackPane pane = new StackPane();
    // 80 - the horizontal position of the text   200 - the vertical position of the text
    Text text = new Text(80, 200, "Programming is fun");
    // set font size
    text.setFont(Font.font ("Verdana", 50));
    // Want to know more about Text Effects in JavaFX? https://docs.oracle.com/javafx/2/text/jfxpub-text.htm
    
    text.setFill(Color.RED);
    pane.getChildren().add(text); // Place text into the stack pane

    // Create a handler for changing text
    EventHandler<ActionEvent> eventHandler = e -> {
      if (text.getText().length() != 0) {
        text.setText("");
      }
      else {
        text.setText("Programming is fun");
      }
    };
    
    // Create an animation for alternating text
    Timeline animation = new Timeline(
      new KeyFrame(Duration.millis(500), eventHandler));
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play(); // Start animation

    // Pause and resume animation
    text.setOnMouseClicked(e -> {
      if (animation.getStatus() == Animation.Status.PAUSED) {
        animation.play();
      }
      else {
        animation.pause();
      }
    });
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 800, 400);
    primaryStage.setTitle("TimelineDemo"); // Set the stage title
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

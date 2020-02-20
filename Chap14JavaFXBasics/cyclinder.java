package chap14JavaFXBasics;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.ArrayList;

/*
 * This example shows that you can draw ellipse, vertical lines
 * and two arcs; one arc is dashed line
 * */

public class cyclinder extends Application {

	// Top ellipse center point
	private static final int CENTER_Y = 75;
	private static final int CENTER_X = 150;

	private static final int RADIUS_X = 100;
	private static final int RADIUS_Y = 50;
	private static final int CYLINDER_HEIGHT = 200;

	@Override
	public void start(Stage primaryStage) {

		Pane pane = new Pane();
		ArrayList<Node> shapes = new ArrayList<>();
		// top ellipse
		Ellipse ellipse = new Ellipse(CENTER_X, CENTER_Y, RADIUS_X, RADIUS_Y);
		ellipse.setFill(Color.rgb(0, 0, 0, 0)); // opaque fill
		ellipse.setStroke(Color.BLACK);
		shapes.add(ellipse);

		/*
		 * public final ObservableList<Double> getStrokeDashArray() Defines the array
		 * representing the lengths of the dash segments. Alternate entries in the array
		 * represent the user space lengths of the opaque and transparent segments of
		 * the dashes. As the pen moves along the outline of the Shape to be stroked,
		 * the user space distance that the pen travels is accumulated. The distance
		 * value is used to index into the dash array. The pen is opaque when its
		 * current cumulative distance maps to an even element of the dash array
		 * (counting from 0) and transparent otherwise. An empty strokeDashArray
		 * indicates a solid line with no spaces. An odd length strokeDashArray behaves
		 * the same as an even length array constructed by implicitly repeating the
		 * indicated odd length array twice in succession ([6, 21] behaves as if it
		 * were [6, 21, 6, 21, 6, 21]).
		 * 
		 * Note that each dash segment will be capped by the decoration specified by the
		 * current stroke line cap.
		 * 
		 * There are 3 different values for the stroke line cap: StrokeLineCap.BUTT,
		 * StrokeLineCap.SQUARE (the default), and StrokeLineCap.ROUND
		 * 
		 * 
		 */

		// bottom - top-half circle (dashed lines)
		Arc arc1 = createArc(0, 180);
		arc1.getStrokeDashArray().addAll(6.0, 21.0); // making the arc dashed
		shapes.add(arc1);

		// bottom - bottom-half circle (non-dashed lines)
		Arc arc2 = createArc(180, 180);
		shapes.add(arc2);

		// Creating two lines to connect the upper and lower ellipses
		Line line1 = new Line(CENTER_X - RADIUS_X, CENTER_Y, // starting point
				arc2.getCenterX() - RADIUS_X, arc2.getCenterY()); // ending point
		shapes.add(line1);
		Line line2 = new Line(CENTER_X + RADIUS_X, CENTER_Y, arc2.getCenterX() + RADIUS_X, arc2.getCenterY());
		shapes.add(line2);

		pane.getChildren().addAll(shapes);
		Scene scene = new Scene(pane, RADIUS_X * 3, CYLINDER_HEIGHT + 150);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Cylinder");
		primaryStage.show();
	}

	/* Create an arc from start angle, and */
	private Arc createArc(double startAngle, double length) {
		/*
		 * New Arc(p1, p2, p3, p4, p5, p6) CENTER_X, CENTER_Y are the x-coordinate,
		 * y-coordinate of the center of the ellipse RADIUS_X, RADIUS_y are the center
		 * hortizal raius, vertical radius of the ellipse startAngle is the start angle
		 * of the arc in degrees the angular extent of the arc in degrees.
		 */
		Arc arc = new Arc(CENTER_X, CENTER_Y + CYLINDER_HEIGHT, RADIUS_X, RADIUS_Y, startAngle, length);
		arc.setFill(Color.rgb(0, 0, 0, 0)); // opaque fill
		arc.setStroke(Color.BLACK);
		return arc;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

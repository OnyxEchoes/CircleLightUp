import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;
import java.util.*;

public class CircleLightUp extends Application {

	private final static int NUM_CIRCLES = 5;
	private final static int POSITION_SPACING = 100;
	private final static int RADIUS = 50;
	
	private Pane pane;
	private List<Circle> circleList;

	// YOUR CODE IN THIS METHOD HERE: CODE A
	// Write code here to register one or more listeners to one or more components.
	public void start(Stage primaryStage) {
		pane = new Pane();
		circleList = new ArrayList<Circle>();

		for (int i = 0; i < NUM_CIRCLES; i++) {
			int center = POSITION_SPACING + i * POSITION_SPACING;
			Circle circle = new Circle(center, center, RADIUS);
			pane.getChildren().add(circle);
			circleList.add(circle);
			circle.setOnMouseEntered(this::handleMouseEntered);
			circle.setOnMouseExited(this::handleMouseExited);
			
		}
		
		
		
		Scene scene = new Scene(pane, 700, 700, Color.AZURE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// YOUR CODE HERE: CODE B
	// Write complete listener method(s) here.
	private void handleMouseEntered (MouseEvent event) {
		Circle circle = (Circle) event.getSource();
		circle.setFill(Color.YELLOW);
		
	}
	
	private void handleMouseExited(MouseEvent event) {
		Circle circle = (Circle) event.getSource();
		circle.setFill(Color.BLACK);
	}

	public static void main(String[] args) {
		launch(args);
	}
}

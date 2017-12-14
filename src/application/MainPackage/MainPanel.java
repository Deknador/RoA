package application.MainPackage;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainPanel {

	public MainPanel(Stage primaryStage) {
		mainPane(primaryStage);
	}

	private void mainPane(Stage primaryStage) {
		try {

			Pane root = new Pane();
			Scene scene = new Scene(root, 1100, 750);
			scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
			// scene.getStylesheets().add("application.css");
			primaryStage.setScene(scene);
			primaryStage.show();

			VBox menuleiste = new VBox();
			menuleiste.setPrefSize(100, 750);
			menuleiste.setLayoutX(0);
			menuleiste.setLayoutY(0);
			// menuleiste.setPadding(new Insets(0,20,20,20));
			menuleiste.setSpacing(-2);

			Button charakter = new Button("Charakter");
			Button skills = new Button("Skills");
			Button inventar = new Button("Inventar");

			charakter.setPrefSize(100, 100);
			charakter.setMinSize(100, 100);
			charakter.setAlignment(Pos.CENTER);
			charakter.getStyleClass().add("menubox");
			skills.setPrefSize(100, 100);
			skills.setMinSize(100, 100);
			skills.setAlignment(Pos.CENTER);
			skills.getStyleClass().add("menubox");
			inventar.setPrefSize(100, 100);
			inventar.setMinSize(100, 100);
			inventar.setAlignment(Pos.CENTER);
			inventar.getStyleClass().add("menubox");

			menuleiste.getChildren().addAll(charakter, skills, inventar);

			root.getChildren().add(menuleiste);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package application.MainPackage;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
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
			primaryStage.setResizable(false);
			primaryStage.show();

			VBox logChars = new VBox();
			logChars.setPrefSize(150, 750);
			logChars.setLayoutX(0);
			logChars.setLayoutY(0);
			
			VBox scrollContent = new VBox();
			scrollContent.setPrefWidth(100);
			
			
			ScrollPane scroll = new ScrollPane();
			scroll.setPrefSize(150, 650);
			scroll.setDisable(true);
			scroll.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
			scroll.setVbarPolicy(ScrollBarPolicy.ALWAYS);
			scroll.setContent(scrollContent);
			
			
			

			Pane loginPane = new Pane();
			loginPane.setPrefSize(150,100);

//            Text username = new Text("Username: ");
//            username.getStyleClass().add("chText");
//            username.setLayoutX(10);
//            username.setLayoutY(10);




			TextField usernameFld = new TextField();
            usernameFld.setPrefSize(100,25);
            usernameFld.setPromptText("Username");
            usernameFld.setLayoutX(5);
            usernameFld.setLayoutY(10);
            
            
            TextField passwordFld = new TextField();
            passwordFld.setPrefSize(100,25);
            passwordFld.setPromptText("Password");
            passwordFld.setLayoutX(5);
            passwordFld.setLayoutY(45);
            
            loginPane.getChildren().addAll(usernameFld, passwordFld);
            logChars.getChildren().addAll(scroll, loginPane);


			VBox menuleiste = new VBox();
			menuleiste.setPrefSize(100, 750);
			menuleiste.setLayoutX(150);
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

			root.getChildren().addAll(logChars, menuleiste);
			
			logChars.requestFocus();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

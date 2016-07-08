package observer_pattern;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Client extends Application {

	public static void main(String[] args) {
		Application.launch(Client.class, (String[]) null);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			AnchorPane page = FXMLLoader.load(Client.class.getResource("user.fxml"));
			Scene scene = new Scene(page);
			primaryStage.setScene(scene);
			primaryStage.setTitle("User Info");
			primaryStage.show();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

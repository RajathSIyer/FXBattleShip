package application.src;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.Pane;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

public class SceneController {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchScene(ActionEvent event) throws IOException
	{
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root,1025,884);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
		
	}
}

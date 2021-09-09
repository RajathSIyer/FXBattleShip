package application;
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
	private static int sceneSwitch = 0;
	
	public SceneController() {
		}
	
	public void switchScene(ActionEvent event) throws IOException
	{
			System.out.println(((Node)event.getSource()).getScene().toString());
			Parent root = FXMLLoader.load(getClass().getResource("PlayerOne.fxml"));
			Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root,1025,884);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	public void switchPlayerScene(ActionEvent event) throws IOException{
			if (sceneSwitch == 0){
				Parent root = FXMLLoader.load(getClass().getResource("PlayerOne.fxml"));
				sceneSwitch = 1;
			} else {
				sceneSwitch = 0;
				Parent root = FXMLLoader.load(getClass().getResource("PlayerTwo.fxml"));
			}
			
			Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(root,1025,884);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	

	
}

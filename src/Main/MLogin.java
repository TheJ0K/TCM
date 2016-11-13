package Main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MLogin extends Application {
    
    private static Stage stage;
    
@Override
public void start (Stage stage) throws IOException{
    Parent root = FXMLLoader.load(getClass().getResource("/View/TelaLogin.fxml"));
     
    Scene scene = new Scene(root);
    
    stage.setTitle("Tela de Login");
    stage.setScene(scene);
    stage.show();
    MLogin.stage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        MLogin.stage = stage;
    }
    
}

package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TelaEditUserController implements Initializable {
    
    @FXML
    private Button bt1,bt2,bt3,bt4;

    @FXML
    private ImageView imagev1,image1;

    @FXML
    private Pane pane2,pane3;

    @FXML
    private PasswordField passf2;

    @FXML
    private AnchorPane anchor;

    @FXML
    private PasswordField passf1;

    @FXML
    private Label lb1,lb2,lb3,lb4;

    @FXML
    private TextField tf1;
    
    public static Stage TelaEditUser;
    
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaEditUser.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //stage.show();
        
        TelaEditUser = stage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

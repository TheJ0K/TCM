package Controller;

import Main.MCadastro;
import Main.MInicial;
import Main.MLogin;
import javafx.scene.input.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaInicialController implements Initializable {
    
    @FXML
    private ImageView imagev1;
    
    @FXML
    private AnchorPane anchor;
    
    @FXML
    private Label lb1, lb2;
    
    @FXML
    private Button cadastro;
    
    @FXML
    private Button login;
    
    @FXML
    public void cad() {
        try {
            TelaCadastroController tela = new TelaCadastroController();
            tela.start(new Stage());
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
    
    @FXML
    public void log() {
        try {
            TelaLoginController tela = new TelaLoginController();
            tela.start(new Stage());
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
    
    public static Stage TelaInicial;
    
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaInicial.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        TelaInicial = stage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

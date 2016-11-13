package Controller;

import Main.MCadastro;
import Main.MLogin;
import Main.MPrincipal;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaLoginController implements Initializable {
    
    @FXML
    private Button confirm,cad;

    @FXML
    private TextField textf1;

    @FXML
    private ImageView imagev1;

    @FXML
    private AnchorPane anchor;

    @FXML
    private PasswordField passf1;

    @FXML
    private Label lb1,lb2,lb3;
    
    public void cad() {
        try {
            MCadastro tela = new MCadastro();
            tela.start(new Stage());

            MLogin.getStage().close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public void Confirma() {
        try {
            MPrincipal principal = new MPrincipal();
            principal.start(new Stage());

            MLogin.getStage().close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
    
    public static Stage TelaLogin;
    
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaLogin.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        TelaLogin = stage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cad.setOnMouseClicked((MouseEvent evt) -> {
            cad();
        });

        cad.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                cad();
            }
        });

        confirm.setOnMouseClicked((MouseEvent evt) -> {
            Confirma();
        });

        confirm.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                Confirma();
            }
        });
    }

}

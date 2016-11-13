package Controller;

import Main.MCadastro;
import Main.MLogin;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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

public class TelaCadastroController implements Initializable {

    @FXML
    private TextField textf1, textf2, textf3, textf4;

    @FXML
    private Button cancel;

    @FXML
    private Label lb1, lb2, lb3, lb4, lb5, lb6;

    @FXML
    private ImageView imagev1;

    @FXML
    private Button confirm;

    @FXML
    private PasswordField passf2;

    @FXML
    private AnchorPane anchor;

    @FXML
    private PasswordField passf1;

    @FXML
    public void CadUser() {
        try {
            TelaLoginController tela = new TelaLoginController();
            tela.start(new Stage());

            Alert sucess = new Alert(AlertType.INFORMATION);
            sucess.setHeaderText("Cadastro Feito Com Sucesso!");
            sucess.show();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    @FXML
    public void Cancela() {
        TelaCadastro.close();
    }

    public static Stage TelaCadastro;

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaCadastro.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        TelaCadastro = stage;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*confirm.setOnMouseClicked((MouseEvent evt) -> {
            CadUser();
        });

        confirm.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                CadUser();
            }
        });

        cancel.setOnMouseClicked((MouseEvent evt) -> {
            Cancela();
        });

        cancel.setOnKeyPressed((KeyEvent evt) -> {
            if (evt.getCode() == KeyCode.ENTER) {
                Cancela();
            }
        });*/
    }
}

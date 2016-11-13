package Controller;

import Main.MAtualizar;
import Main.MCadastro;
import Main.MEconomia;
import Main.MHistorico;
import Main.MPrincipal;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class TelaPrincipalController implements Initializable {

    @FXML
    private Button sair, hist, atualiza, ec;

    @FXML
    private ImageView imagev1, foto;

    @FXML
    private DatePicker data_atualizacao;

    @FXML
    private MenuBar menubar;

    @FXML
    private MenuItem caduser;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Label lb1, lb2, lb3;

    String caminho;

    @FXML
    public void imagem() {
        try {
            FileChooser janela = new FileChooser();
            janela.getExtensionFilters().add(new ExtensionFilter("Imagens", "*.jpg"));
            File f = janela.showOpenDialog(new Stage());

            if (f != null) {
                caminho = f.getAbsolutePath();
                foto.setImage(new Image("file:///" + f.getAbsolutePath()));
            } else {
                Alert erro = new Alert(AlertType.WARNING);
                erro.setHeaderText("Nenhuma imagem selecionada!");
            }
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    @FXML
    public void historico() {
        try {
            MHistorico tela = new MHistorico();
            tela.start(new Stage());
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    @FXML
    public void atualizar() {
        try {
            MAtualizar tela = new MAtualizar();
            tela.start(new Stage());
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    @FXML
    public void economia() {
        try {
            MEconomia tela = new MEconomia();
            tela.start(new Stage());
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    @FXML
    public void sair() {
        try {
            Alert sair = new Alert(AlertType.WARNING);
            sair.setHeaderText("Deseja Mesmo Sair?");
            MPrincipal.getStage().close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    @FXML
    private void Cadastrar_Usuario(ActionEvent evt) {
        try {
            MCadastro cad = new MCadastro();
            cad.start(new Stage());
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
    
    public static Stage TelaPrincipal;
    
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaPrincipal.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        TelaPrincipal = stage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

}

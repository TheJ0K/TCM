package Controller;

import Main.MCadastro;
import Main.MPrincipal;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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

    public Node getNode(String node) { //Metodo principal, é com ele que tera a possibilidade de usar a função
        Node no = null; //Criação de uma variavel Node (é do java e precisa de importação)
        try {
            no = FXMLLoader.load(getClass().getResource(node)); //Comparando diretamente ao que ja sabemos
        } catch (Exception e) {                                 //faça um comparativo as mains.
            System.err.println(e);
        }
        return no;
    }

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
    void historico() { //Não tem problema ser void apenas
        anchor.getChildren().clear(); //Vai pegar o que esta dentro do anchor e limpar
        anchor.getChildren().add(getNode("/View/TelaHistorico.fxml"));//Vai pegar o que esta dentro de
        //outro fxml e trazer na tela.
    }

    @FXML
    void atualizar() {
        anchor.getChildren().clear();
        anchor.getChildren().add(getNode("/View/TelaAtualizar.fxml"));
    }

    @FXML
    void economia() {
        anchor.getChildren().clear();
        anchor.getChildren().add(getNode("/View/TelaEconomia.fxml"));
    }

    @FXML
    void sair() {
        try {
            Alert sair = new Alert(AlertType.WARNING);
            sair.setHeaderText("Deseja Mesmo Sair?");
            MPrincipal.getStage().close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    @FXML
    void Cadastrar_Usuario() {
        try {
            MCadastro cad = new MCadastro();
            cad.start(new Stage());
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    public static Stage TelaPrincipal;

    public void start(Stage stage) throws Exception {
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

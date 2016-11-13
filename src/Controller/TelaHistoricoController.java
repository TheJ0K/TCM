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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaHistoricoController implements Initializable {
    
    @FXML
    private ImageView imagev2;

    @FXML
    private MenuItem menui1,menui2;

    @FXML
    private AnchorPane anchor,anchor2,anchor3;

    @FXML
    private TextField pesquisatf;

    @FXML
    private Button gerarpdf,pesquisar;

    @FXML
    private SplitPane split;

    @FXML
    private Label lb1,lb2,lb3;

    @FXML
    private MenuButton selecionar;

    @FXML
    private TableView<?> tablehistorico;
    
    @FXML
    private TableColumn<?, ?> dadospc;
    
    @FXML
    private TableColumn<?, ?> dadossc;

    @FXML
    private TableColumn<?, ?> dataregc;

    @FXML
    private TableColumn<?, ?> mediasc;
    
    public static Stage TelaHistorico;
    
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaHistorico.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //stage.show();
        
        TelaHistorico = stage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

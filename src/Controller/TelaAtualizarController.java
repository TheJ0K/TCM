package Controller;

import Model.Medias;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TelaAtualizarController implements Initializable {
    
    @FXML
    private Button bt1,bt2,bt3,bt4;

    @FXML
    private TextField textf1,textf2;

    @FXML
    private ImageView imagev1,imagev2;

    @FXML
    private DatePicker datep;

    @FXML
    private Pane pane1;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Label lb1,lb2;
    
    public static Stage TelaAtualizar;
    
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaAtualizar.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //stage.show();
        
        TelaAtualizar = stage;
    }
    
    @FXML
    void salvar(){
        Medias med = new Medias();
        med.setRegistro1(Integer.valueOf(textf1.getText()));
        med.setRegistro2(Integer.valueOf(textf2.getText()));
        
        med.consumo_de_agua();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

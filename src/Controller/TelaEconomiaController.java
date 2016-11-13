package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaEconomiaController implements Initializable {
    
    @FXML
    private Button bt1,bt2,bt3;

    @FXML
    private ImageView imagev1;

    @FXML
    private CategoryAxis cata;

    @FXML
    private NumberAxis numa;

    @FXML
    private LineChart<?, ?> linec;

    @FXML
    private DatePicker dat1;

    @FXML
    private DatePicker dat2;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Label lb1,lb2,lb3;
    
    public static Stage TelaEconomia;
    
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaEconomia.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        TelaEconomia = stage;
    }
    
    @FXML
    void dicas(){
        TelaDicasController tela = new TelaDicasController();
        try{
            tela.start(new Stage());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

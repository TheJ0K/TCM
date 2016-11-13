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
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaDicasController implements Initializable {
    
    @FXML
    private ImageView imagev1;

    @FXML
    private TextArea texta1;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Label lb1;

    @FXML
    private Button bt1;

    public static Stage TelaDicas;
    
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaDicas.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        TelaDicas = stage;
    }
    
    /*1 - No Banho: Se molhe, feche o chuveiro, se ensaboe e depois abra para enxaguar. Não fique com o chuveiro
aberto. O consumo cairá de 180 para 48 litros. 
 
2 - Ao escovar os dentes: escove os dentes e enxágüe a boca com a água do copo. Economize 3 litros de água. 
 
3 - Na descarga: Verifique se a válvula não está com defeito, aperte-a uma única vez e não jogue lixo e restos 
de comida no vaso sanitário. 
 
4 - Na torneira: Uma torneira aberta gasta de 12 a 20 litros/minuto. Pingando, 46 litros/dia. Isto significa, 1.380 
litros por mês. Feche bem as torneiras. 
 
5 - Vazamentos: Um buraco de 2 milímetros no encanamento desperdiça cerca de 3 caixas d’água de mil litros. 
 
6 - Na caixa d’água: Não a deixe transbordar e mantenha-a tampada. 
 
7 - Na lavagem de louças: Lavar louças com a torneira aberta, o tempo todo, desperdiça até 105 litros. Ensaboe 
a louça com a torneira fechada e depois enxágüe tudo de uma vez. Na máquina de lavar são gastos 40 litros. 
Utilize-a somente quando estiver cheia. 
 
8 - Regar jardins e plantas: No inverno, a rega pode ser feita dia sim, dia não, pela manhã ou à noite. Use man-
gueira com esguicho-revólver ou regador. 
 
9 - Lavar carro: com uma mangueira gasta 600 litros de água. Só lave o carro uma vez por mês, com balde de
 
10 litros, para ensaboar e enxaguar. Para isso, use a água da sobra da máquina de lavar louça. 
 
10 - Na limpeza de quintal e calçadas use vassoura: Se precisar utilize a água que sai do enxágüe da máquina 
de lavar. */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}

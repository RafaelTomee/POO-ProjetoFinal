
import javax.swing.JOptionPane;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class EstampaErradaException extends Exception{
    public void impEstampaErrada(){
    JOptionPane.showMessageDialog(null, "Estampa invalida. Estampas validas: LOGO DA MARCA, LISA, DESENHO.", "ERRO", 0);
    }
}

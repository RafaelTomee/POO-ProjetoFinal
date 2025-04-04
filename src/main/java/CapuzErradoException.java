
import javax.swing.JOptionPane;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class CapuzErradoException extends Exception{
    public void impCapuzErrado(){
        JOptionPane.showMessageDialog(null, "Tipo de capuz invalido. Tipos validos: COM CAPUZ, SEM CAPUZ.", "ERRO",0);
    }
}

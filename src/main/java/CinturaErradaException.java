
import javax.swing.JOptionPane;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class CinturaErradaException extends Exception{
    public void impCinturaErrada(){
        JOptionPane.showMessageDialog(null,"Tipo de cintura invalido. Tipos validos: ALTA, MEDIA, BAIXA.", "ERRO",0);
    }
}

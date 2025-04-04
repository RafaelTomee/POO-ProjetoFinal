
import javax.swing.JOptionPane;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class TipoErradoException extends Exception{
    public void impTipoErrado(){
        JOptionPane.showMessageDialog(null,"Tipo de material invalido. TIpos de materiais correto: ALGODAO, JEANS", "ERRO", 0);
    }
}


import javax.swing.JOptionPane;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class CorErradaException extends Exception{
    public void impCorErrada(){
        JOptionPane.showMessageDialog(null,"Cor invalida. Cores validas: branca, preta, azul.", "ERRO",0);
   }
}

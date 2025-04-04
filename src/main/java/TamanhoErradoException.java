//Nome: Rafael Tomé da Silva - RA:2623412;
import javax.swing.JOptionPane;

public class TamanhoErradoException extends Exception{
    public void impTamanhoErrado(){
         JOptionPane.showMessageDialog(null,"Tamanho invalido. Tamanhos validos: PP, P, M, G, GG.", "ERRO", 0);
    }
}

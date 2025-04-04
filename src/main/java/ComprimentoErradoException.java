
import javax.swing.JOptionPane;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class ComprimentoErradoException extends Exception{
    public void impComprimentoErrado(){
        JOptionPane.showMessageDialog(null,"Comprimento invalido. Valores validos: 96-98, 98-100, 100-102, 102-104, 104-106.", "ERRO",0);
    }
}

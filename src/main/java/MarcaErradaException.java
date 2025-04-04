
import javax.swing.JOptionPane;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class MarcaErradaException extends Exception{
    public void impMarcaErrada(){
        JOptionPane.showMessageDialog(null, "Marca invalida. Marcas validas: BAW, SUFGANG, APPROVE, WATS, HIGH.", "ERRO", 0);
    }
    
}

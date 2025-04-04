
import javax.swing.JOptionPane;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class MangaErradaException extends Exception{
    public void impMangaErrada(){
        JOptionPane.showMessageDialog(null,"Tipo de manga invalida. Tipos validos: CURTA, LONGA.", "ERRO", 0);
    }
}

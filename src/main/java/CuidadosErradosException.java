
import javax.swing.JOptionPane;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class CuidadosErradosException extends Exception{
    public void impCuidadosErrados(){
        JOptionPane.showMessageDialog(null, "Cuidados invalidos. Cuidados validos: lavar a mao, lavar na maquina.", "ERRO", 0);
    }
}

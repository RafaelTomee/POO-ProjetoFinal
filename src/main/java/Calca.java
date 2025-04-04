
import java.util.Objects;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class Calca extends Roupa implements TemBolsos{
    private String tipoCintura;
    private String comprimento;
    
    public Calca(){
        super();
        tipoCintura = "";
        comprimento = "";
    }
    
    public String getTipoCintura(){
        return tipoCintura;
    }
    
    public String getComprimento(){
        return comprimento;
    }
    
    public void setTipoCintura(String tipoCintura) throws CinturaErradaException{
        String tipoUpper = tipoCintura.toUpperCase();
    
    if (tipoUpper.equals("ALTA") || tipoUpper.equals("MEDIA") || tipoUpper.equals("BAIXA")) {
        this.tipoCintura = tipoUpper; 
        } else {
        throw new CinturaErradaException();
    }
    }

    public void setComprimento(String comprimento) throws ComprimentoErradoException{
        if (comprimento.equals("96-98") || 
        comprimento.equals("98-100") || 
        comprimento.equals("100-102") || 
        comprimento.equals("102-104") || 
        comprimento.equals("104-106")) {
        
        this.comprimento = comprimento;
        } else {
            throw new ComprimentoErradoException();
        }
    }
    
    public void mostrarBolsos() {
        System.out.println("A Calca tem 3 bolsos: 2 frontais e 1 traseiro.");
    }


    //Sobrescrita
    public void impDados() { 
        System.out.println("Tamanho...: " + getTamanho() + 
                           "\nMarca...: " + getMarca() + 
                           "\nCor...: " + getCor() + 
                           "\nComprimento...: " + getComprimento() + 
                           "\nTipo de cintura...: " + getTipoCintura() +
                           "\nTipo de material...: " + getMaterial().getTipo() +
                           "\nCuidados...: " + getMaterial().getCuidados() );

        mostrarBolsos();                   
    }
       
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Calca other = (Calca) obj;
    return Objects.equals(getTamanho(), other.getTamanho()) &&
           Objects.equals(getCor(), other.getCor()) &&
           Objects.equals(getMarca(), other.getMarca()) &&
           Objects.equals(getTipoCintura(), other.getTipoCintura()) &&
           Objects.equals(getComprimento(), other.getComprimento()) &&
           Objects.equals(getMaterial().getTipo(), other.getMaterial().getTipo()) && // Comparando o tipo de material
           Objects.equals(getMaterial().getCuidados(), other.getMaterial().getCuidados()); // Comparando os cuidados
}
    
    }
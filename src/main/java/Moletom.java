
import java.util.Objects;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class Moletom extends Roupa implements TemBolsos{
    private String capuz;
    private String estampa;
    
    public Moletom(){
        super();
        capuz = "";
        estampa = "";
    }
    
    public String getCapuz(){
        return capuz;
    }
    
    public String getEstampa(){
        return estampa;
    }
    
    public void setCapuz(String capuz) throws CapuzErradoException{
        String capuzUpper = capuz.toUpperCase();
        if(capuzUpper.equals("COM CAPUZ") || capuzUpper.equals("SEM CAPUZ")){
            this.capuz = capuzUpper;
        } else {
        throw new CapuzErradoException();
        }
        
    }
    public void setEstampa(String estampa) throws EstampaErradaException{
        String estampaUpper = estampa.toUpperCase();
        if (estampaUpper.equals("LOGO DA MARCA") || 
            estampaUpper.equals("LISA") || 
            estampaUpper.equals("DESENHO")) {
        this.estampa = estampaUpper;
        } else {
            throw new EstampaErradaException();
        }
    }    

    public void mostrarBolsos() {
        System.out.println("O moletom tem 2 bolsos: 2 frontais.");
    }

    //Sobrescrita
    public void impDados() { 
        System.out.println("Tamanho...: " + getTamanho() + 
                           "\nMarca...: " + getMarca() + 
                           "\nCor...: " + getCor() + 
                           "\nEstampa...: " + getEstampa() + 
                           "\nCapuz...: " + getCapuz() +
                           "\nTipo de material...: " + getMaterial().getTipo() +
                           "\nCuidados...: " + getMaterial().getCuidados());
     
        mostrarBolsos();                   
    }

    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Moletom other = (Moletom) obj;
    return Objects.equals(getTamanho(), other.getTamanho()) &&
           Objects.equals(getCor(), other.getCor()) &&
           Objects.equals(getMarca(), other.getMarca()) &&
           Objects.equals(getCapuz(), other.getCapuz()) &&
           Objects.equals(getEstampa(), other.getEstampa()) &&
           Objects.equals(getMaterial().getTipo(), other.getMaterial().getTipo()) && // Comparando o tipo de material
           Objects.equals(getMaterial().getCuidados(), other.getMaterial().getCuidados()); // Comparando os cuidados
}
    
}
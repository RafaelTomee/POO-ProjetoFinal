import java.util.Objects;

//Nome: Rafael Tomé da Silva - RA:2623412;
public class Camisa extends Roupa{
    private String tipoManga;
    private String estampa;
    
    public Camisa(){
        super();
        tipoManga = "";
        estampa = "";
    }
    
    public String getTipoManga(){
        return tipoManga;
    }
    
    public String getEstampa(){
        return estampa;
    }
    
    public void setTipoManga(String tipoManga) throws MangaErradaException{
        String mangaUpper = tipoManga.toUpperCase();
        if(mangaUpper.equals("CURTA") || mangaUpper.equals("LONGA")){
            this.tipoManga = mangaUpper;
        } else {
        throw new MangaErradaException();
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
    //Sobrescrita  
    public void impDados() { 
        System.out.println("Tamanho...: " + getTamanho() + 
                           "\nMarca...: " + getMarca() + 
                           "\nCor...: " + getCor() + 
                           "\nEstampa...: " + getEstampa() + 
                           "\nTipo de manga...: " + getTipoManga() + 
                           "\nTipo de material...: " + getMaterial().getTipo() +
                           "\nCuidados...: " + getMaterial().getCuidados());
    }
    
    // Dentro da classe Camisa
@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Camisa other = (Camisa) obj;
    return Objects.equals(getTamanho(), other.getTamanho()) &&
           Objects.equals(getCor(), other.getCor()) &&
           Objects.equals(getMarca(), other.getMarca()) &&
           Objects.equals(getTipoManga(), other.getTipoManga()) &&
           Objects.equals(getEstampa(), other.getEstampa()) &&
           Objects.equals(getMaterial().getTipo(), other.getMaterial().getTipo()) && // Comparando o tipo de material
           Objects.equals(getMaterial().getCuidados(), other.getMaterial().getCuidados()); // Comparando os cuidados
}
}
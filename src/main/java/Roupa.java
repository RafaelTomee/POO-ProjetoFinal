import java.util.Objects;

//Nome: Rafael Tomé da Silva - RA:2623412;
public abstract class Roupa{
    private String tamanho;
    private String cor;
    private String marca;
    
    private Material material;
    
//================================== 
//Sobrecarga
    public Roupa(){
        tamanho = "";
        cor = "";
        marca = "";
        material = new Material();
    }
//Sobrecarga
    public Roupa(String tamanho, String cor, String marca, Material material){
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
    }
    
//================================

    public String getTamanho(){
        return tamanho;
    }
    
    public String getCor(){
        return cor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public Material getMaterial(){
        return material;
    }
//==============================================================

    public void setTamanho(String tamanho) throws TamanhoErradoException{
        String tamanhoUpper = tamanho.toUpperCase();
    
        if (tamanhoUpper.equals("PP") || tamanhoUpper.equals("P") || 
            tamanhoUpper.equals("M") || tamanhoUpper.equals("G") || 
            tamanhoUpper.equals("GG")) {
            this.tamanho = tamanhoUpper; 
        } else {
            throw new TamanhoErradoException();
        }
    }

    public void setCor(String cor) throws CorErradaException{
        String corLower = cor.toLowerCase();

        if (corLower.equals("branca") || 
            corLower.equals("preta") || 
            corLower.equals("azul")) {
            
            this.cor = corLower;
        } else {
            throw new CorErradaException();
        }

    }
    
    public void setMarca(String marca) throws MarcaErradaException{
        String marcaUpper = marca.toUpperCase();
        
        if(marcaUpper.equals("BAW") || marcaUpper.equals("SUFGANG") ||
           marcaUpper.equals("APPROVE") || marcaUpper.equals("WATS") ||
           marcaUpper.equals("HIGH")) {
               this.marca = marcaUpper;
           } else {
               throw new MarcaErradaException();
           }
    }
    
    public void setMaterial(Material material){
        this.material = material;
    }
    
//================================================    
//Sobrescrita
    public abstract void impDados();
    
    public abstract boolean equals(Object obj);
    
}
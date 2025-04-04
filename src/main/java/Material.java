//Nome: Rafael Tomé da Silva - RA:2623412;
public class Material{
    private String tipo;
    private String cuidados;
    
    
//==================================

    public String getTipo(){
        return tipo;
    }
    
    public String getCuidados(){
        return cuidados;
    }
    
    public void setTipo(String tipo) throws TipoErradoException{
        String tipoUpper = tipo.toUpperCase();

        if (tipoUpper.equals("ALGODAO") || tipoUpper.equals("JEANS")) {
            
            this.tipo = tipoUpper;
        } else {
            throw new TipoErradoException();
        }
    }
    
    public void setCuidados(String cuidados) throws CuidadosErradosException{
        String cuidadosLower = cuidados.toLowerCase();
        
        if (cuidadosLower.equals("lavar a mao") || 
            cuidadosLower.equals("lavar na maquina")) {
        
        this.cuidados = cuidadosLower;
        } else {
            throw new CuidadosErradosException();
        }
    }
}
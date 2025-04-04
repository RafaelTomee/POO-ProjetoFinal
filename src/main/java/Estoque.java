//Nome: Rafael Tomé da Silva - RA:2623412;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Estoque {   
    private List<Calca> bdCalca;
    private List<Camisa> bdCamisa;
    private List<Moletom> bdMoletom;
    
     public Estoque() {
        bdCalca = new ArrayList<>();
        bdCamisa = new ArrayList<>();
        bdMoletom = new ArrayList<>();
        inicializarCalcas();
        inicializarCamisas();
        inicializarMoletons();
    }
//-------------------------------------------------Camisa     
    public List<Camisa> getBdCamisa(){
       return bdCamisa; 
    }
    
    public Camisa cadCamisa(Camisa camisa){
        
        if(consCamisa(camisa) == null){
            bdCamisa.add(camisa);
            return camisa;
        }
        else{
            return null;
        }
    }
    
    public Camisa consCamisa(Camisa camisa) {
    for (Camisa c : bdCamisa) {
        if (c.equals(camisa)) {
            JOptionPane.showMessageDialog(null, "Camisa encontrada!");
            return c;  // Retorna a camisa se encontrada
        }
    }
    return null;  // Retorna null se não encontrada
    }
    
    public Camisa atualizaCamisa(Camisa camisa){
        for (int i = 0; i < bdCamisa.size(); i++) {
            Camisa c = bdCamisa.get(i);
            if (c.equals(camisa)) {
                //Calca novaCalca = new Calca(c); // Cria uma NOVA calça (cópia)
                
                
                    
                    try{
                    String novoTamanho = JOptionPane.showInputDialog(null, "Informe o NOVO tamanho");
                        if (novoTamanho != null && !novoTamanho.isEmpty()) {
                            camisa.setTamanho(novoTamanho);
                        }
                    }catch(TamanhoErradoException tee){
                        tee.impTamanhoErrado();                        
                    }
                    
                    try{
                    String novaCor = JOptionPane.showInputDialog(null, "Informe a NOVA cor");
                        if (novaCor != null && !novaCor.isEmpty()) {
                            camisa.setCor(novaCor);
                        }
                    }catch(CorErradaException cee){
                        cee.impCorErrada();
                    }
                    
                    try{
                    String novaMarca = JOptionPane.showInputDialog(null, "Informe a NOVA Marca");
                        if (novaMarca != null && !novaMarca.isEmpty()) {
                            camisa.setMarca(novaMarca);
                        }
                    }catch(MarcaErradaException mee){
                        mee.impMarcaErrada();
                    }
                    
                    try{
                    String novaManga = JOptionPane.showInputDialog(null, "Informe a NOVA manga");
                        if (novaManga != null && !novaManga.isEmpty()) {
                            camisa.setTipoManga(novaManga);
                        }
                    }catch(MangaErradaException mee){
                        mee.impMangaErrada();
                    }
                    
                    try{
                    String novaEstampa = JOptionPane.showInputDialog(null, "Informe a NOVA estampa");
                        if (novaEstampa != null && !novaEstampa.isEmpty()) {
                            camisa.setEstampa(novaEstampa);
                        }
                    }catch(EstampaErradaException cee){
                        cee.impEstampaErrada();
                    }
                    
                    try{
                    String novoMaterial = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de material");
                        if (novoMaterial != null && !novoMaterial.isEmpty()) {
                            camisa.getMaterial().setTipo(novoMaterial);
                        }
                    }catch(TipoErradoException cee){
                        cee.impTipoErrado();
                    }
                    
                    try{
                    String novoCuidado = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de cuidado");
                        if (novoCuidado != null && !novoCuidado.isEmpty()) {
                            camisa.getMaterial().setCuidados(novoCuidado);
                        }
                    }catch(CuidadosErradosException cee){
                        cee.impCuidadosErrados();
                    }
                    
                    bdCamisa.set(i, camisa);
                    return camisa;
                    }
            
        }
        return null;
     }
    
    public Camisa removeCamisa(Camisa camisa){
        camisa = consCamisa(camisa);
        if(camisa != null){
            bdCamisa.remove(camisa);
            return null;
        }
        else{
            return camisa;
        }
    }
//----------------------------------------Calça
    
public List<Calca> getBdCalca(){
       return bdCalca; 
    }
    
    public Calca cadCalca(Calca calca){
        
        if(consCalca(calca) == null){
            bdCalca.add(calca);
            return calca;
        }
        else{
            return null;
        }
    } 
    
    public Calca consCalca(Calca calca) {
    for (Calca c : bdCalca) {
        if (c.equals(calca)) {
            JOptionPane.showMessageDialog(null, "Calca encontrada!");
            return c;  // Retorna a calca se encontrada
        }
    }
    return null;  // Retorna null se não encontrada
    }
    
     public Calca atualizaCalca(Calca calca){
        for (int i = 0; i < bdCalca.size(); i++) {
            Calca c = bdCalca.get(i);
            if (c.equals(calca)) {
                //Calca novaCalca = new Calca(c); // Cria uma NOVA calça (cópia)
                
                
                    
                    try{
                    String novoTamanho = JOptionPane.showInputDialog(null, "Informe o NOVO tamanho");
                        if (novoTamanho != null && !novoTamanho.isEmpty()) {
                            calca.setTamanho(novoTamanho);
                        }
                    }catch(TamanhoErradoException tee){
                        tee.impTamanhoErrado();                        
                    }
                    
                    try{
                    String novaCor = JOptionPane.showInputDialog(null, "Informe a NOVA cor");
                        if (novaCor != null && !novaCor.isEmpty()) {
                            calca.setCor(novaCor);
                        }
                    }catch(CorErradaException cee){
                        cee.impCorErrada();
                    }
                    
                    try{
                    String novaMarca = JOptionPane.showInputDialog(null, "Informe a NOVA Marca");
                        if (novaMarca != null && !novaMarca.isEmpty()) {
                            calca.setMarca(novaMarca);
                        }
                    }catch(MarcaErradaException mee){
                        mee.impMarcaErrada();
                    }
                    
                    try{
                    String novaCintura = JOptionPane.showInputDialog(null, "Informe a NOVA cintura");
                        if (novaCintura != null && !novaCintura.isEmpty()) {
                            calca.setTipoCintura(novaCintura);
                        }
                    }catch(CinturaErradaException mee){
                        mee.impCinturaErrada();
                    }
                    
                    try{
                    String novoComprimento = JOptionPane.showInputDialog(null, "Informe o NOVO comprimento");
                        if (novoComprimento != null && !novoComprimento.isEmpty()) {
                            calca.setComprimento(novoComprimento);
                        }
                    }catch(ComprimentoErradoException cee){
                        cee.impComprimentoErrado();
                    }
                    
                    try{
                    String novoMaterial = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de material");
                        if (novoMaterial != null && !novoMaterial.isEmpty()) {
                            calca.getMaterial().setTipo(novoMaterial);
                        }
                    }catch(TipoErradoException cee){
                        cee.impTipoErrado();
                    }
                    
                    try{
                    String novoCuidado = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de cuidado");
                        if (novoCuidado != null && !novoCuidado.isEmpty()) {
                            calca.getMaterial().setCuidados(novoCuidado);
                        }
                    }catch(CuidadosErradosException cee){
                        cee.impCuidadosErrados();
                    }
                    
                    bdCalca.set(i, calca);
                    return calca;
                    }
            
        }
        return null;
     }
        /* 
        for(Calca c : bdCalca){

            if(c.equals(calca)){
                
            try{    
            String m = JOptionPane.showInputDialog(null, "Informe o NOVO tamanho");
            calca.setTamanho(m);
            }catch(TamanhoErradoException tee){
                tee.impTamanhoErrado();
            }
            
            try{    
            String m = JOptionPane.showInputDialog(null, "Informe a NOVA cor");
            calca.setCor(m);
            }catch(CorErradaException cee){
                cee.impCorErrada();
            }
            
            try{    
            String m = JOptionPane.showInputDialog(null, "Informe a NOVA marca");
            calca.setMarca(m);
            }catch(MarcaErradaException mee){
                mee.impMarcaErrada();
            }
            
            try{    
            String m = JOptionPane.showInputDialog(null, "Informe a NOVA cintura");
            calca.setTipoCintura(m);
            }catch(CinturaErradaException mee){
                mee.impCinturaErrada();
            }
            
            
            try{    
            String m = JOptionPane.showInputDialog(null, "Informe o NOVO comprimento");
            calca.setComprimento(m);
            }catch(ComprimentoErradoException cee){
                cee.impComprimentoErrado();
            }
            
            try{    
            String m = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de material");
            calca.getMaterial().setTipo(m);
            }catch(TipoErradoException cee){
                cee.impTipoErrado();
            }
            
            try{    
            String m = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de cuidado");
            calca.getMaterial().setCuidados(m);
            }catch(CuidadosErradosException cee){
                cee.impCuidadosErrados();
            }

            
            return c;    
            }
        }
        return null;
    }
     */
    public Calca removeCalca(Calca calca){
        calca = consCalca(calca);
        if(calca != null){
            bdCalca.remove(calca);
            return null;
        }
        else{
            return calca;
        }
    }
    
    

    
    /*public Camisa consCamisa(Camisa camisa) {
    for (int i = 0; i<bdCamisa.size();i++) {
        if (Objects.equals(camisa.getTamanho(), bdCamisa.get(i).getTamanho()) &&
            Objects.equals(camisa.getCor(), bdCamisa.get(i).getCor()) &&
            Objects.equals(camisa.getMarca(), bdCamisa.get(i).getMarca()) &&
            Objects.equals(camisa.getTipoManga(), bdCamisa.get(i).getTipoManga()) &&
            Objects.equals(camisa.getEstampa(), bdCamisa.get(i).getEstampa()) &&
            Objects.equals(camisa.getMaterial(), bdCamisa.get(i).getMaterial())) {

            return bdCamisa.get(i);
        }
    }
    return null;
}*/
    
//--------------------------------------------    
    
    public List<Moletom> getBdMoletom(){
       return bdMoletom; 
    }
    
    public Moletom cadMoletom(Moletom moletom){
        
        if(consMoletom(moletom) == null){
            bdMoletom.add(moletom);
            return moletom;
        }
        else{
            return null;
        }
    } 
    
    public Moletom consMoletom(Moletom moletom) {
    for (Moletom c : bdMoletom) {
        if (c.equals(moletom)) {
            JOptionPane.showMessageDialog(null, "Moletom encontrada!");
            return c;  // Retorna a calca se encontrada
        }
    }
    return null;  // Retorna null se não encontrada
    }
    
    public Moletom atualizaMoletom(Moletom moletom){
        for (int i = 0; i < bdMoletom.size(); i++) {
            Moletom c = bdMoletom.get(i);
            if (c.equals(moletom)) {
                //Calca novaCalca = new Calca(c); // Cria uma NOVA calça (cópia)
                
                
                    
                    try{
                    String novoTamanho = JOptionPane.showInputDialog(null, "Informe o NOVO tamanho");
                        if (novoTamanho != null && !novoTamanho.isEmpty()) {
                            moletom.setTamanho(novoTamanho);
                        }
                    }catch(TamanhoErradoException tee){
                        tee.impTamanhoErrado();                        
                    }
                    
                    try{
                    String novaCor = JOptionPane.showInputDialog(null, "Informe a NOVA cor");
                        if (novaCor != null && !novaCor.isEmpty()) {
                            moletom.setCor(novaCor);
                        }
                    }catch(CorErradaException cee){
                        cee.impCorErrada();
                    }
                    
                    try{
                    String novaMarca = JOptionPane.showInputDialog(null, "Informe a NOVA Marca");
                        if (novaMarca != null && !novaMarca.isEmpty()) {
                            moletom.setMarca(novaMarca);
                        }
                    }catch(MarcaErradaException mee){
                        mee.impMarcaErrada();
                    }
                    
                    try{
                    String novoCapuz = JOptionPane.showInputDialog(null, "Informe o NOVO capuz");
                        if (novoCapuz != null && !novoCapuz.isEmpty()) {
                            moletom.setCapuz(novoCapuz);
                        }
                    }catch(CapuzErradoException mee){
                        mee.impCapuzErrado();
                    }
                    
                    try{
                    String novaEstampa = JOptionPane.showInputDialog(null, "Informe a NOVA estampa");
                        if (novaEstampa != null && !novaEstampa.isEmpty()) {
                            moletom.setEstampa(novaEstampa);
                        }
                    }catch(EstampaErradaException cee){
                        cee.impEstampaErrada();
                    }
                    
                    try{
                    String novoMaterial = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de material");
                        if (novoMaterial != null && !novoMaterial.isEmpty()) {
                            moletom.getMaterial().setTipo(novoMaterial);
                        }
                    }catch(TipoErradoException cee){
                        cee.impTipoErrado();
                    }
                    
                    try{
                    String novoCuidado = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de cuidado");
                        if (novoCuidado != null && !novoCuidado.isEmpty()) {
                            moletom.getMaterial().setCuidados(novoCuidado);
                        }
                    }catch(CuidadosErradosException cee){
                        cee.impCuidadosErrados();
                    }
                    
                    bdMoletom.set(i, moletom);
                    return moletom;
                    }
            
        }
        return null;
     }
    
    public Moletom removeMoletom(Moletom moletom){
        moletom = consMoletom(moletom);
        if(moletom != null){
            bdMoletom.remove(moletom);
            return null;
        }
        else{
            return moletom;
        }
    }
    
    
    
    
    
    
    
    

    private void inicializarCalcas() {
        Calca calca1 = new Calca();
        try{
            calca1.setTamanho("G");
        } catch(TamanhoErradoException tee){
            tee.impTamanhoErrado();
        }
        
        try{
            calca1.setCor("azul");
        } catch(CorErradaException cee){
            cee.impCorErrada();
        }

        try{
            calca1.setMarca("BAW");
        } catch(MarcaErradaException tee){
            tee.impMarcaErrada();
        }
        
        try{
            calca1.setTipoCintura("ALTA");
        } catch(CinturaErradaException cee){
            cee.impCinturaErrada();
        }
        
        try{
            calca1.setComprimento("102-104");
        } catch(ComprimentoErradoException cee){
            cee.impComprimentoErrado();
        }
        
        try{
            calca1.getMaterial().setTipo("JEANS");
        } catch(TipoErradoException tee){
            tee.impTipoErrado();
        }
        
        try{
            calca1.getMaterial().setCuidados("lavar na maquina");
        } catch(CuidadosErradosException cee){
            cee.impCuidadosErrados();
        }
        
        bdCalca.add(calca1);

        Calca calca2 = new Calca();
        try{
            calca2.setTamanho("P");
        } catch(TamanhoErradoException tee){
                tee.impTamanhoErrado();
        }

        try{
            calca2.setCor("preta");
        } catch(CorErradaException cee){
            cee.impCorErrada();
        }    
        
        try{
            calca2.setMarca("WATS");
        } catch(MarcaErradaException tee){
            tee.impMarcaErrada();
        }
        
        try{
            calca2.setTipoCintura("MEDIA");
        } catch(CinturaErradaException cee){
            cee.impCinturaErrada();
        }
        
        try{
            calca2.setComprimento("98-100");
        } catch(ComprimentoErradoException cee){
            cee.impComprimentoErrado();
        }
        
        try{
            calca2.getMaterial().setTipo("JEANS");
        } catch(TipoErradoException tee){
            tee.impTipoErrado();
        }
        
        try{
            calca2.getMaterial().setCuidados("lavar na maquina");
        } catch(CuidadosErradosException cee){
            cee.impCuidadosErrados();
        }
        
        bdCalca.add(calca2);

        Calca calca3 = new Calca();
        
        try{
            calca3.setTamanho("PP");
        } catch(TamanhoErradoException tee){
            tee.impTamanhoErrado();
        }  
            
        try{
            calca3.setCor("azul");
        } catch(CorErradaException cee){
            cee.impCorErrada();
        }      
        
        try{
            calca3.setMarca("HIGH");
        } catch(MarcaErradaException tee){
            tee.impMarcaErrada();
        }
        
        try{
            calca3.setTipoCintura("BAIXA");
        } catch(CinturaErradaException cee){
            cee.impCinturaErrada();
        }
        
        try{
            calca3.setComprimento("96-98");
        } catch(ComprimentoErradoException cee){
            cee.impComprimentoErrado();
        }
        
        try{
            calca3.getMaterial().setTipo("JEANS");
        } catch(TipoErradoException tee){
            tee.impTipoErrado();
        }

        try{
            calca3.getMaterial().setCuidados("lavar na maquina");
        } catch(CuidadosErradosException cee){
            cee.impCuidadosErrados();
        }
        
        bdCalca.add(calca3);
        }
        
    private void inicializarCamisas(){    
        Camisa camisa1 = new Camisa();
        
        try{
            camisa1.setTamanho("G");
        } catch(TamanhoErradoException tee){
            tee.impTamanhoErrado();
        }
        
        try{
            camisa1.setCor("branca");
        } catch(CorErradaException cee){
            cee.impCorErrada();
        } 

        try{
            camisa1.setMarca("SUFGANG");
        } catch(MarcaErradaException tee){
            tee.impMarcaErrada();
        }
        
        try{
            camisa1.setTipoManga("LONGA");
        } catch(MangaErradaException mee){
            mee.impMangaErrada();
        }
        
        try{
            camisa1.setEstampa("LISA");
        } catch(EstampaErradaException mee){
            mee.impEstampaErrada();
        }
        
        try{
            camisa1.getMaterial().setTipo("ALGODAO");
        } catch(TipoErradoException tee){
            tee.impTipoErrado();
        }
        
        try{
            camisa1.getMaterial().setCuidados("lavar a mao");
        } catch(CuidadosErradosException cee){
            cee.impCuidadosErrados();
        }
        
        bdCamisa.add(camisa1);

        Camisa camisa2 = new Camisa();
        
        try{
            camisa2.setTamanho("M");
        } catch(TamanhoErradoException tee){
            tee.impTamanhoErrado();
        } 

        try{
            camisa2.setCor("preta");
        } catch(CorErradaException cee){
            cee.impCorErrada();
        }     
        
        try{
            camisa2.setMarca("Approve");
        } catch(MarcaErradaException tee){
            tee.impMarcaErrada();
        }
        
        try{
            camisa2.setTipoManga("CURTA");
        } catch(MangaErradaException mee){
            mee.impMangaErrada();
        }
        
        try{
            camisa2.setEstampa("LOGO DA MARCA");
        } catch(EstampaErradaException mee){
            mee.impEstampaErrada();;
        }
        
        try{
            camisa2.getMaterial().setTipo("ALGODAO");
        } catch(TipoErradoException tee){
            tee.impTipoErrado();
        }
        
        try{
            camisa2.getMaterial().setCuidados("lavar a mao");
        } catch(CuidadosErradosException cee){
            cee.impCuidadosErrados();
        }
        
        bdCamisa.add(camisa2);

        Camisa camisa3 = new Camisa();
        
        try{
            camisa3.setTamanho("G");
        } catch(TamanhoErradoException tee){
            tee.impTamanhoErrado();
        } 

        try{
            camisa3.setCor("azul");
        } catch(CorErradaException cee){
            cee.impCorErrada();
        }     

        try{
            camisa3.setMarca("HIGH");
        } catch(MarcaErradaException tee){
            tee.impMarcaErrada();
        }
        
        try{
            camisa3.setTipoManga("CURTA");
        } catch(MangaErradaException mee){
            mee.impMangaErrada();
        }
        
        try{
            camisa3.setEstampa("DESENHO");
        } catch(EstampaErradaException mee){
            mee.impEstampaErrada();;
        }
        
        try{
            camisa3.getMaterial().setTipo("ALGODAO");
        } catch(TipoErradoException tee){
            tee.impTipoErrado();
        }
        
        try{
            camisa3.getMaterial().setCuidados("lavar a mao");
        } catch(CuidadosErradosException cee){
            cee.impCuidadosErrados();
        }
        
        bdCamisa.add(camisa3);
    }

    private void inicializarMoletons(){    
        Moletom moletom1 = new Moletom();
        
        try{
            moletom1.setTamanho("GG");
        } catch(TamanhoErradoException tee){
            tee.impTamanhoErrado();
        } 

        try{
            moletom1.setCor("preta");
        } catch(CorErradaException cee){
            cee.impCorErrada();
        }     
        
        try{
            moletom1.setMarca("APPROVE");
        } catch(MarcaErradaException tee){
            tee.impMarcaErrada();
        }
        
        try{
            moletom1.setCapuz("COM CAPUZ");
        } catch(CapuzErradoException tee){
            tee.impCapuzErrado();
        }
        
        try{
            moletom1.setEstampa("LISA");
        } catch(EstampaErradaException tee){
            tee.impEstampaErrada();
        }
        
        try{
            moletom1.getMaterial().setTipo("ALGODAO");
        } catch(TipoErradoException tee){
            tee.impTipoErrado();
        }
        
        try{
            moletom1.getMaterial().setCuidados("lavar a mao");
        } catch(CuidadosErradosException cee){
            cee.impCuidadosErrados();
        }
        
        bdMoletom.add(moletom1);

        Moletom moletom2 = new Moletom();
        
        try{
            moletom2.setTamanho("P");
        } catch(TamanhoErradoException tee){
            tee.impTamanhoErrado();
        } 

        try{
            moletom2.setCor("preta");
        } catch(CorErradaException cee){
            cee.impCorErrada();
        }      

        try{
            moletom2.setMarca("HIGH");
        } catch(MarcaErradaException tee){
            tee.impMarcaErrada();
        }
        
        try{
            moletom2.setCapuz("SEM CAPUZ");
        } catch(CapuzErradoException tee){
            tee.impCapuzErrado();
        }
        
        try{
            moletom2.setEstampa("LOGO DA MARCA");
        } catch(EstampaErradaException tee){
            tee.impEstampaErrada();
        }
        
        try{
            moletom2.getMaterial().setTipo("ALGODAO");
        } catch(TipoErradoException tee){
            tee.impTipoErrado();
        }
        
        try{
            moletom2.getMaterial().setCuidados("lavar a mao");
        } catch(CuidadosErradosException cee){
            cee.impCuidadosErrados();
        }
        
        bdMoletom.add(moletom2);

    }

    public List<Calca> getCalcaDisponiveis() {
        return bdCalca;
    }

    public List<Camisa> getCamisasDisponiveis() {
        return bdCamisa;
    }

    public List<Moletom> getMoletonsDisponiveis() {
        return bdMoletom;
    }

    public void mostrarRoupas() {
        System.out.println("Calcas disponiveis:");
        for (Calca calca : bdCalca) {
            calca.impDados();
            System.out.println();
        }

        System.out.println("Camisas disponiveis:");
        for (Camisa camisa : bdCamisa) {
            camisa.impDados();
            System.out.println();
        }

        System.out.println("Moletons disponiveis:");
        for (Moletom moletom : bdMoletom) {
            moletom.impDados();
            System.out.println();
        }
    }
    
    public void mostrarCalcas(){
        System.out.println("Calcas disponiveis:");
        for (Calca calca : bdCalca) {
            calca.impDados();
            System.out.println();
        }
    }
    
    public void mostrarCamisas(){
        System.out.println("Camisas disponiveis:");
        for (Camisa camisa : bdCamisa) {
            camisa.impDados();
            System.out.println();
        }
    }

    public void mostrarMoletons(){
        System.out.println("Moletons disponiveis:");
        for (Moletom moletom : bdMoletom) {
            moletom.impDados();
            System.out.println();
        }
    }
}
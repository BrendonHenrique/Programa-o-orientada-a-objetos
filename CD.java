package database;

public class CD extends Item {
     
    private String Artista;
    private final String Faixa; 
    
    //construtor
    public CD(String Titulo, int Tempo,String Artista,String Faixa) {
        super(Titulo, Tempo);
        this.Artista = Artista;
        this.Faixa = Faixa;
    } 
    
    //getters e setters
    public String getArtista() {
        return Artista;
    }
    public void setArtista(String Artista) {
        this.Artista = Artista;
    }
    public String getFaixa() {
        return faixa;
    }
    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }
    
    
    //metodos
    @Override
    public void Imprimir(){
        System.out.println("[CD]"+"Artista:"+this.Artista+"\nNumero de faixas:"+this.Faixa);
        
    //esse metodo ira imprimir os dados da classe super
    // ou seja ,irá imprimir os dados definidos no item
    // por isso vem super.
    
    super.Imprimir();
    }

}

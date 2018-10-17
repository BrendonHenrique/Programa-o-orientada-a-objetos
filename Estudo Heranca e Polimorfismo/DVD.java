package database;

public class DVD extends Item {
    
    private String Diretor;
    
    public DVD(String Titulo, int Tempo,String Diretor) {
        super(Titulo, Tempo);
        this.Diretor = Diretor;
    }
    public String getDiretor() {
        return Diretor;
    }
    
    //esse metodo ira funcionar para imprimir a herança CD
    @Override
    public void Imprimir(){
        System.out.println("[DVD]"+"Diretor:"+this.Diretor);
        super.Imprimir();
    }
    
}

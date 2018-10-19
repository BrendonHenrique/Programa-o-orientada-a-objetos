package main;

public class carroPasseio extends veiculo {

    private String cor;

    public carroPasseio(String cor, int velocidadeMaxima, float preco, float ipva) {
        super(velocidadeMaxima, preco, ipva);
        this.cor = cor;
    }
    
 
    @Override
    public String toString() {
        return "cor " + cor+super.toString();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
    
}

package main;

public class caminhao extends veiculo {
    
    private int peso;

    public caminhao(int peso, int velocidadeMaxima, float preco, float ipva) {
        super(velocidadeMaxima, preco, ipva);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "peso = " + peso +" Toneladas "+super.toString();
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}

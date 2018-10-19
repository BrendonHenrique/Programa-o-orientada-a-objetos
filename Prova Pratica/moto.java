package main;

public class moto extends veiculo {

    private int cilindradas;

    public moto(int cilindradas, int velocidadeMaxima, float preco, float ipva) {
        super(velocidadeMaxima, preco, ipva);
        this.cilindradas = cilindradas;
    }

    

    @Override
    public String toString() {
        return "cilindradas = " + cilindradas+super.toString();
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
    
}

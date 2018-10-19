package main;
public abstract class veiculo {
    
    private int velocidadeMaxima;
    private float preco;
    private float ipva;
    private float taxaIpva;
    
    protected float calcularIpva(){
        
        return ((this.ipva/100)*this.preco);
    }
    
    public veiculo(int velocidadeMaxima, float preco, float ipva) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
        this.ipva = ipva;
        this.taxaIpva = calcularIpva();

    }

    @Override
    public String toString() {
        return " - Velocidade Maxima = " + velocidadeMaxima+"Km/h"+ " - preco = R$" + preco + "\nTaxaBase para ipva : " + ipva
                +" - Valor do Imposto: R$"+this.taxaIpva+"\n";
    }
     
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float  getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getIpva() {
        return ipva;
    }

    public void setIpva(float ipva) {
        this.ipva = ipva;
    }
    
    
}

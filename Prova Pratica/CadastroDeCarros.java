package main;
import javax.swing.JOptionPane;

public class CadastroDeCarros {

    public static void main(String[] args) {
    
    //Classes disponiveis para instanciar carroPasseio,caminhao,moto
    //Classe veiculo é tipo abstrata , logo não pode ser instanciada
    //Atributos da classe veiculo é protected, portanto pode ser modificadas por subclasses
    
    int choice = JOptionPane.showConfirmDialog(null,"Iniciar Programa ?");
    
    if(choice == 0 ){
        
        JOptionPane.showMessageDialog(null, "Instanciando Veiculos");
        veiculo[] veiculos = new veiculo[12];

        //instanciando motos
        //public moto(int cilindradas, int velocidadeMaxima, int preco, float ipva) 
        veiculos[0] = new moto(150,200,(float)15000,(float)2.0);
        veiculos[1] = new moto(200,260,(float)25000,(float)2.0);
        veiculos[2] = new moto(230,320,(float)30000,(float)2.0);
        veiculos[3] = new moto(400,600,(float)40000,(float)2.0);

        //Instanciando carroPasseio
        //public carroPasseio(String cor, int velocidadeMaxima, int preco, float ipva)
        veiculos[4] = new carroPasseio("Preto",200,(float)15000,(float)2.5);
        veiculos[5] = new carroPasseio("Azul",235,(float)25000,(float)2.5);
        veiculos[6] = new carroPasseio("Verde",260,(float)45000,(float)2.5);
        veiculos[7] = new carroPasseio("Branco",280,(float)65000,(float)2.5);

        //Instanciando caminhao
        //public caminhao(int peso, int velocidadeMaxima, int preco, float ipva)
        veiculos[8] = new caminhao(2,200,(float)30000,(float)1.5);
        veiculos[9] = new caminhao(4,150,(float)26000,(float)1.5);
        veiculos[10] = new caminhao(6,110,(float)27000,(float)1.5);
        veiculos[11] = new caminhao(4,130,(float)37000,(float)1.5);

        int choice2 = JOptionPane.showConfirmDialog(null,"Imprimir em Interface ?");
        if(choice2==0){
            JOptionPane.showMessageDialog(null, "Veiculo[0]\n"+veiculos[0].toString()+"\n"
                    +"Veiculo[1]\n"+veiculos[1].toString()+"\n"
                    +"Veiculo[2]\n"+veiculos[2].toString()+"\n"
                    +"Veiculo[3]\n"+veiculos[3].toString()+"\n"
                    +"Veiculo[4]\n" +veiculos[4].toString()+"\n"
                    +"Veiculo[5]\n"+veiculos[5].toString()+"\n"
                    +"Veiculo[6]"+"\n"+veiculos[6].toString()+"\n"
                    +"Veiculo[7]"+"\n"+veiculos[7].toString()+"\n"
                    +"Veiculo[8]"+"\n"+veiculos[8].toString()+"\n"
                    +"Veiculo[9]"+"\n"+veiculos[9].toString()+"\n"
                    +"Veiculo[10]"+"\n"+veiculos[10].toString()+"\n"
                    +"Veiculo[11]"+"\n"+veiculos[11].toString());
        }else if(choice2 == 1){
            //Impressao no console
            JOptionPane.showMessageDialog(null, "Imprimindo no Console");
            for (int i = 0 ; i < veiculos.length ; i++) {
                System.out.print("Veiculo["+i+"] : ");
                System.out.println(" "+ veiculos[i].toString());
            }
        }else if(choice2 == 2){
            JOptionPane.showMessageDialog(null, "Programa cancelado");
        }
    }
        else if(choice == 1){
         JOptionPane.showMessageDialog(null, "Nao inicializar");
        }
        else if(choice == 2){
          JOptionPane.showMessageDialog(null, "Programa cancelado");
         } 
    }
}

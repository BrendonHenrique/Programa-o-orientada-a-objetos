package app;    
import javax.swing.JOptionPane;


public class App { 
    public static void main(String[] args) {
        
        //PopUp Com caixa de entrada -  Retorna uma string da entrada
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        
        //PopUp com caixa de saida sem retorno
        JOptionPane.showMessageDialog(null,"Seu nome é "+nome);
        
        //PopUp com caixa de confirmações : com os botões sim , não e cancelar
        //retorna um valor inteiro por isso ao final da chamada da função o system.out.println retorna o valor do resultado
        
        //Teste para casos diferentes de respostas
        for (int i = 0; i < 3; i++) {
            int result = JOptionPane.showConfirmDialog(null, "Seu nome é ? "+nome);
            System.out.println(result);
        }
        
        //Sim retorna 0
        //Não retorna 1
        //Cancelar retorna 2
        
    }
}

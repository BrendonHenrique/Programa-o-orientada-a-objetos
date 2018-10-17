
package aula;
    /**
     *@author Brendon H.S.S
     * @version 1.0
     * 
     */
public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    /**
     *Fazer Aniversario : this.SetIdade(This.getIdade()+1);
     */
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo ;
    }
    
}
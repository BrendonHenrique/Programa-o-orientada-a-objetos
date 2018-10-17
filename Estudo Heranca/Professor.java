package aula;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    
    /**
     *Receber aumento : this.salario += aumento
     *@param {float} Valor de Aumento
     */
    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return super.toString()+" especialidade = " + especialidade + ", salario = " + salario;
    }
    
}

package aula;
public class Aula {
    public static void main(String[] args) {
        
        Pessoa p1  = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        //Pessoa 
        //Atributos de pessoa : Nome , idade , sexo
        //Métodos Fazer Aniversário
        p1.setNome("BrendonPessoa");
        p1.setIdade(24);
        p1.setSexo("Masculino");
        System.out.println(""+p1.toString());
        System.out.println("Fazendo Aniversário(...)");
        p1.fazerAniversario();
        System.out.println(""+p1.toString());
        
        //Aluno extends Pessoa
        //Atributos de Aluno : Nome , idade, sexo , matricula , curso 
        //Métodos  Cancelar matricula e Fazer Aniversário
        p2.setNome("BrendonAluno");
        p2.setIdade(25);
        p2.setSexo("Masculino");
        p2.setMat(17102324);
        p2.setCurso("BCC");
        System.out.println(""+p2.toString());
        System.out.println("Cancelando Matricula(...)");
        p2.cancelarmat();
        System.out.println(""+p2.toString());
        
        //Professor extends pessoa
        //Atributos de professor : Nome , idade , sexo ,  Especialidade , salário
        //Métodos Receber aumento e Fazer Aniversário
        p3.setNome("BrendonProf");
        p3.setIdade(30);
        p3.setSexo("Masculino");
        p3.setEspecialidade("IA");
        p3.setSalario(10000);
        System.out.println(""+p3.toString());
        p3.receberAumento(100);
        System.out.println(""+p3.toString());
        
        //Funcionario extends pessoa
        //atributos de funcionario: Nome ,idade , sexo , Setor e Trabalhando
        //Métodos Mudar Trabalhando para não Trabalhando e Fazer Aniversário
        p4.setNome("BrendonFunc");
        p4.setIdade(40);
        p4.setSexo("Masculino");
        p4.setSetor("Administrativo");
        p4.setTrabalhando(true);
        System.out.println(""+p4.toString());
        System.out.println("Mudando Trabalhando");
        p4.mudarTrabalho();
        System.out.println(""+p4.toString());
    }
}

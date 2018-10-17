package aula;

public class Aluno extends Pessoa {
    
    private int mat;
    private String curso;
    
    /**
     * Cancela a matricula: this.mat = -1
     */
    public void cancelarmat(){
        System.out.println("Matrícula cancelada");
        this.mat = -1;
    }

    public int getMat() {
        return mat;
    }
    
    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return  super.toString() +", mat = " + mat + ", curso = " + curso ;
    }
    
}

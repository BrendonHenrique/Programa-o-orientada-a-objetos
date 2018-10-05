package database;

public class Item {

protected String Titulo;
protected String Comentario;
protected boolean Tenho;
protected int Tempo;


//construtor
public Item(String Titulo, int Tempo) {
    this.Titulo = Titulo;
    this.Comentario = Comentario;
}

//setters getters
public String getComentario() {
    return Comentario;
}
public void setComentario(String Comentario) {
    this.Comentario = Comentario;
}
//getTenho ou getPropriedade
public boolean isTenho() {
    return Tenho;
}
//setTenho ou setPropriedade
public void setTenho(boolean Tenho) {
    this.Tenho = Tenho;
}

//metodos
public void Imprimir(){
    System.out.println("Titulo: "+this.Titulo+"\nComentarios: "+this.Comentario+
                       "\nTenho: "+this.Tenho+"\nTempo:"+this.Tempo);
}
}

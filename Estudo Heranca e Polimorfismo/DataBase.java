package database;
import java.util.ArrayList;

public class DataBase {
    
    private ArrayList<Item>db;
    
    public DataBase() {
        db = new ArrayList<Item>();
    }
    
    public void Imprimir(){
        //laço for it 
        //para cada elemento guardado ele irá fazer os metodos dentro
        
        for(Item item : db){
            item.Imprimir();
        }
    }
    
    public void inserir(Item novo ){
        db.add(novo);
    }
    
    // esse metodo retorna o ponteiro passado pelo indice 
    public Item getItem(int indice){
        return db.get(indice);
    }
    
    void main(){
        //instancia o objeto db , do tipo DataBase 
        //que cria um objeto do tipo item 
        DataBase db = new DataBase();
        
        /*
        1 metodo 
        
        Item item = new CD (propriedades do cd);
        db.inserir(item);
        item.setTenho(true);
        
        item = new DVD (propriedades do dvd);
        db.inserir(item);
        item.setTenho(true);
        */
        
        /*
        2 metodo
        
        db.inserir(new CD(....);
        db.getItem(0).setTenho(true);
        db.imprimir(0);
        
        */
        
        
    }
    
}

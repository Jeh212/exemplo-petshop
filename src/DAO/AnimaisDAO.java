
package DAO;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import Javabeam.Animais;
import java.sql.PreparedStatement;


public class AnimaisDAO {
    private final  Connection conecta; 
    
    
    //Construtor
  
    public AnimaisDAO(){
        this.conecta = new ConnectionFactory().getConecta();
    }
    
    //Metodos cadastrar Animal
    
    public void cadastrarAnimal(Animais obj){
   
        String sql = "INSERT INTO usuario(nome,raca,idade,cor,preco) VALUES(?,?,?,?,?)";
        try { 
            try (PreparedStatement stmt = conecta.prepareStatement(sql)) {
                stmt.setString(1, obj.getNome());
                stmt.setString(2, obj.getRaca());
                stmt.setString(3, obj.getIdade());
                stmt.setString(4, obj.getCor());
                stmt.setString(4, obj.getPreco());
                stmt.execute();
            }
            
            
        } catch (SQLException erro ) {
            throw new RuntimeException(erro);
        
        }
        
        
    
    }
    
    
}

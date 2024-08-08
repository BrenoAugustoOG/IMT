package br.com.breno._maua_poo_sistema_academico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.util.*;
public class DAO { //Objeto de Acesso a Dados
    //Cláusula catch or declare
    public boolean existe(Usuario u) throws Exception{
            //jdbc: Java Database Connectivity
            
            //1. Especificar o comando SQL
            String sql = "SELECT * FROM tb_usuario WHERE login = ? AND senha = ?";
            
            //2. Establecer uma conexão com o banco de dados
            Connection conexao = ConnectionFactory.obterConexao();
            
            //3. Preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            //4. Substitutir os eventuais placeholders
            ps.setString(1, u.getNome());
            ps.setString(2, u.getSenha());
            
            //5. Executar o comando
            ResultSet rs = ps.executeQuery();
            
            //6. Lidar com o resultado
            boolean achou = rs.next();
            
            //7. Fechar a conexão
            rs.close();
            ps.close();
            conexao.close();
            
            //8. Responder se o usuário existe ou não
            return achou;
    }
    
    //Cláusula catch or declare
    public List<Curso> obterCursos() throws Exception{
        var sql = "SELECT * FROM tb_curso";
        
        //try-with-resources (Java 7+)
        try(
                Connection conexao = ConnectionFactory.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
        ){
            while(rs.next()){
                var nome = rs.getString("nome");
                System.out.println(nome);
            }
            // a conexão ja foi fechada no try-with-resources
        }
        return null;
    }
    //apenas teste
    public static void main(String [] args) throws Exception{
        new DAO().obterCursos();
    }
}
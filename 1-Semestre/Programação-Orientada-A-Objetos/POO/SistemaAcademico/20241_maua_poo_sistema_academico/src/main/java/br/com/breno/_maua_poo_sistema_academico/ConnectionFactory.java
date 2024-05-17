
package br.com.breno._maua_poo_sistema_academico;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String host = "mysql-b8d0c96-breno-testes.d.aivencloud.com";
    private static String porta = "24443";
    private static String db = "defaultdb";
    private static String usuario = "avnadmin";
    private static String senha =  "AVNS_Kq7YbdFoDMTxQx7Zzx3";
    
    public static Connection obterConexao()
        throws Exception{
        String url = String.format("jdbc:mysql://%s:%s/%s", host, porta, db);
        return DriverManager.getConnection(url, usuario, senha);
    }
}

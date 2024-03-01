/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author User
 */
public class ModuloConexao {

    //metodo responsavel por estabelecer a conexão com banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver que importamos na biblioteca
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "clic147258";
        // estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
             // essa linha serve de apoio para saber o erro
            // System.err.println(e);
            return null;
        }
    }
}

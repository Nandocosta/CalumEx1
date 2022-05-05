package br.com.nando.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.nando.jdbc.ConnectionFactory;
import br.com.nando.jdbc.modelo.Funcionario;

public class FuncionarioDao {

    private Connection connection;

    public FuncionarioDao(){
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adciona(Funcionario funcionario){
        String sql = "insert into funcionarios " + "(nome, usuario, senha) " + "values(?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getUsuario());
            stmt.setString(3, funcionario.getSenha());

            stmt.execute();
            stmt.close();

        } catch (SQLException erro) {
           
        }
    }
}

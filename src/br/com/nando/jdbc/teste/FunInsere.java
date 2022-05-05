package br.com.nando.jdbc.teste;

import br.com.nando.jdbc.dao.FuncionarioDao;
import br.com.nando.jdbc.modelo.Funcionario;

public class FunInsere {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("fernando Castro");
        funcionario.setUsuario("Fernando");
        funcionario.setSenha("1234567");

        FuncionarioDao dao = new FuncionarioDao();
        dao.adciona(funcionario);
        System.out.println("Funcionario cadastrado");
    }
}

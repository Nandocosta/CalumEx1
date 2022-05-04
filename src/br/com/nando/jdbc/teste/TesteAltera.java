package br.com.nando.jdbc.teste;

import java.util.Calendar;

import br.com.nando.jdbc.dao.ContatoDao;
import br.com.nando.jdbc.modelo.Contato;

public class TesteAltera {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("francisco");
        contato.setEmail("francisco@gmail.com");
        contato.setEndereco("rua jubileu da rocha");
        contato.setDataNascimento(Calendar.getInstance());
        contato.setId(1);
        
        ContatoDao dao = new ContatoDao();
        dao.altera(contato);
        System.out.println("Alterado!");
    }
}

package br.com.nando.jdbc.teste;

import java.util.Calendar;

import br.com.nando.jdbc.dao.ContatoDao;
import br.com.nando.jdbc.modelo.Contato;

public class TestaInsere {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Wagner");
        contato.setEmail("Wagner@gmail.com");
        contato.setEndereco("rua São joao pereira");
        contato.setDataNascimento(Calendar.getInstance());
      
        ContatoDao dao = new ContatoDao();
        dao.adciona(contato);
        System.out.println("Salvo!");

    }
}

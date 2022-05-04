package br.com.nando.jdbc.teste;

import br.com.nando.jdbc.dao.ContatoDao;
import br.com.nando.jdbc.modelo.Contato;

public class TesteRemove {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setId(1);

       ContatoDao dao = new ContatoDao();
       dao.remove(contato);
       System.out.println("Contato removido");
    }
}

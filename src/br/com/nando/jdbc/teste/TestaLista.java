package br.com.nando.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.nando.jdbc.dao.ContatoDao;
import br.com.nando.jdbc.modelo.Contato;

public class TestaLista {
    public static void main(String[] args) {

        ContatoDao dao = new ContatoDao();
        List<Contato> contatos = dao.getLista();
    
        for(Contato contato : contatos){
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Endereço: " + contato.getEndereco());
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yy");
            System.out.println("Data de Nascimento: " +  date.format(contato.getDataNascimento().getTime())+"\n");
        }
    }
}

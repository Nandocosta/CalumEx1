package br.com.nando.jdbc.modelo;

public class Funcionario {
    private long id;
    private String nome,usuario,senha;
    
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

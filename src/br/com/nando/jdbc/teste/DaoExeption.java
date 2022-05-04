package br.com.nando.jdbc.teste;

public class DaoExeption extends RuntimeException {
    public void getException(Exception e){
        System.out.println("erro no scd" + e);
    }
}

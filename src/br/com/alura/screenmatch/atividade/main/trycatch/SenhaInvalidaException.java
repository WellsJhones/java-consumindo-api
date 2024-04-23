package br.com.alura.screenmatch.atividade.main.trycatch;

public class SenhaInvalidaException extends RuntimeException{
    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }
}

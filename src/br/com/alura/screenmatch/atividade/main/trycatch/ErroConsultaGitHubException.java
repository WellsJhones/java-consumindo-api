package br.com.alura.screenmatch.atividade.main.trycatch;

public class ErroConsultaGitHubException extends RuntimeException{
    public ErroConsultaGitHubException(String mensagem){
        System.out.println(mensagem);

    }
}

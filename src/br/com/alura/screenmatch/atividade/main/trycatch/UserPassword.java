package br.com.alura.screenmatch.atividade.main.trycatch;

public class UserPassword {
    private String password;
    public void verifyPass(String key){
       try{

           if(key.length()>=8){
               password = key  ;
               System.out.println("Senha valida");
           }
    }catch(SenhaInvalidaException e){
           throw new SenhaInvalidaException("senha invalida");
       }

       }
}

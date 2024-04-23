package br.com.alura.screenmatch.atividade.main;

import br.com.alura.screenmatch.atividade.main.trycatch.Conversao;
import br.com.alura.screenmatch.atividade.main.trycatch.GithubApi;
import br.com.alura.screenmatch.atividade.main.trycatch.UserPassword;

import java.io.IOException;
import java.util.Scanner;

public class MainAtividade {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Conversao div = new Conversao();
//        div.setNumbers(4,0);
//        div.returnResult();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("type a password with 8 digits");
//
//        String password = scanner.nextLine().toString();
//        UserPassword usuario = new UserPassword();
//        usuario.verifyPass(password);
        Scanner UserScan = new Scanner(System.in);
        GithubApi gitUser = new GithubApi();
        System.out.println("digite o nome de usuario que deseja saber mais:");
        String usuario = UserScan.nextLine();

        gitUser.getInfo(usuario);

    }




}

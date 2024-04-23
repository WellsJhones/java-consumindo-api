package br.com.alura.screenmatch.atividade.main.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String key = "AIzaSyDcEox5M9k4i8UZjcFID5JpqUp2Gxgrl1E";
        System.out.println("Digite um livro para busca: ");
        var busca = scanner.nextLine();
        String nomeDoLivro= busca.replace(" ","+");
        String endereco =  "https://www.googleapis.com/books/v1/volumes?q="+nomeDoLivro+ "&key="+key;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}

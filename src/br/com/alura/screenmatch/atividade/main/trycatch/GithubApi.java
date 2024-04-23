package br.com.alura.screenmatch.atividade.main.trycatch;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GithubApi {
    String parcialUrl = "https://api.github.com/users/";



    public GithubApi() throws IOException, InterruptedException {
    }
    public void getInfo(String user) throws IOException, InterruptedException {
        String completeUrl = String.format("%s%s",parcialUrl,user);
        System.out.println(completeUrl);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(completeUrl)).build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);
    }
}

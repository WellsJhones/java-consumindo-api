package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdv;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = scanner.nextLine();
       String buscaTratada = busca.replace(" ", "+");
        String endereco = "https://www.omdbapi.com/?t="+buscaTratada+"&apikey=f52cf768";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());



        String json = response.body();
        System.out.println(json);


        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();


        TituloOmdv meutituloOmdb = gson.fromJson(json,TituloOmdv.class);
        try {
            Titulo meutitulo = new Titulo(meutituloOmdb);
            System.out.println("Titulo Convertido");
            System.out.println(meutitulo);
        }catch (NumberFormatException e){
            System.out.println("Erro");
            System.out.println(e.getMessage());

        }


        } }

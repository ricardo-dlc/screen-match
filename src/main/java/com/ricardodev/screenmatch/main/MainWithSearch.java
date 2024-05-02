package com.ricardodev.screenmatch.main;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ricardodev.screenmatch.errors.CannotConvertDurationExeption;
import com.ricardodev.screenmatch.models.Title;
import com.ricardodev.screenmatch.models.TitleOmdb;

import io.github.cdimascio.dotenv.Dotenv;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            Dotenv dotenv = Dotenv.load();
            String API_KEY = dotenv.get("API_KEY");
            Scanner scanner = new Scanner(System.in);
            HttpClient client = HttpClient.newHttpClient();
            List<Title> titleList = new ArrayList<>();
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();

            while (true) {
                System.out.print("Enter a movie name (type exit to finish): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                String encodedInput = URLEncoder.encode(input, "UTF-8");
                URI uri = URI.create("http://www.omdbapi.com/?apikey=%s&t=%s".formatted(API_KEY, encodedInput));

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(uri)
                        .build();
                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
                String json = response.body();

                TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);

                Title title = new Title(titleOmdb);
                System.out.println(title);
                titleList.add(title);
            }

            System.out.println(titleList);

            FileWriter writer = new FileWriter("movies.json");
            writer.write(gson.toJson(titleList));
            writer.close();

            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("An error ocurred.");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Verify your input.");
        } catch (CannotConvertDurationExeption e) {
            System.out.println(e.getMessage());
        }
    }
}

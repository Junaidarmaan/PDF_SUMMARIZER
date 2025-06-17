package com.junnu.app.Services;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;

import org.springframework.stereotype.Service;

import com.junnu.app.DTO.Instructions;

@Service
public class AI {
    
    
    
    public String sendhttpRequest(String json) {
        HttpClient client = HttpClient.newHttpClient();
        try {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://t5-transformer-498735909112.asia-south1.run.app/generate"))
                    .header("Content-Type", "application/json")
                    .POST(BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            return response.body();

        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }


public String getSummary(Instructions instruction) {
    try {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(instruction);
        System.out.println("from AI: " + json);
        return sendhttpRequest(json);
    } catch (Exception e) {
        e.printStackTrace();
        return "Error converting instruction to JSON";
    }
}


}

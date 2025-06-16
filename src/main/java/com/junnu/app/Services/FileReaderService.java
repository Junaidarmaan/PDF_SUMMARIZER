package com.junnu.app.Services;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.springframework.stereotype.Service;


@Service
public class FileReaderService {

    public String readFile(File file) {
        AI ai = new AI();
        String text = "";

        Tika tika = new Tika();

        try {
            text = tika.parseToString(file);
            System.out.println("Extracted Text:\n");
            System.out.println(text);
        } catch (IOException | TikaException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        String formatted= text.replaceAll("\\s+", " ").trim();
        String instruction = 
    "Summarize the following text into key bullet points.Make each point short, clear, and non-repetitive.Use '-' at the beginning of each pointthis is the input:";
        return ai.getSummary(formatted,instruction).replace(".", ".\n");
    }
}
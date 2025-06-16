package com.junnu.app.Services;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;

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

        System.out.println(formatted);
        return ai.getSummary(formatted);
    }
}
package com.junnu.app.Services;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.springframework.stereotype.Service;

import com.junnu.app.DTO.Instructions;


@Service
public class FileReaderService {

    public String readFile(File file,Instructions instruction) {
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
        return ai.getSummary(instruction);
    }
}
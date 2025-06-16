package com.junnu.MethodTests;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.junnu.app.Services.FileReaderService;

public class TestFileReader {
    
        FileReaderService reader = new FileReaderService();
        @Test
        public void readFile(){
           String result =  reader.readFile(new File("test.pdf"));
            System.out.println("Result : " + result);
        }
}

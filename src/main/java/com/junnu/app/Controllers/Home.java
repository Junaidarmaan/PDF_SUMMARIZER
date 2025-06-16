package com.junnu.app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.junnu.app.Services.FileReaderService;

import java.io.File;

@RestController
@RequestMapping("/api/files")
public class Home {
    @Autowired
    FileReaderService service;


    @CrossOrigin(origins = "*")
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            String uploadDir = System.getProperty("user.dir") + "/uploads/";
            File directory = new File(uploadDir);

            if (!directory.exists()) {
                directory.mkdirs(); 
            }

            String filePath = uploadDir + file.getOriginalFilename();
            file.transferTo(new File(filePath));
            System.out.println(filePath);
            File uploadedFile = new File(filePath);
            service.readFile(uploadedFile);
            return ResponseEntity.ok("File uploaded successfully! Stored at: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to save file: " + e.getMessage());
        }
    }
}

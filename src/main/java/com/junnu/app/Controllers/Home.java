package com.junnu.app.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/api/files")
public class Home {

    @CrossOrigin(origins = "*")
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // Store in project directory
            String uploadDir = System.getProperty("user.dir") + "/uploads/";
            File directory = new File(uploadDir);

            if (!directory.exists()) {
                directory.mkdirs(); // Create uploads folder if it doesn't exist
            }

            String filePath = uploadDir + file.getOriginalFilename();
            file.transferTo(new File(filePath));

            return ResponseEntity.ok("File uploaded successfully! Stored at: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to save file: " + e.getMessage());
        }
    }
}

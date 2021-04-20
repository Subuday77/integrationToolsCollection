package com.integrationToolsCollection.rest;


import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@CrossOrigin(origins = "*")

public class CollectionController {


    @GetMapping("/getfile")
    public ResponseEntity<?> getFile(@RequestParam(name = "id") int id) throws IOException {
        String fileName = "";
        switch (id) {
            case 1:
                fileName = "_Stress_Test_Pattern v.1.1.0.xlsm";
                File file = new File("files/" + fileName);
                if (file.exists()) {
                    Path path = Paths.get(file.getAbsolutePath());
                    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
                    HttpHeaders headers = new HttpHeaders();
                    headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
                    return ResponseEntity.ok().headers(headers).contentLength(file.length())
                            .contentType(MediaType
                                    .parseMediaType("application/x-msexcel"))
                            .body(resource);
                }
                return new ResponseEntity<String>("File not found", HttpStatus.NOT_FOUND);

            case 2:
                fileName = "Local Server v.3.4.0.exe";
                file = new File("files/" + fileName);
                if (file.exists()) {
                    Path path = Paths.get(file.getAbsolutePath());
                    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
                    HttpHeaders headers = new HttpHeaders();
                    headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
                    return ResponseEntity.ok().headers(headers).contentLength(file.length())
                            .contentType(MediaType
                                    .parseMediaType("application/octet-stream"))
                            .body(resource);
                }
                return new ResponseEntity<String>("File not found", HttpStatus.NOT_FOUND);

            case 3:
                fileName = "Ninite JDK AdoptOpenJDK x64 11 Installer.exe";
                file = new File("files/" + fileName);
                if (file.exists()) {
                    Path path = Paths.get(file.getAbsolutePath());
                    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
                    HttpHeaders headers = new HttpHeaders();
                    headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
                    return ResponseEntity.ok().headers(headers).contentLength(file.length())
                            .contentType(MediaType
                                    .parseMediaType("application/octet-stream"))
                            .body(resource);
                }
                return new ResponseEntity<String>("File not found", HttpStatus.NOT_FOUND);

            case 4:
                fileName = "Table Restart v.2.3.0.exe";
                file = new File("files/" + fileName);
                if (file.exists()) {
                    Path path = Paths.get(file.getAbsolutePath());
                    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
                    HttpHeaders headers = new HttpHeaders();
                    headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
                    return ResponseEntity.ok().headers(headers).contentLength(file.length())
                            .contentType(MediaType
                                    .parseMediaType("application/octet-stream"))
                            .body(resource);
                }
                return new ResponseEntity<String>("File not found", HttpStatus.NOT_FOUND);

            case 5:
                fileName = "tables.list";
                file = new File("files/" + fileName);
                if (file.exists()) {
                    Path path = Paths.get(file.getAbsolutePath());
                    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
                    HttpHeaders headers = new HttpHeaders();
                    headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
                    return ResponseEntity.ok().headers(headers).contentLength(file.length())
                            .contentType(MediaType.TEXT_PLAIN).body(resource);
                }
                return new ResponseEntity<String>("File not found", HttpStatus.NOT_FOUND);

            case 6:
                fileName = "JSON test recommended validations set.pdf";
                file = new File("files/" + fileName);
                if (file.exists()) {
                    Path path = Paths.get(file.getAbsolutePath());
                    ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
                    HttpHeaders headers = new HttpHeaders();
                    headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
                    return ResponseEntity.ok().headers(headers).contentLength(file.length())
                            .contentType(MediaType
                                    .parseMediaType("application/pdf"))
                            .body(resource);
                }
                return new ResponseEntity<String>("File not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

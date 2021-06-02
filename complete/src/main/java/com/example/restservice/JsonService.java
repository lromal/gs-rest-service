package com.example.restservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class JsonService {
    @Value("classpath:data/data.json")
    private Resource resourceFile;

    String getJson() throws IOException {
        return new String(Files.readAllBytes(Paths.get(resourceFile.getFile().getPath())));
    }
}

package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class JsonController {

	@Autowired
	JsonService jsonService;

	@GetMapping(value = "/getJson", produces = "application/json")
	public String getJson() {
		try {
			return jsonService.getJson();
		} catch (IOException e) {
			e.printStackTrace();
			return "{\"error\": \"Can't open json file\"}";
		}
	}
}

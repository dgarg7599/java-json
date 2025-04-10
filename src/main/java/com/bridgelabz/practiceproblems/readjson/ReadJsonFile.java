package com.bridgelabz.practiceproblems.readjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJsonFile {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode jsonNode = mapper.readTree(new File("src/main/java/com/bridgelabz/practiceproblems/readjson/user.json"));

            // Display specific fields
            System.out.println("User name: " + jsonNode.get("name"));
            System.out.println("User email: " + jsonNode.get("email"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

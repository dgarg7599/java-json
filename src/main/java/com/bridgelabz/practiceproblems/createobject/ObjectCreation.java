package com.bridgelabz.practiceproblems.createobject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.File;

public class ObjectCreation {
    public static void main(String[] args) {
        try{
            String[] subjects = {"Maths", "Physics", "English"};
            Student student = new Student("Divyansh Garg", 20, subjects);

            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/java/com/bridgelabz/practiceproblems/createobject/student.json"), student);

            System.out.println("JSON File created successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }

        // Using org.json
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("name", "Alice");
//        jsonObject.put("age", 23);
//        jsonObject.put("subjects", new String[]{"maths", "english", "CS"});
//        System.out.println(jsonObject);

    }
}

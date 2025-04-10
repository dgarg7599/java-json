package com.bridgelabz.practiceproblems.createobject;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

public class ObjectCreation {
    public static void main(String[] args) {
        try{
            String[] subjects = {"Maths", "Physics", "English"};
            Student student = new Student("Divyansh Garg", 20, subjects);

            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);

            System.out.println("JSON String: ");
            System.out.println(jsonString);
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

package com.bridgelabz.practiceproblems.createobject;

import com.fasterxml.jackson.databind.ObjectMapper;

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
    }
}

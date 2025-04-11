package com.bridgelabz.practiceproblems.validatejson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ValidateJsonStructure {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();

            Student student = mapper.readValue(new File("src/main/java/com/bridgelabz/practiceproblems/validatejson/student.json"), Student.class);

            System.out.println("Valid JSON Structure");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Subjects: " + student.getSubjects());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

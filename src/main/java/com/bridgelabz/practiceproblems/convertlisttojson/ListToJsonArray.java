package com.bridgelabz.practiceproblems.convertlisttojson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToJsonArray {
    public static void main(String[] args) {
        try{
            List<Student> students = Arrays.asList(
                    new Student("Divyansh", 20, Arrays.asList("Java", "Spring")),
                    new Student("Krishna", 21, Arrays.asList("Python", "Java"))
            );
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter() .writeValue(new File("src/main/java/com/bridgelabz/practiceproblems/convertlisttojson/student.json"), students);

            // print at console
            String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);
            System.out.println(jsonArray);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

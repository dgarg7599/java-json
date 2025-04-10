package com.bridgelabz.practiceproblems.convertobject;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ObjectToJson {
    public static void main(String[] args) {
        try {
            Car car = new Car("Tesla", "Model X", 2024);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/java/com/bridgelabz/practiceproblems/convertobject/car.json"), car);
            System.out.println("JSON File created successfully.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

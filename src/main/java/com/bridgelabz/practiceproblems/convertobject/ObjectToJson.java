package com.bridgelabz.practiceproblems.convertobject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
    public static void main(String[] args) {
        try {
            Car car = new Car("Tesla", "Model X", 2024);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
            System.out.println("JSON String: ");
            System.out.println(json);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

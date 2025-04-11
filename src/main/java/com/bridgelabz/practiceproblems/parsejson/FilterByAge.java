package com.bridgelabz.practiceproblems.parsejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilterByAge {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File("src/main/java/com/bridgelabz/practiceproblems/parsejson/employees.json"));
            if(root.isArray()){
                List<JsonNode> filteredList = new ArrayList<>();
                for(JsonNode jsonNode: root){
                    int age = jsonNode.get("age").asInt();
                    if(age > 25){
                        filteredList.add(jsonNode);
                    }
                }

                ArrayNode resultArray = mapper.createArrayNode();
                resultArray.addAll(filteredList);

                String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(resultArray);
                System.out.println("Filtered JSON: ");
                System.out.println(result);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

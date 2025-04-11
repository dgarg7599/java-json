package com.bridgelabz.practiceproblems.mergeobjects;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public class MergeJsonObjects {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();

            // read from both files as JsonNode arrays
            ArrayNode array1 = (ArrayNode)mapper.readTree(new File("src/main/java/com/bridgelabz/practiceproblems/mergeobjects/json1.json"));
            ArrayNode array2 = (ArrayNode)mapper.readTree(new File("src/main/java/com/bridgelabz/practiceproblems/mergeobjects/json2.json"));

            // map to store merge objects
            Map<Integer, ObjectNode> mergeObjects = new LinkedHashMap<>();

            // add all objects from array1
            for(JsonNode node: array1){
                int id = node.get("id").asInt();
                mergeObjects.put(id, (ObjectNode)node);
            }

            // merge from array2
            for(JsonNode node: array2){
                int id = node.get("id").asInt();
                if(mergeObjects.containsKey(id)){
                    ObjectNode existing = mergeObjects.get(id);
                    node.fields().forEachRemaining(field->existing.set(field.getKey(), field.getValue()));
                }else{
                    mergeObjects.put(id,(ObjectNode)node);
                }
            }

            // convert map back to arraynode
            ArrayNode finalArray = mapper.createArrayNode();
            mergeObjects.values().forEach(finalArray::add);

            // write to new file
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/java/com/bridgelabz/practiceproblems/mergeobjects/json3.json"), finalArray);
            System.out.println("Json Objects merged  successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

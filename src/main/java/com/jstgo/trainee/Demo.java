package com.jstgo.trainee;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.jstgo.trainee.vo.GsonRoot;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Projects/FirstProject/test.json";   // Specify the path to your JSON file
        String jsonData = new String(Files.readAllBytes(Paths.get(filePath)));

        //Parse JSON from string
        JsonObject jsonObject = new Gson().fromJson(jsonData, JsonObject.class);
        System.out.println("Original JSON: " + jsonObject);


//        System.out.println("Original JSON: " + jsonObject);
        jsonObject.addProperty("Age", "25");
        jsonObject.addProperty("New Line","Added");
        System.out.println("Modified JSON: " + jsonObject);
        try(Writer writerObject = new FileWriter(filePath)){

            Gson gsonObject = new Gson();

            /*
             * Use the toJson method and specify
             * the writer and the object we want to write
             */
            gsonObject.toJson(jsonObject, writerObject);

        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Original JSON: " + jsonObject);


    }
}
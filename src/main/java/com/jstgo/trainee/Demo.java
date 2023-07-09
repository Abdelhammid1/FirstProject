package com.jstgo.trainee;


import com.google.gson.Gson;
import com.jstgo.trainee.vo.GsonRoot;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {


    public static void main(String[] args) {
        // Specify the path to your JSON file
        // Specify the path to your JSON file
        String filePath = "./test.json";

        try {
            // Read the file contents as a string
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));
            var gson = new Gson().fromJson(jsonContent, GsonRoot.class);

            // Print the JSON content
            System.out.println("JSON Content:");
            System.out.println(gson.getSureName());

            // Parse the JSON content if needed
            // ...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

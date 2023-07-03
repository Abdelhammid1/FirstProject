package com.jstgo.trainee;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {


    public static void main(String[] args) {
        // Specify the path to your JSON file
        // Specify the path to your JSON file
        String filePath = "C:/Projects/FirstProject/test.json";

        try {
            // Read the file contents as a string
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));

            // Print the JSON content
            System.out.println("JSON Content:");
            System.out.println(jsonContent);

            // Parse the JSON content if needed
            // ...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

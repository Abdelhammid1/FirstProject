package com.jstgo.trainee;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.jstgo.trainee.vo.Adresses;
import com.jstgo.trainee.vo.GsonRoot;
import org.apache.tomcat.jni.Address;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Projects/FirstProject/test.json";   // Specify the path to your JSON file
        String jsonData = new String(Files.readAllBytes(Paths.get(filePath)));

        //Parse JSON from string
        var jsonObject = new Gson().fromJson(jsonData, GsonRoot.class);
        System.out.println("Original JSON: " + jsonObject);
        jsonObject.setAge(80);
        Adresses address = new Adresses();
        ArrayList x = new ArrayList<>(jsonObject.getAdresses().getEgypt());
        x.add("Ahli");
        address.setEgypt((x));

        jsonObject.setAdresses(address);

    //        System.out.println("Original JSON: " + jsonObject);
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
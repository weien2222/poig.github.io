/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson; 

/**
 *
 * @author poig
 */
public class save_map_file {
    public static void main(String[] args) throws UnsupportedEncodingException, IOException {
        Gson gson = new Gson();
        
        Map<String, Map<String, Double>> outerMap = new HashMap<>();
        
        Map<String, Double> innerMap = new HashMap<>();
        innerMap.put("1", 1.0);
        innerMap.put("2", 2.0);
        
        outerMap.put("key1", innerMap);
        
        String json = gson.toJson(outerMap);
        
        Path path = FileSystems.getDefault().getPath("", "myfile.txt");
        Files.write(path, json.getBytes("UTF-8"), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
        
        json = new String(Files.readAllBytes(path));
        /*
        outerMap = gson.fromJson(json, new TypeToken<Map<String, Map<String, Double>>>(){}.getType());
        
        for (Map.Entry<String, Map<String, Double>> outerEntry: outerMap.entrySet()) {
            System.out.println(outerEntry.getKey());
            innerMap = outerEntry.getValue();
        
            for (Map.Entry<String, Double> innerEntry: innerMap.entrySet()) {
                System.out.println("    " + innerEntry.getKey() + "->" + innerEntry.getValue());
            }

        }*/
    }
}

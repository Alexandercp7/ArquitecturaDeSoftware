package src.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CustomFileReader {
    private String filePath;

    public CustomFileReader(String filePath) { 
        this.filePath = filePath;
    }

    public ArrayList<String> read(){
        ArrayList<String> content = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            
            String line;
            while((line = reader.readLine()) != null){
                content.add(line);
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return content;
    }
}

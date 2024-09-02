package src.model;

import java.util.ArrayList;

public class TextPrinter {
    private ArrayList<String> sentences;

    public TextPrinter(ArrayList<String> sentences){
        this.sentences = sentences;
    }
    
    public void printText(){
        for (String sentence : sentences){
            System.out.println(sentence);
        }
    }
}

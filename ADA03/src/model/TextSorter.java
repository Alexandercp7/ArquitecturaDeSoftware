package src.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TextSorter {
    private ArrayList<String> sentences;

    public TextSorter(ArrayList<String> sentences){
        this.sentences = sentences;
    }

    public ArrayList<String> sortText(){
        Collections.sort(sentences);
        return sentences;
    }
}

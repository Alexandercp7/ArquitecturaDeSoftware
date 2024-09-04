package src.test;
import java.util.ArrayList;

import src.model.CustomFileReader;
import src.model.TextFormatter;
import src.model.TextPrinter;
import src.model.TextSorter;

public class App {
    public static void main(String[] args) {
        ArrayList<String> fileText = new ArrayList<>();
        ArrayList<String> formatedNames = new ArrayList<>();
        ArrayList<String> sortedNames = new ArrayList<>();
        
        CustomFileReader reader = new CustomFileReader();
        fileText = reader.read("ADA03\\src\\n" + //
                        "ombres.txt");
        TextFormatter formatter = new TextFormatter();
        formatedNames = formatter.formatText(fileText);
        TextSorter sorter = new TextSorter();
        sortedNames = sorter.sortText(formatedNames);
        TextPrinter printer = new TextPrinter();
        printer.printText(sortedNames);
    }   
}

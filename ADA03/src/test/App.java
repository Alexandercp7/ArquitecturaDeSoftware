package src.test;
import java.util.ArrayList;

import src.model.CustomFileReader;
import src.model.TextFormatter;
import src.model.TextPrinter;
import src.model.TextSorter;

public class App {
    public static void main(String[] args) {
        ArrayList<String> fileNames = new ArrayList<>();
        ArrayList<String> formatedNames = new ArrayList<>();
        CustomFileReader reader = new CustomFileReader("C:\\Users\\eacan\\Documents\\Pers\\arquitectura-software\\ADA03\\n" + //
                        "ombres.txt");
        fileNames = reader.read();
        TextFormatter formatter = new TextFormatter(fileNames);
        formatedNames = formatter.formatText();
        TextSorter sorter = new TextSorter(formatedNames);
        sorter.sortText();
        TextPrinter printer = new TextPrinter(formatedNames);
        printer.printText();
    }   
}

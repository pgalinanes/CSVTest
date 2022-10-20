package com.CSVTest;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class CSVTest {


    public static void main(String[] args){
    LectorCSV miLector = new LectorCSV();

     miLector.readCSV("./datos/pokemon.csv");

    }


}



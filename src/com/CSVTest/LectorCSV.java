package com.CSVTest;
import java.io.FileReader;
import com.opencsv.CSVReader;



public class LectorCSV {

    public  void readCSV(String nombreArchivo){
        try {

            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila = null;
            while ((fila = csvReader.readNext()) != null) {
                System.out.println(fila[0]
                        + " | " + fila[1]
                        + " | " + fila[2]);
            }
            csvReader.close();

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }

        }
    }

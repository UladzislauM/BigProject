package com.company.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Parse {


    private FileWriter fileWriter = null;


        try {
            fileReader = new FileReader("file.txt");
            fileWriter = new FileWriter("fileCopyReader.txt");

            int a;
        while ((a = fileReader.read()) != -1) {
            fileWriter.write(a);
            System.out.print((char) a);
        }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
        if (fileReader != null) {
            fileReader.close();
        }
        if (fileWriter != null) {
            fileWriter.close();
        }
    }

        public static void pars(String puth){
            FileReader fileReader = null;
        }
}



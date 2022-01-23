package com.patika.software;

import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.*;

//Keep It Simple Stupid : Olabildiğince basit
@Log4j2
public class Kiss {

    public String path = "C:\\patika\\patika.txt";

    //File Writer
    public void utilWriter(){
        //try with resources
        try(BufferedWriter bufferredWriter =
                    new BufferedWriter(new FileWriter(path,true))) {

            String value = JOptionPane.showInputDialog("Lütfen bir şeyler giriniz");
            bufferredWriter.write(value);
            bufferredWriter.flush();

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }


    //File Reader
    public void utilReader() {
        //try with resources
        try(BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(path))) {

            String numberRow = "";
            String sumRow = "";

            while ((numberRow = bufferedReader.readLine()) != null){
                sumRow += numberRow + "\n";
            }
            log.info(sumRow);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
         Kiss kiss = new Kiss();
         kiss.utilReader();
    }

}

package com.patika.tutorials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data //getter - setter - hashcode - toString
//@AllArgsConstructor //Parametreli constructor
@Builder
@Log4j2
public class Log4j2Tutorials {
    private  String adi;
    private  String soyadi;
    private  String numarasi;

    public Log4j2Tutorials(){

    }

    public Log4j2Tutorials(String adi, String soyadi, String numarasi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.numarasi = numarasi;
    }

    //Shift + F6 = refactor(değişkeni her yerde değiştirir)
    public static void main(String[] args) {
        Log4j2Tutorials tutorial = new Log4j2Tutorials();
        System.out.println(tutorial);

        if(tutorial.getAdi() == null){
            log.error("Hata adınızı girmediniz");
        }
        else{
            log.info("Bilgiler girdiniz");
        }
    }

}

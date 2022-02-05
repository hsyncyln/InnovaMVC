package com.patika.tutorials;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class DecoderEncoder {

    //Konsoldan kelime alan method
    public String getScannerMethod(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen şifrelenilecek kelimeyi girin:");
        return keyboard.nextLine();
    }

    //Encoder ==> Sifreleme
    public String getEncoderMethod(String data){
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    //Decoder ==> Sifre cözme
    public void getDecoderMethod(String data){
        String sifreCoz = new String(Base64.getMimeDecoder().decode(data));
        System.out.println(sifreCoz);
    }

    public static void main(String[] args) {
        DecoderEncoder decoderEncoder = new DecoderEncoder();
        String kelime = decoderEncoder.getScannerMethod();
        String sifreliKelime = decoderEncoder.getEncoderMethod(kelime);
        System.out.println("Encoder : " + sifreliKelime);

        decoderEncoder.getDecoderMethod("Decoder : " +sifreliKelime);
    }
}

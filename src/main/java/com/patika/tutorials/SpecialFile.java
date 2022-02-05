package com.patika.tutorials;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SpecialFile {

    public static void specialSecretMethod() {
        try {

            String special = new String(Files.readAllBytes(Paths.get("special.txt")), Charset.forName("utf-8"));
            byte[] resimVideo = Files.readAllBytes(Paths.get("resim.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

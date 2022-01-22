package com.patika.software.a3.composition;

import java.util.ArrayList;

public class CompositionMainTest {
    public static void main(String[] args) {
        //tekil olanla başlanır
        Yazar yazar = new Yazar();
        yazar.setYazarAdi("Antonio");
        yazar.setYazarSoyadi("Robberts");
        yazar.setKitapList(new ArrayList<>());

        System.out.println(yazar);

        Kitap kitap = new Kitap();
        kitap.setKitapAdi("Sınırsız Güç");
        kitap.setKitapFiyati("55");
        kitap.setYazar(yazar);
        kitap.getYazar().getKitapList().add(kitap);

        System.out.println(kitap);
        System.out.println(yazar.getKitapList());

    }
}

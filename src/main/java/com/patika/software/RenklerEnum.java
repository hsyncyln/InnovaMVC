package com.patika.software;

import lombok.Getter;
import lombok.Setter;

//type safe
//önceden tanımlanmıs sabitler
public enum RenklerEnum {
    MAVI,YESIL,TURUNCU
}

enum RenklerEnum2 {
    MAVI(1,"mavi"),YESIL(2,"yesil"),TURUNCU(3,"turuncu");

    @Getter
    private final  int renkId;

    @Getter
    private final String renkAdi;

    RenklerEnum2(int renkId, String renkAdi) {
        this.renkId = renkId;
        this.renkAdi = renkAdi;
    }
}

class Deneme{
    public static void main(String[] args) {
        RenklerEnum renkler = RenklerEnum.MAVI;
        System.out.println(renkler.toString().toLowerCase());

        System.out.println("-------------------");

        RenklerEnum2 cons = RenklerEnum2.MAVI;
        System.out.println(cons.getRenkAdi());
        System.out.println(cons.getRenkId());

    }
}

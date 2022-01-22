package com.patika.software.a3.composition;

import lombok.*;

import java.util.List;

public class Yazar {
    // Yazar olmadan kitap olmaz - Kitap olmadan yazar olmaz
    //1 yazar
    private String yazarAdi;
    private String yazarSoyadi;

    private List<Kitap> kitapList;

    public Yazar() {
    }

    public Yazar(String yazarAdi, String yazarSoyadi) {
        this.yazarAdi = yazarAdi;
        this.yazarSoyadi = yazarSoyadi;
    }

    @Override
    public String toString() {
        return "Yazar{" +
                "yazarAdi='" + yazarAdi + '\'' +
                ", yazarSoyadi='" + yazarSoyadi + '\'' +
                '}';
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getYazarSoyadi() {
        return yazarSoyadi;
    }

    public void setYazarSoyadi(String yazarSoyadi) {
        this.yazarSoyadi = yazarSoyadi;
    }

    public List<Kitap> getKitapList() {
        return kitapList;
    }

    public void setKitapList(List<Kitap> kitapList) {
        this.kitapList = kitapList;
    }
}

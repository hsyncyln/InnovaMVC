package com.patika.software.a3.composition;


public class Kitap {

    private String kitapAdi;
    private String kitapFiyati;

    private Yazar yazar;

    public Kitap() {
    }

    public Kitap(String kitapAdi, String kitapFiyati) {
        //N kitap
        this.kitapAdi = kitapAdi;
        this.kitapFiyati = kitapFiyati;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapFiyati='" + kitapFiyati + '\'' +
                '}';
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getKitapFiyati() {
        return kitapFiyati;
    }

    public void setKitapFiyati(String kitapFiyati) {
        this.kitapFiyati = kitapFiyati;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }
}

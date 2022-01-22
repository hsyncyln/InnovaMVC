package com.patika.tutorials;

import lombok.*;

@Data //getter - setter - hashcode - toString
@NoArgsConstructor //Parametresiz constructor
@AllArgsConstructor //Parametreli constructor
@Builder
public class LombokTutorials {
    //@Getter @Setter
    private  String adi;

    private  String soyadi;
    private  String numarasi;

    public static void main(String[] args) {
        LombokTutorials tutorials = LombokTutorials
                .builder()
                .adi("Hamit")
                .soyadi("Mızrak")
                .numarasi("1234").build();

    }
}

package com.patika.software.a2.aggregation;


import lombok.*;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Araba {
    //Araba motora bağımlı

    @Getter @Setter
    private Motor motor;

    public double getToplamFiyat(){
        this.motor = new Motor();
        double toplam = motor.getMotor() + 2000;
        return toplam;
    }
}

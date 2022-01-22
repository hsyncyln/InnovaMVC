package com.patika.software.a2.aggregation;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@Log4j2
public class Motor {
//Motor arabaya bağımlı değil

    private String motorFiyati;
    private double motorGucu;

    public double getMotor(){
        this.motorGucu = 1200;
        return this.motorGucu;
    }
}

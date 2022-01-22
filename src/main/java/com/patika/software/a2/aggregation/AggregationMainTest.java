package com.patika.software.a2.aggregation;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

public class AggregationMainTest {

    public static void main(String[] args) {

        Araba araba = new Araba();
        System.out.println(araba.getToplamFiyat());


    }
}

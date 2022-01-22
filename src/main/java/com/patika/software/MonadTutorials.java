package com.patika.software;

import lombok.extern.log4j.Log4j2;

import java.util.Locale;

@Log4j2
public class MonadTutorials {
    // Data olsun bu datayı büyük harfler ile döndürsün

    //1.Method
    public static String getValue(String data){
        return data;
    }

    //2.Method
    public static  String getResult(String data){
        return data.toUpperCase(Locale.ROOT);
    }

    //monad: bir metodun çıktısı diğer metodun girdisi
    public static void main(String[] args) {
        String monad = getResult(getValue("Malatya"));
        log.info(monad);
    }
}

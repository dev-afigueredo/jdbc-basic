package utils;

import java.util.Locale;

public class Capilalize {

    public static String CapitalizeString(String string){
        if (string.isEmpty()) return string;
        return string.substring(0,1).toUpperCase(Locale.ROOT) + string.substring(1);
    }

}

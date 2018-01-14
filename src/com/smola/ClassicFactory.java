package com.smola;

import java.util.HashMap;

public class ClassicFactory {

    public static Car getCar(String carType) {
        try {
            HashMap map = getHash();
            String carClass = map.get(carType).toString();
            Class clazz = Class.forName(carClass);
            return (Car) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static HashMap getHash() {
        HashMap map = new HashMap();
        map.put("Ford", "com.smola.Ford");
        map.put("Fiat", "com.smola.Fiat");
        return map;
    }
}

package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> hashMap = new HashMap<>();
        hashMap.put("person", new Person("John", "Smith"));
        hashMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        hashMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        hashMap.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));
        return hashMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return map.get(key);
    }

    public static void printMapValues(Map<String, Person> map) {
        map.forEach( (x, y) -> y.getDetails() );
    }
}

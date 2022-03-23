package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       TreeSet<City> city = new TreeSet<City>();
        city.add(new City(11208, "Brooklyn", 101313));
        city.add(new City(91331, "Pacoima", 105458));
        city.add(new City(94565, "Pittsburg", 97671));
        city.add(new City(10467, "Bronx", 101255));
        city.add(new City(79936, "El paso", 111620));

        TreeSet<City> newCity = new TreeSet<City>();
        for (City elem : city) {
            if (elem.getCode() % 2 > 0) {
                newCity.add(elem);
                System.out.println(elem);
            }
        }
    }
}


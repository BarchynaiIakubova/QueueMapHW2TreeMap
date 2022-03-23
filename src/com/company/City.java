package com.company;

import java.util.Comparator;
import java.util.Objects;

public class City implements Comparable<City> {
    private int code;
    private String name;
    private int population;

    public City() {

    }
    public City(int code, String name, int population) {
        this.code = code;
        this.name = name;
        this.population = population;
    }
    @Override
    public int compareTo(City o) {
        return o.code - this.code ;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return code == city.code && Objects.equals(name, city.name) && population == city.population;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, population);
    }

    @Override
    public String toString() {
        return "Code = " + code + ", name = " + name + ", population = " + population;
    }


}

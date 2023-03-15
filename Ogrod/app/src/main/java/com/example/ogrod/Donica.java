package com.example.ogrod;

public class Donica {

    public static boolean free = true;
    public static Roslina plant;

    public static void plant(Nasiono seed)
    {
        plant = seed.plant;
        free = false;
    }

    public static void harvest()
    {

    }

    public static void eradicate()
    {

    }
    public static void main(String[] args) {

    }
}

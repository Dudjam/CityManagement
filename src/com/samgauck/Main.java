package com.samgauck;

import com.samgauck.DateManagement.SimpleDate;

import java.util.Scanner;

public class Main {

    private static long millis;
    private static Scanner s = new Scanner(System.in);
    private static String input;
    private static City city;
    private static SimpleDate date = new SimpleDate(1,1,2020);

    public static SimpleDate getDate() {
        return date;
    }

    public static void main(String[] args) {
        start();
        System.out.println(city.listCitizens());
    }
    private static void start() {
        date = new SimpleDate(1,1,2020); //Sets game date to 1/1/2020
        System.out.println("Sam Gauck Presents:");
        millis = System.currentTimeMillis();
        while (true){
            if (!(System.currentTimeMillis() - millis < 1000)) break; //one second wait
        }
        for (int i = 0; i < 50; i++){
            System.out.println();
        }
        System.out.println("CityManagement");
        System.out.println("Version 1.0");
        millis = System.currentTimeMillis();
        while (true){
            if (!(System.currentTimeMillis() - millis < 1000)) break; //one second wait
        }
        for (int i = 0; i < 50; i++){
            System.out.println();
        }
        System.out.print("Please enter a name for your city: ");
        input = s.next();
        city = new City(input); //creates new city with your name
        System.out.println("Would you like to name your citizens? (Y/N)");
        input = s.nextLine();
        if (input.equalsIgnoreCase("y")) {
            //TODO: Name citizens
        }else {
            //TODO: random name citizens
        }
    }
}

package com.entertainment.client;/*
 * This is the application main class, i.e. the class definition with the main method
 * The main method is the starting point for the application.
 *
 * Purpose: create a few instances of Television and give them a test-drive.
 */

import com.entertainment.Television;

class TelevisionClient {
    // at run time the application starts here.
    public static void main(String[] args) {
        // create an instance of Television and set properties
        Television tv1 = new Television("Samsung", 20);
        System.out.println(Television.getInstanceCount() + " instances.");
        tv1.setBrand("Samsung");
        tv1.setVolume(20);

        // create another instance of Television and set different properties
        Television tv2 = new Television("Sony", 80);
        System.out.println(Television.getInstanceCount() + " instances.");
        tv2.setBrand("LG");
        tv2.setVolume(Television.MIN_VOLUME);
        // create a third instance of Television but do not set the properties
        /*
        Television tv3 = new Television();
        */
        // recreate the third instance of Television set the properties
        Television tv3 = new Television();
        System.out.println(Television.getInstanceCount() + " instances.");
        tv3.setBrand("Sony");
        tv3.setVolume(Television.MAX_VOLUME);

        // try new constructor with 1 arg
        Television tv4 = new Television("LG");
        System.out.println(Television.getInstanceCount() + " instances.");

        // call the turn on and off method and populate with the referenced variable.
        tv1.turnOn();
        //tv1.volumeQuery();
        System.out.println(tv1);
        tv1.turnOff();

        tv2.turnOn();
        //tv2.volumeQuery();
        System.out.println(tv2);
        tv2.turnOff();

        tv3.turnOn();
        //tv3.volumeQuery();
        System.out.println(tv3);
        tv3.turnOff();

        tv4.turnOn();
        System.out.println(tv4);
        tv4.turnOff();


    }
}
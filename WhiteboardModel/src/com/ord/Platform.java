package com.ord;

public enum Platform {
    DROPPED         ("Dropped"),
    PLACED          ("Placed"),
    THROWN          ("Thrown"),
    LAUNCHED        ("Launched"),
    FIRED           ("Fired"),
     ;

     private final String display;

    Platform(String display) {
        this.display = display;
        System.out.println("ctor fired");
    }


    public String display() {
        return display;
    }

     @Override
     public String toString() {
         return display();
     }
 }

package com.entertainment;

public class Television {
    // static constant properties for volume
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    // attributes or properties - "instance variables" or "fields" in Java
    private String brand; // string value for the name of the brand
    private int volume;   // int value for the level of the volume
    private boolean isMuted;
    private int oldVolume;

    // constructors
    public Television() {
        //no arg ctor
        instanceCount++;
    }
    public Television(String brand) {
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    // FINISH THIS pg 62
    //public Boolean isMuted();

    // functions or operations - "methods" in Java



    void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("Your " + brand + " is now turning on, please wait!");
    }

    void turnOff(){
        System.out.println("Your " + brand + " is turning off, I hope you enjoyed your program!");
    }
    void volumeQuery(){
        System.out.println("The volume level on your " + brand + " is currently: " + volume + ".");
    }
    // Accessor Methods the generated getters and setters
    public String getBrand() {
        return brand;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }

    public void setBrand(String brand) {
        if (brand.equals("Samsung") ||
            brand.equals("LG")      ||
            brand.equals("Sony")    ||
            brand.equals("Toshiba")) {
            this.brand = brand;
        }
        else {
            System.out.println("The brand: " + brand +
                    " is not a valid input. Please select a; Sony, Insignia, or Samsung" );
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        }
        else {
            this.volume = volume;
        }

    }
    private boolean verifyInternetConnection() {
        return true; //the ollle fakeout
    }
    // toString() method for the diagnostics of the instanced object.
    public String toString() {
        String volumeString = String.valueOf(getVolume());

        return "brand= " + getBrand() + ", volume= " + getVolume();
    }
}

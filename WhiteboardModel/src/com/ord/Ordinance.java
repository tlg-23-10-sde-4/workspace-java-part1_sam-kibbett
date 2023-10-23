package com.ord;

public class Ordinance {
    // Static Variables
    public static final int MIN_WAITTIME = 0;
    public static final int MAX_WAITTIME = 60;
    // Variables
    public String type;
    public int payload;
    public String fuze;
    public String outcome;
    private Platform platform;
    private Integer waittime;

    // Constructors
     public Ordinance() {
      //empty
     }

     public Ordinance(Platform platform) {
         setPlatform(platform);
     }

     public Ordinance(String type) {
         setType(type);
     }

     public Ordinance(String type, int payload) {
         this(type);
         setPayload(payload);
     }
     public Ordinance(String type, String fuze) {
         this(type);
         setFuze(fuze);
     }
     public Ordinance(String type, int payload, String fuze) {
         this(type, payload);
         setFuze(fuze);
     }
     public Ordinance(String type, int payload, String fuze, String outcome) {
         this(type, payload, fuze);
         setOutcome(outcome);
     }

     public Ordinance(String type, int payload, String fuze, String outcome, Platform platform, Integer waittime) {
         this(type, payload, fuze, outcome);
         setPlatform(platform);
         setWaittime(waittime);
     }


    // Methods
    public void firstapproach() {
        System.out.println("Intel: " + type + " found in ground");
        System.out.println(" Payload estimation of " + payload + "lbs Comp B");
    }

    public void outcome() {
        System.out.println(fuze);
        System.out.println(outcome);
    }

    // accessor methods
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public String getFuze() {
        return fuze;
    }

    public void setFuze(String fuze) {
        this.fuze = fuze;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Integer getWaittime() {
        return waittime;
    }

    public void setWaittime(Integer waittime) {
        if (MIN_WAITTIME > waittime || MAX_WAITTIME < waittime) {
            this.waittime = waittime;
            System.out.println("No waittime");
        }
        else
            this.waittime = waittime;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String toString() {
        return "UXO: type=" + getType() + ", fuzew type=" + getFuze() + " Platform: " + getPlatform();
    }
}

package com.tick;

/*
 * Class definition to model the workings of an alarm clock.
 * This is called a "Business Class" or "system class" as it contains
 * Business things (attributes and methods)
 * This class definition does not have a main mehtod - most dont.
 */
class AlarmClock {

    // shared (static) custom variables
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // instance variable
    private int snoozeInterval = 999999;

    public AlarmClock() {
        // no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);
    }

    void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }


    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Error invalid snooze interval: " + snoozeInterval +
                    " Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL);

        }
    }

    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }

}
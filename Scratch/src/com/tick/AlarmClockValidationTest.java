package com.tick;

class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);      // should "stick"
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0);
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());
    }
}
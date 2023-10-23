package com.tick;

class AlarmClockClient {

    // main>enter shortcut
     public static void main(String[] args) {
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);

        AlarmClock clock3 = new AlarmClock();
        clock3.setSnoozeInterval(19);

        AlarmClock clock4 = new AlarmClock();


        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

         System.out.println();

         System.out.println(clock1.toString());
         System.out.println(clock2.toString());
         System.out.println(clock3.toString());
     }
}
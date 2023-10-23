package com.ord.client;

import com.ord.Ordinance;
import com.ord.Platform;

class OrdinanceClient {

    public static void main(String[] args) {
        Ordinance uxo1 = new Ordinance();
        uxo1.setType("Big Ass Bomb");
        uxo1.setPayload(2);
        uxo1.setFuze("Spinny thing as a fuze, oh look its still spinning");
        uxo1.setOutcome("You are dead sorry");
        uxo1.setPlatform(Platform.DROPPED);

        Ordinance uxo2 = new Ordinance("ACME", 1447, "Push Button", "Beep Beep", Platform.PLACED, 5);
        System.out.println(uxo2);

        System.out.println();

        uxo1.firstapproach();
        uxo1.outcome();
        System.out.println();
        uxo2.firstapproach();
        uxo2.outcome();
    }
}

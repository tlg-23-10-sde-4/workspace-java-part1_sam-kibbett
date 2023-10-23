package com.ord.client;

import com.ord.Ordinance;
import com.ord.Platform;

class OrdValidation {

    public static void main(String[] args) {
        Ordinance Test1 = new Ordinance("Bomb", 1, "Point Detonating", "You died", Platform.PLACED, 500);
        System.out.println(Test1);

        Ordinance Test2 = new Ordinance("ultra", 4, "boomboom", "sheesh", Platform.FIRED, 5);
        System.out.println(Test2);
    }

}
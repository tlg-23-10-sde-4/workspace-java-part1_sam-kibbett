package com.ord.client;

import com.ord.Ordinance;
import com.ord.Platform;

class OrdinanceClientArgs {

    // $ java OrdinanceClientArgs <type> <fuze>
    public static void main(String[] args) {
        if (args.length > 1) {
            String usage = "Usage; java OrdinanceClientArgs <platform>";
            String example = "Example: java OrdinanceClientArgs Dropped";
            String note = "Note: Supported platforms are Dropped, Placed, Thrown, Launched, Fired ";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }

        Platform platform = Platform.valueOf(args[0].toUpperCase());
        Ordinance uxoArgTest = new Ordinance(platform);
        System.out.println(uxoArgTest);

        System.out.println("You provided " + args.length + " args");
    }
}
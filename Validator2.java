//// Asami, Brian - CS-170-01 - Lab 2
package Conversion;

import java.util.Scanner;

public class Validator2 {
    Validator2() { }

    public static Boolean validateDouble(Scanner sc) {
        if (!sc.hasNext()) { return false; }

        while (sc.hasNext()) {
            double num = Double.parseDouble(sc.next());
            if (num < 0 ) { return false; }
        }
        return true;
    }

    public static Boolean inRange(Scanner sc, double min, double max) {
         double num = Double.parseDouble(sc.next());

         if (num >= min && num <= max) { return true; }
         return false;
    }
}

// Asami, Brian - CS-170-01 - Lab 2
//Operation Class for converting temperature from Lab 1 with validator
package Conversion;

import javax.swing.*;
import java.util.Scanner;

public class TempConvertWithValidate {
    TempConvertWithValidate() {

    }

    public String FahrenheitToCelsius(String fahrenheit) {
        Scanner sc = new Scanner(fahrenheit);
        double min = -100;
        double max = 200;

        if (Validator2.inRange(sc, min, max)) {
            return String.valueOf(Math.floor(((Double.parseDouble(fahrenheit) - 32) * 5 / 9) * 1000) / 1000.0);
            //Calculation formula to convert fahrenheit to celsius
        } else {
            return null;
            //Return -500 when the given temperature is not within the boundaries
        }
    }

    public String CelsiusToFahrenheit(String celsius) {
        Scanner sc = new Scanner(celsius);
        double min = -100;
        double max = 200;
        //min and max -> range of allowed temperature inputs

        if (Validator2.inRange(sc, min, max)) {
            return String.valueOf(Math.floor((((Double.parseDouble(celsius) * 9) / 5) + 32) * 1000) / 1000.0);
            //Calculation formula to convert celsius to fahrenheit
        } else {
            return null;
            //Return -500 when the given temperature is not within the boundaries
        }
    }

    private static int displayMenu() {
        //Displaying the menu
        return Integer.parseInt(JOptionPane.showInputDialog(" ====Converter==== \n1.<Fahrenheit to Celsius> \n2.<Celsius to Fahrenheit> \n3.<Done> \nSelect Option :"));
        //GUI Options for Dialog Box
    }

    public void start() {
        int choice;
        TempConvertWithValidate t = new TempConvertWithValidate();

        do {
            choice = displayMenu();

            //Display Menu to give choices
            switch (choice) {
                case 1: {
                    String cel;
                    String fahrenheit, celsius;
                    //Declaring the variables used

                    fahrenheit = JOptionPane.showInputDialog(" Enter the Temperature in Fahrenheit(F):");
                    //Asking user to input Fahrenheit Value
                    celsius = t.FahrenheitToCelsius(fahrenheit);
                    //Method to calculate fahrenheit

                    if (celsius != null) {
                        cel = String.valueOf(celsius) + "C";
                        //Format fahrenheit value

                        JOptionPane.showMessageDialog(null, "The Temperature in Celsius is " + cel);
                        //Display Temperature through Dialog Box
                    } else {
                        JOptionPane.showMessageDialog(null, "Insert temperature from -100 to 200");
                        //Error message if the user inserts temperature not between -100 and 200
                    }
                    continue;
                }
                case 2: {
                    String fahrenheit, celsius;
                    //Declaring the variables used

                    celsius = JOptionPane.showInputDialog(" Enter the Temperature in Celsius(C):");
                    //Ask user to input Celsius Value
                    fahrenheit = t.CelsiusToFahrenheit(celsius);
                    //Method to calculate fahrenheit

                    if (fahrenheit != null) {
                        fahrenheit = fahrenheit + "F";
                        //Format fahrenheit value
                        JOptionPane.showMessageDialog(null, " The Temperature in Fahrenheit is " + fahrenheit);
                        //Display converted Fahrenheit value
                    } else {
                        JOptionPane.showMessageDialog(null, "Insert temperature from -100 to 200");
                        //Error message if the user inserts temperature not between -100 and 200
                    }
                    continue;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null, "==Exit Converter==");
                    break;
                    //Exit Prompt message
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Enter 1-3");
                    continue;
                    //Error message in case user doesn't enter valid option
                }
            }
        } while (choice != 3);
        //Continue to run
    }
}

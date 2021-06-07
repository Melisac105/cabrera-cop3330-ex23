package util;

import java.util.Scanner;

public class DecisionTree {
    static Scanner input = new Scanner(System.in);

    static public String tree() {
        System.out.print("Is the car silent when you turn the key? ");
        String answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String batteryTerminals = input.nextLine();
            if (batteryTerminals.equalsIgnoreCase("y")) {
                System.out.print("Clean terminals and try starting again");
            } else if (batteryTerminals.equalsIgnoreCase("n")) {
                System.out.print("Replace cables and try again");
            }
        } else if (answer1.equalsIgnoreCase("n")) {
            System.out.print("Does the car make a slicking noise? ");
            String slickingNoise = input.nextLine();
            if (slickingNoise.equalsIgnoreCase("y")) {
                System.out.print("Replace the battery");
            } else if (slickingNoise.equalsIgnoreCase("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                String crankUp = input.nextLine();
                if (crankUp.equalsIgnoreCase("y")) {
                    System.out.println("Check spark plug connections");
                } else if (crankUp.equalsIgnoreCase("n")) {
                    System.out.print("Does the engine start and die? ");
                    String engineStart = input.nextLine();
                    if (engineStart.equalsIgnoreCase("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        String fuelInjection = input.nextLine();
                        if (fuelInjection.equalsIgnoreCase("y")) {
                            System.out.print("Get it in for service");
                        } else if (fuelInjection.equalsIgnoreCase("n")) {
                            System.out.print("Check to ensure the choke is opening and closing");
                        }
                    } else if (engineStart.equalsIgnoreCase("n")) {
                        System.out.print("This should not be possible");
                    }
                }
            }
        }
        return "";
    }
}
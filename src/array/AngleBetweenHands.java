package array;

import java.util.Scanner;

public class AngleBetweenHands {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the hour and minute from the user.
        System.out.print("Enter the hour: ");
        int hour = scanner.nextInt();

        System.out.print("Enter the minute: ");
        int minute = scanner.nextInt();

        // Calculate the angle between the hour and minute hands.
        double hourAngle = (hour * 30) + (minute * 0.5);
        double minuteAngle = minute * 6;
        double angle = Math.abs(hourAngle - minuteAngle);

        // Display the angle.
        System.out.println("The angle between the hour and minute hands is " + angle + " degrees.");

//        Alt method : Find no of minutes completed after 12.
//        Angle for HH is minutes*0.5 , angle for MH is minutes*6. Find their diff
        int totalMinutes = minute + hour * 60;
        double HH = totalMinutes * 0.5;
        double MH = minute * 6;
        double angle2 = Math.abs(MH - HH) % 360;
        System.out.println("Angle is: " + angle2);
    }
}

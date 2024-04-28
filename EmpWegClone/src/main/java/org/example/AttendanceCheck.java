package org.example;

import java.util.Random;

public class AttendanceCheck {
    public static void main(String[] args){
        Random random = new Random();

        int attendance = random.nextInt(2);

        if (attendance == 1)
        {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent!");
        }
    }
}

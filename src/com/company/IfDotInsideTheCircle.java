package com.company;

import java.util.Scanner;

public class IfDotInsideTheCircle {

    public static void main(String[] args) {

        /**
         * There is a circle centered at the origin and radius 4. User
         * enters the coordinates of the point x and y from the keyboard. Write a program that
         * will determine whether this point lies inside the circle or not
         */

        int r = 4;

        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input x");
        x = sc.nextInt();
        System.out.println("Input y");
        y = sc.nextInt();

//        if (Math.sqrt(x) + Math.sqrt(y) <= Math.sqrt(r))
        if (x * x + y * y <= r * r) {
            System.out.println("The dot is inside the circle");
        } else System.out.println("The dot is outside the circle");
    }
}

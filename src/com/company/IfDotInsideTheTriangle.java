package com.company;

import java.util.Scanner;

public class IfDotInsideTheTriangle {
    public static void main(String[] args) {

/***
 * A triangle is given with the coordinates of the vertices A(0,0), B(4,4), C(6,1). User
 * enters the coordinates of the point x and y from the keyboard. Write a program that
 * will determine whether this point lies inside the triangle or not
 */
        int[] a = new int[]{0, 0};
        int[] b = new int[]{4, 4};
        int[] c = new int[]{6, 1};

        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input x");
        x = sc.nextInt();
        System.out.println("Input y");
        y = sc.nextInt();

        int firstExpression = ((a[0] - x) * (b[1] - a[1]) - (b[0] - a[0]) * (a[1] - y));
        int secondExpression = ((b[0] - x) * (c[1] - b[1]) - (c[0] - b[0]) * (b[1] - y));
        int thirdExpression = ((c[0] - x) * (a[1] - c[1]) - (a[0] - c[0]) * (c[1] - y));

        if ((firstExpression >= 0 && secondExpression >= 0 && thirdExpression >= 0)
                || (firstExpression <= 0 && secondExpression <= 0 && thirdExpression <= 0)) {
            System.out.println("The dot is inside the triangle");
        } else System.out.println("The dot is outside the triangle");

    }
}
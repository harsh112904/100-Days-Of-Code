// Q4 (User Inputs, Operations & Output)
/*Write a program to calculate the area and circumference of a circle given its radius.

Input 1:
7
Output 1:
Area=153.94, Circumference=43.96
Input 2:
3
Output 2:
Area=28.27, Circumference=18.85*/

import java.util.*;
public class Q2_day2{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        double radius=sc.nextDouble();

        double area;
        double circumference;
        area=3.14*radius*radius;
        circumference=2*3.14*radius;
        System.out.println("Area of the circle is"+ area);
        System.out.println("Circumference of the circle is"+ circumference);

    }
}

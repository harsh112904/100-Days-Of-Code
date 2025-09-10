// Write a program to input a year and check whether it is a leap year or not using conditional statements.
/* 
Input 1:
2020
Output 1:
Leap year
Input 2:
1900
Output 2:
Not a leap year
Input 3:
2000
Output 3:
Leap year
Year is a leap year if divisible by 4 but not 100, except if divisible by 400.
*/

import java.util.*;
public class Q1_day7{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if (year%4==0){
            System.out.println("year is leap");

        }
        else if(year%100==0&&year%400==0){
            System.out.println("year is leap");

        } 
        else {
            System.out.println("year is not leap");

    }
}
}
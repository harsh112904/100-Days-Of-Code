// Write a program to input three numbers and find the largest among them using if–else.
/* 
Input 1:
3 7 5
Output 1:
Largest is 7
Input 2:
-1 -5 0
Output 2:
Largest is 0
*/

import java.util.*;
public class Q2_day8{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("Largest is"+" "+a);
        }
        else if(b>a&&b>c){
            System.out.println("Largest is"+" "+b);
        }
        else if(c>a&&c>b){
            System.out.println("Largest is"+" "+c);
        }
    }
}
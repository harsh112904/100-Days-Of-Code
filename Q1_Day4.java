// Write a program to swap two numbers without using a third variable.
/* 
Input 1:
10 20
Output 1:
After swap: 20 10
Input 2:
7 14
Output 2:
After swap: 14 7
*/

import java.util.*;
public class Q1_Day4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         
        a=a+b; //10+20=30
        b=a-b; // 30-20=10
        a=a-b; // 30-10=20

        System.out.println(a);
        System.out.println(b);
    
    }
}
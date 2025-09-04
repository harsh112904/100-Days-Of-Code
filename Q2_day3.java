// Write a program to swap two numbers using a third variable.
/* 
Input 1:
3 5
Output 1:
After swap: 5 3
Input 2:
-1 1
Output 2:
After swap: 1 -1
 */

 import java.util.*;
 public class Q2_day3{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);

    }
 }
// Write a program to find and display the sum of the first n natural numbers.
/* 
Input 1:
5
Output 1:
Sum=15
Input 2:
10
Output 2:
Sum=55
*/

import java.util.*;
public class Q2_Day4{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a natural number to print sum upto the number");
        int n=sc.nextInt();
        int sum=0;
        int i; // for loop initialization

        for(i=1;i<=n;i++){
            sum= sum+i; // store the sum upto n 

        }
        System.out.println(sum);

    }
}
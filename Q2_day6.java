// Write a program to input an integer and check whether it is positive, negative or zero using nested if–else.
/* 
Input 1:
-5
Output 1:
Negative
Input 2:
0
Output 2:
Zero
Input 3:
10
Output 3:
Positive 
*/
import java.util.*;
public class Q2_day6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n>0){
        System.out.println("positive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
        else {
        System.out.println("Zero");

          }  }
}
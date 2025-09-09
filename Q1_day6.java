// Write a program to input an integer and check whether it is even or odd using if–else.
/* 
Input 1:
7
Output 1:
7 is odd
Input 2:
12
Output 2:
12 is even
*/
import java.util.*;
public class Q1_day6{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the integer");
        int number =sc.nextInt();
        if(number%2==0){
            System.out.println(number+" "+"is even");

        }
        else {
            System.out.println(number+" "+"is odd");
        }
        
    }
}
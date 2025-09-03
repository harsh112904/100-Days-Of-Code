// Write a program to input two numbers and display their sum.
/* 
Input 1:
3 4
Output 1:
Sum = 7
Input 2:
-1 20
Output 2:
Sum = 19;
*/
import java.util.*;
public class Q1_Day1{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        
         sum=a+b;
        System.out.println(sum);
    } 

}
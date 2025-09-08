// Write a program to calculate simple and compound interest for given principal, rate, and time.
/* 
Input 1:
1000 5 2
Output 1:
Simple Interest=100, Compound Interest=102.5
Input 2:
5000 7 3
Output 2:
Simple Interest=1050, Compound Interest=1125.76
*/
import java.util.*;
public class Q1_day5{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int principal =sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();

        double simpleInterest=(principal*rate*time)/100;
        double compoundInterest= principal- (principal*Math.pow(1+rate/100,time));
        System.out.println("simpleInterest is:"+ simpleInterest);
      System.out.println("compoundInterest is :"+ compoundInterest);
    }}
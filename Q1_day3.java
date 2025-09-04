//Write a program to convert temperature from Celsius to Fahrenheit.
/* 
Input 1:
0
Output 1:
Fahrenheit=32
Input 2:
100
Output 2:
Fahrenheit=212
*/
import java.util.*;
public class Q1_day3{
    public static void main(String args[]){
        System.out.println("Enter the temperature in celsius");
        Scanner sc=new Scanner(System.in);
        double temperature=sc.nextDouble();

        double Fahrenheit=(temperature*1.8)+32;
        System.out.println("Temperature in Fahrenheit is"+Fahrenheit);


    }
}
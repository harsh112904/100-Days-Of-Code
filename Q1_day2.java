
//Q3 (User Inputs, Operations & Output)
/*  
Write a program to calculate the area and perimeter of a rectangle given its length and breadth.

Input 1:
5 10
Output 1:
Area=50, Perimeter=30
Input 2:
3 7
Output 2:
Area=21, Perimeter=20 
*/
import java.util.*;
public class Q1_day2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble();
        double breadth= sc.nextDouble();
        double area;
        double perimeter;

        area=length*breadth;
        perimeter= 2*(length*breadth);

        System.out.println("Area of the rectangle is" + area);
        System.out.println("Perimeter of the rectangle is "+ perimeter);

    }
}
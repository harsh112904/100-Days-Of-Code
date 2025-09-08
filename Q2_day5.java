// Write a program to input time in seconds and convert it to hours:minutes:seconds format.
/* 
Input 1:
3661
Output 1:
1:1:1
Input 2:
7322
Output 2:
2:2:2
*/
import java.util.*;
public class Q2_day5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time in seconds");
        int time=sc.nextInt();
        int hours=time/3600;
        time=time%3600;
        int minutes=time/60;
        time=time%60;
        int seconds=time;
        System.out.println(hours +":"+time+":"+seconds);



}}
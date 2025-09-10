// Write a program to input a character and check whether it is a vowel or consonant using if–else.
/* 
Input 1:
a
Output 1:
Vowel
Input 2:
b
Output 2:
Consonant
*/

import java.util.*;
public class Q2_day7{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        
        char ch1='a';
        char ch2='e';
        char ch3='i';
        char ch4='o';
        char ch5='u';

        if (ch==ch1||ch==ch2||ch==ch3||ch==ch4||ch==ch5){
            System.out.println("vowel");

        }
        else{
            System.out.println("constant");
        }




    }
}
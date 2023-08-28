/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author E-LAB-PC37
 */
import java.util.Scanner;
public class Ternary {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first variable");
        int a= sc.nextInt();
        System.out.println("Enter the second variable:");
        int b=sc.nextInt();
        int exp=a>b?a:b;
        ///Assignment operator:-
        
        System.out.println("largest number is:"+(exp));
        a=a+b;
        System.out.println("The addition of 2 numbers:"+(a));
        b+=a;
        System.out.println("Another sum:"+ (b));
               
                
    }
    
}

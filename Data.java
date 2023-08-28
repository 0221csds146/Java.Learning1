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
public class Data {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a=obj.nextInt();
        System.out.println("Enter second Number: ");
        int b=obj.nextInt();
        int add=a+b;
        System.out.println("Addition: "+add);
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division1: "+(a/b));
        System.out.println("Remainder: "+(a%b));
              
                
    }
    
}

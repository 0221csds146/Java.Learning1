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
public class Operator2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        
        System.out.println("Pre -increment value:"+ ++a);
        System.out.println("Pre -decrement value:"+ --a);
        System.out.println("Enter first number:");
        int b=sc.nextInt();
        System.out.println("Post -increment value:"+ b++);
        System.out.println("Post -decrement value:"+ b--);
                
                
        
    }
    
}

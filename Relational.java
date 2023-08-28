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
public class Relational {
    public static void main(String[] args){
        Scanner lele = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a= lele.nextInt();
        System.out.println("Enter numbers of shift:");
        int b=lele.nextInt();
        System.out.println("Equality:" + (a==b)); 
        System.out.println("NOT Equal:" + (a!=b));
        System.out.println("Greater:" + (a>b));
        System.out.println("less:" + (a<b));
    }
        
    
    
}

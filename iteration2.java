/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author E-LAB-PC37
 */
import java.util.*;
public class iteration2 {
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        int rev=0;
        while(a!=0){
            int rem = a%10;
            rev=(rev*10)+rem;
            a=a/10;
            
                    
        }
        System.out.print(rev);
        
     }    
    
}

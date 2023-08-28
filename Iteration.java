/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author E-LAB-PC37
 */
import java.util.*;
public class Iteration {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        //System.out.println("Enter Sceond number:");
        //int b=sc.nextInt();
        int c= 0;
        while(a>0){
            a=a/10;
            ++c;
                    
        }
        System.out.print(c);
        
    }
            
    
}

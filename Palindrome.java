/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author E-LAB-PC37
 */
import java.util.*;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name =sc.nextLine();
        String pal= "";
        int n=name.length();
        int i;
        name=name.toLowerCase();
        for( i=(n-1);i>=0;i--){    
            pal=pal+name.charAt(i);    
        }
        if (name.equals(pal)){
            System.out.println("Palindrome");    
        }
        else{
            System.out.println("Palindrome not");
        }
        System.out.println(pal);    
    } 
}

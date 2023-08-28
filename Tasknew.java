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
public class Tasknew {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name =sc.nextLine();
        int vow=0;
        int const1=0;
        int n=name.length();
        int i;
        name=name.toLowerCase();
        for(i=0; i<n; i++){
            char ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow++;
                
            }
            else{
                const1++;
            }
            
        
            
        }
        System.out.println(vow);
        System.out.println(const1);
    
    } 
}
     
    

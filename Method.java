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
import java.lang.*;
public class Method {
    Scanner sc=new Scanner(System.in);
    int num1=5;
    int num2=18;
    public  int add(){
        int sum =num1+num2;
        return sum;
    }
    public static void main(String[] args){
        Method plus=new Method();
        System.out.println(plus.add());
        
    }
            
    
    
}

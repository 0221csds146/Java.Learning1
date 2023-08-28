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
public class Operation {
    int num1,num2;
    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        num1=sc.nextInt();
        System.out.println("Enter second number");
        num2=sc.nextInt();
        
    }
    public int add1(){
        return (num1+num2);
    }
    public int mul(){
        return (num1*num2);
    }
    
    
    public static void main(String[] args){
        
        Operation add=new Operation();
        add.getdata();
        System.out.println("Addition:"+ add.add1());
        System.out.println("Multiplicstion: "+add.mul());
    }
    
}

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
public class Operator3 {
    public static void main(String[] args){
        Scanner lele = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a= lele.nextInt();
        System.out.println("Enter numbers of shift:");
        int b=lele.nextInt();
        System.out.println("Left shift:" + (a<<b));
        System.out.println("Right shift:" + (a>>b));        
    }
    
    
}

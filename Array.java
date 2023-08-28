
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany                    .mavenproject2;

/**
 *
 * @author E-LAB-PC37
 */
// write a java progarms the count array element duplicate;
import java.util.*;
public class Array{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = arr[0];
        int i;
       
        System.out.println("Enter a vlaue of the array:");
        for (i=0; i<n; i++){
                if(max > arr[i]){
                    System.out.print(arr[i]);
                }
            
        }
         System.out.println(i);
        
        
    }
}
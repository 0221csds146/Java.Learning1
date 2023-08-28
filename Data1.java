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
public class Data1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        System.out.println("Enter elemnts of array: ");
        /*for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }*/
        for(i=(n-1);i>=0;i--){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("  Elements in an array is: ");
        for(i=0;i<n;i++){
            System.out.println("Element at "+i+" is "+arr[i]);
            
        }
        int max=arr[0];
        for (i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
                
        
    }
    
}

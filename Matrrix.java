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
public class Matrrix {
    public static void main(String11[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,j;
        int arr[][]=new int[n][m];
        System.out.println("Enter elemnts of array: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++)
            {
            arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("  Elements in an array is: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
        
    }
}

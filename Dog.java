/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author E-LAB-PC37
 */
public class Dog {
    String breed;
    String Size;
    int age;
    String color;
    
    public String getinfo(){
        return("Breed is: "+breed+" Size is:"+Size+" Age is:"+age+" Color is:"+color);
    }
    public static void main(String[] args){
        Dog maltese =new Dog();
        maltese.breed="English";
        maltese.Size="chotu";
        maltese.age=5;
        maltese.color="Golden";
        System.out.println(maltese.getinfo());
                
                
                
                
    }
}

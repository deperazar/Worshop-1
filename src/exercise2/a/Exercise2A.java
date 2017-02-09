/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2.a;

/**
 *
 * @author Daniel Eduardo Peraza Rivera
 */
import java.util.*;
public class Exercise2A {
    
    public static void main(String[] args) {
       int n;
       
       System.out.println("Introduce the number you want the multiplication table to know");
       Scanner lec = new Scanner(System.in);
       
       n=lec.nextInt();
       
       for(int i=0;i<=n;i++){
           System.out.println(n+"x"+i+" = "+n*i);
           
       }  
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_basic07.week03;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Array_homework {
    Scanner sc = new Scanner(System.in);
     public void bai1(){
         System.out.println("nhap do dai mang");
         int n = sc.nextInt();
         int a[] = new int[n];
         System.out.println("nhap gia tri phan tu");
         for(int i = 0; i< n;i++){
             System.out.println("a["+(i+1)+"]");
             a[i] = sc.nextInt();
         }
         System.out.println("sap xep mang");
         for(int i = 0; i < n-1;i++){
             for(int j = i+1;j<n;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
             }
         }
         System.out.println("nhap gia tri tiem kiem");
         int index = sc.nextInt();
          for(int i = 0;i< n;i++){
             if(a[i] == index){
                 System.out.println("co");
                 return;
             }
             
         }
         System.out.println("khong co");
     }
   public void bai2(){
       
   }
     
}

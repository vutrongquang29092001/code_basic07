/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_basic07.week02;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lesson1 {
    Scanner sc = new Scanner(System.in);
    public void divisibleBy3(){
        System.out.println("nhap do dai mang");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("nhap mang");
        for(int i = 0; i< n; i++){
            System.out.println("phan tu a["+(i+1)+"]:");
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i< n;i++){
            if(i%3 == 0){
                count ++;
            }
            
        }
        System.out.println("so phan tu chia het cho 3 la "+ count);
    }
    public void uclnaAndBcnn(){
        int ucln, bcnn;
        System.out.println("nhap hai so a , b ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        bcnn = a*b;
        while(a!=b){
            if(a>b) a -= b;
            else b -=a;
        }
        ucln = a;
        bcnn /= a;
        System.out.println("ucln = "+ucln+"bcnn"+bcnn);
    }
    public void perfectNumber(){
        int sum = 0;
        System.out.println("so hoan hao ");
        for(int i = 1;i<(int)Math.pow(10,9);i++){
            for(int j = 1; j< i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum == i){
                System.out.println(sum);
                
            }
            sum =0;
        }
    }
    
}

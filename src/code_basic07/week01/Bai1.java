/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_basic07.week01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    Scanner sc = new Scanner(System.in);
    public void gaiPhuongTrinhB2(int a, int b, int c) {
        double x1;
        double x2;
        double denta;
        if (a == 0) {
            x1 = -c / b;
            System.out.println("phuong trinh co nghiem x = " + x1);

        } else {
            denta = Math.pow(b, 2) - 4 * a * c;
            if (denta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (denta == 0) {
                x1 = -b / 2 * a;
                System.out.println("phuong trinh co nghiem x = " + x1);
            } else if (denta > 0) {
                x1 = (-b + Math.sqrt(denta)) / (2 * a);
                x2 = (-b - Math.sqrt(denta)) / (2 * a);
                System.out.println("phuong trinh có nghien x1 = " + x1 + "; x2 = " + x2);

            }

        }

    }
    public void enterInfor(){
        System.out.println("nhap ho ten");
        String name = sc.nextLine();
        System.out.println("nhap năm sinh");
        int year = sc.nextInt();
        System.out.println("nhap giới tính");
        sc.nextLine();
        String sex = sc.nextLine();
        System.out.println("nhap chieu cao ");
        double hight = sc.nextDouble();
        System.out.println("nhap can nang");
        double  weight = sc.nextDouble();
        if(sex.equals("nam") ){
            sex = "male";
        }else if(sex.equals("nu")){
            sex = "felame";
        }
        System.out.println("Ho ten : "+name + " tuoi "+(2021-year)+"BMI = " +(hight/Math.sqrt(weight))+"sex: "+sex);
    }
    
}

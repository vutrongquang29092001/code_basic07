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
public class String_homework {

    Scanner sc = new Scanner(System.in);

    public void bai1() {
        System.out.println("nhap xau");
        String str = sc.nextLine();
        int a[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= 256; j++) {
                if (str.charAt(i) == j) {
                    a[j] += 1;
                }
            }
        }
        for (int i = 1; i <= 256; i++) {
            if (a[i] != 0) {
                System.out.println((char) i + ":" + a[i]);
            }
        }
    }

    public void bai2() {
        System.out.println("nhap xau");
        int count = 0;
        String str = sc.nextLine();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                count += 1;
            } else {
                System.out.println("khong là xâu Palindrome");
                return;
            }
            if (count == str.length() / 2) {
                System.out.println("la xau Palindrome");
            }

        }

    }
}

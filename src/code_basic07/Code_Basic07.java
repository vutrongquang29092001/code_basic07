/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_basic07;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Code_Basic07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap xau");
        int count = 0;
//        String str = sc.nextLine();
        String str = "adsdsdsa";
//        if (str.length() % 2 == 0) {
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
//        }
    }

    public static double dienTich(double a) {
        return (a * a * Math.PI);
    }

    public static String[] layHoTen(String str) {
        String[] arr = {"", "", ""};
        int i = 0, k = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 32) {
                i = j;
                break;
            }
        }
        for (int j = str.length() - 1; j >= 0; j--) {
            if (str.charAt(j) == 32) {
                k = j;
                break;
            }
        }
        for (int j = 0; j < str.length(); j++) {
            if (j < i) {
                arr[0] += str.charAt(j);
            }
            if (j > i && j < k) {
                arr[1] += str.charAt(j);
            }
            if (j > k) {
                arr[2] += str.charAt(j);
            }
        }
        return arr;
    }

    public static int[] index(int[] arr) {
        int[] count = new int[100];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                count[k] = i;
                k++;
            }
        }
        int[] index = {count[0], count[k - 1]};
        return index;
    }

    public static int[] soNguyenDuong(int[] arr) {
        int index[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                index[k] = arr[i];
                k++;
            }
        }
        return index;
    }

    public static String read(int a) {
        String str = "";
        String s[] = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        if (a >= 0 && a < 10) {
            str += s[a];
        } else if (a >= 10 && a < 20) {
            if(a == 10){
                str = "muoi";
            }else{
                str = "muoi " + s[a%10];
            }
        } else if (a % 10 == 0) {
            str += s[a / 10] + " muoi";
        } else {
            int b = a / 10;
            str = str + s[b] + " muoi " + s[a - b * 10];

        }
        return str;
    }

}

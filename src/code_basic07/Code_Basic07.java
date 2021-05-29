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
        int n = 3600;
        int a[] = {2,3,0};
        bai6(a, n);
    }

     public static void bai6(int a[], int x){
        if(x>=0 && x <60){
            int k = a[2]+x;
            if( k > 60){
                k = k - 60;
                a[1] ++;
            }
            a[2] = k;
            System.out.println(a[0]+":"+a[1]+":"+a[2]);
        }
        if(x>= 60 && x< 3600 ){
            a[1] += x/60;
            int k = x%60;
            bai6(a,k);
        }
        if(x>= 3600 ){
            a[0] += x / 3600;
            int k = x%3600;
            bai6(a,k);
        }
        
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
            if (a == 10) {
                str = "muoi";
            } else {
                str = "muoi " + s[a % 10];
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

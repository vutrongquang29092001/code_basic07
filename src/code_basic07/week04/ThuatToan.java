/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_basic07.week04;

/**
 *
 * @author Admin
 */
public class ThuatToan {

    public void bai2(int a[], int n) {
        // Buble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        // insert sort
        System.out.println();

        for (int i = 0; i < n; i++) {
            int x = a[i];
            int k = i;
            while (k > 0 && x < a[k - 1]) {
                a[k] = a[k - 1];
                k--;
            }
            a[k] = x;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void bai4(int a[], int n) {
        for (int i = 2; i < n; i++) {
            int k = i;
            int x = a[i];

            if (a[k] - a[k - 1] == 1 && a[k - 1] - a[k - 2] == 1) {
                    System.out.println("chi so:" + k +" "+(k-1)+" "+ (k-2));
                    return ;
            }
             if (a[k] - a[k - 1] == -1 && a[k - 1] - a[k - 2] == -1) {
                    System.out.println("chi so:" + k +" "+(k-1)+" "+ (k-2));
                    return;
            }
             
        }
        System.out.println("-1");
    }
    
    public void bai3(int a [], int n , int x){
        for(int i = 0; i<n ; i++){
            if(a[i] == x){
                System.out.println("chi so:"+i);
                return;
            }
        }
        System.out.println("-1");
        return;
    }
    public void bai5(int a[] , int n){
        int b[] = new int[100001];
        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            b[a[i]]++;
        }
        for (int i = 0; i < b.length; i++) {
            if(b[i] != 0) System.out.println(i + ":" + b[i]);
        }
    }
    public void bai6(int a[], int x){
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
}

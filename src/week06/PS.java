/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week06;

/**
 *
 * @author Admin
 */
public class PS {
      private int tu,mau;
    
    public PS() {tu = 0; mau = 1;}
    public PS(int n) { tu=n; mau=1;}
    public PS(int t, int m) { tu = t; mau = m;}
    public PS(PS p) { tu = p.tu; mau=p.mau;}
    
    public int layTu(){ return tu;}
    public int layMau(){ return mau;}
    public void ganTu(int tu){ this.tu = tu;}
    public void ganMau(int mau) { if (mau>0) this.mau=mau;}
    
    public PS rutGon(){
       
        int t = Math.abs(tu);
        int m = Math.abs(mau);
        
        int min = Math.min(t, m);
        int i,k=1;
        
        for(i=2;i<=min;i++){
            if((t%i==0)&&(m%i==0))
                k=i; 
        }
        
        tu = tu/k;
        mau=mau/k;
         PS ps = new PS(tu,mau);
         return ps;
    }
    
    public void hienThi()
    {
        System.out.println(tu+"/"+mau);
    }
    
    public void hienThi(String s)
    {
        System.out.println(s);
    }
    
    public double giaTri() {
        return (double)tu/mau;
    }
    
    
    public PS tang(int n){
        this.tu = this.tu + this.mau*n;
        return this.rutGon();
    }
    
    public void gap(int n){
        this.tu = n*this.tu;
    }
    
    public PS cong(int n){
        PS p1 = new PS();
        p1.tu = this.tu + this.mau*n;
        p1.mau = this.mau;
        return p1.rutGon();
    }
    
    
    public PS tru(int n){
        PS p1 = new PS();
        p1.tu = this.tu - this.mau*n;
        p1.mau = this.mau;
        return p1.rutGon();
    }
    
    public PS cong(PS p){
        PS result = new PS();
        result.tu = this.tu * p.mau + p.tu * this.mau;
        result.mau = this.mau * p.mau;
        return result.rutGon();
    }
    
    public PS tru(PS p){
        PS result = new PS();
        result.tu = this.tu * p.mau - p.tu * this.mau;
        result.mau = this.mau * p.mau;
        return result.rutGon();
    }
    
    public PS nhan(PS p){
        PS result = new PS();
        result.tu = this.tu * p.tu;
        result.mau = this.mau * p.mau;
        return result.rutGon();
    }
    
    public PS nhan(int n){
        PS result = new PS();
        result.tu = this.tu * n;
        result.mau = this.mau;
        return result.rutGon();
    }
    
    public PS chia(PS p){
        PS result = new PS();
        result.tu = this.tu * p.mau;
        result.mau = this.mau * p.tu;
        return result.rutGon();
    }
    
    public PS chia(int n){
        PS result = new PS();
        result.tu = this.tu;
        result.mau = this.mau*n;
        return result.rutGon();
    }
    
    public String toString(){
        
        String s = tu+"/"+mau;
        
        return s;
    }
    
    int soSanh(PS p){
        PS kq=this.tru(p);
        long l=kq.tu*kq.mau;
        
        if(l==0)
            return 0;
        else if (l<0)
            return -1;
        else
            return 1;
    }
}

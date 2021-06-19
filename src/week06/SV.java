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
public class SV {

    int MSSV;
    String name;
    int diemToan;
    int diemLy;
    int diemHoa;

    public SV(int MSSV, String name) {
        this.MSSV = MSSV;
        this.name = name;
    }

    public void setDiemToan(int diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(int diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(int diemHoa) {
        this.diemHoa = diemHoa;
    }
    public double trungBinh(){
        double trungBinh = (double)(this.diemHoa+this.diemLy+this.diemToan)/3;
        return trungBinh;
    }
    public boolean check(){
        return (this.diemHoa+this.diemLy+this.diemToan)>10?true:false;
    }
    public void addToan(double x){
        this.diemToan += x;
    }
    public double haizzz(double x){
        if(x<0) return 0;
        if(x>10) return 10;
        return x;
    }
}

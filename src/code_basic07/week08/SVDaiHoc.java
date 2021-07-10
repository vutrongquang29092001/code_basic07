/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_basic07.week08;

/**
 *
 * @author Admin
 */
public class SVDaiHoc extends SV{
    private int soTinChi;

    public SVDaiHoc() {
    }

    public SVDaiHoc(int soTinChi, int id, String name) {
        super(id, name);
        this.soTinChi = soTinChi;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return "SVDaiHoc{" +super.toString() + " soTinChi= " + soTinChi + '}';
    }
    
}

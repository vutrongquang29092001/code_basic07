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
public class SVCaoDang extends SV {
    protected String CTDT ;

    public SVCaoDang() {
    }
    public SVCaoDang(String CTDT, int id, String name) {
        super(id, name);
        this.CTDT = CTDT;
    }

    public String getCTDT() {
        return CTDT;
    }

    public void setCTDT(String CTDT) {
        this.CTDT = CTDT;
    }

    @Override
    public String toString() {
        return "SVCaoDang{" +super.toString()+ " CTDT= " + CTDT + '}';
    }

   
    
}

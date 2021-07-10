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
public class QLSV {
      private SV[] DSSV ;
    private int soSV;
    public QLSV (int max){
        soSV = 0;
        DSSV = new SV[max];
    }
    public SV[] get(){
        return DSSV;
    }
    public Boolean add(SV student){
        if(student != null){
            DSSV[soSV++] = student;
            return true;
        }
        return false;
    }
    public SV search(String name){
         for(int i = 0 ;i< this.DSSV.length;i++){
             if(this.DSSV[i].getName().equals(name)==true){
                 return this.DSSV[i];
             }
         }
         return null;
    }
    public Boolean delete(String name){
         for(int i = 0 ;i< this.DSSV.length;i++){
             if(this.DSSV[i].getName().equals(name)==true){
                  for(int j = i;j<soSV - 1;j++){
                      this.DSSV[j]=this.DSSV[j++];
                  }
             }
         }
         if(search(name)== null){
             return true;
         }else{
             return false;
         }
    }
    public void sort(){
        for(int i = 0 ; i< soSV - 1; i ++){
            for(int j = i+1 ; j < soSV ; j++ ){
                if(DSSV[i].getName().compareTo(DSSV[j].getName()) > 0){
                    SV temp = DSSV[i];
                    DSSV[i] = DSSV[j];
                    DSSV[j] =  temp ;
                }
            }
        }
    }
    public void showInf(String name){
        System.out.println(search(name).toString());
    }
}

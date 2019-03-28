/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CWrk3;

/**
 *
 * @author mac
 */
public class CWrk {
    //Private
    int marks;
    public CWrk(int coursemarks){
        this.marks=coursemarks;
        
        
    }
    public CWrk(){}
    public int getMarks(){
        return marks;
        
    }
    public void setMarks(int marks){
        this.marks= marks;
    }
    private String names;
    private String regN0;
     private int YOB;
      public String getName(){
          return names;
          
      }
      public void setName (String name){
          this.names=name;
          
                  
      }
      public String getRegNo() {
        return regN0;
        
      }  
      public void setRegNo(String regNo) {
        this.regN0 = regNo;
      }
      public int getYob() {
        return YOB;
      }
      public void setYob(int Yob) {
        this.YOB = Yob;
      }
}
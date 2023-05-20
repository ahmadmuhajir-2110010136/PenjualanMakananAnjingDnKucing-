/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanmakanan;

/**
 *
 * @author LENOVO
 */
public class jurnal {
    private String noref,notransaksi,tgltransaksi,ket;
    
    public jurnal(){
    
    }
    
     public void setNoref(String noref){
        this.noref = noref;
    }
    
    public String getNoref(){
        return this.noref;
    }
    
     public void setNotransaksi(String notransaksi){
        this.notransaksi = notransaksi;
    }
    
    public String getNotransaksi(){
        return this.notransaksi;
    }
    
    public void setTgltransaksi(String tgltransaksi){
        this.tgltransaksi = tgltransaksi;
    }
    
    public String getTgltransaksi(){
        return this.tgltransaksi;
    }
    
    public void setKet(String ket){
        this.ket = ket;
    }
    
    public String getKet(){
        return this.ket;
    }
    
}

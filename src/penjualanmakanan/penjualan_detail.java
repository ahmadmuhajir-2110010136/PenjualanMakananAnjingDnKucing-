/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanmakanan;

/**
 *
 * @author LENOVO
 */
public class penjualan_detail {
     private String notransaksi,kdproduk,htgsatuan,qty;
     
     public penjualan_detail (){}
     
     public void setNotransaksi(String notransaksi){
        this.notransaksi = notransaksi;
    }
    
    public String getNotransaksi(){
        return this.notransaksi;
    }
    
    public void setKdproduk(String kdproduk){
        this.kdproduk = kdproduk;
    }
    
    public String getKdproduk(){
        return this.kdproduk;
    }
    
    public void setHtgsatuan(String htgsatuan){
        this.htgsatuan = htgsatuan;
    }
    
    public String getHtgsatuan(){
        return this.htgsatuan;
    }
    
    public void setQty(String qty){
        this.qty = qty;
    }
    
    public String getQty(){
        return this.qty;
    }
    
}

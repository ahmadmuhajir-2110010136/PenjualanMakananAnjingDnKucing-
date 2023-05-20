/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanmakanan;

/**
 *
 * @author LENOVO
 */
public class produk {
    private String kdproduk,kategori,nmproduk,harga,stok;
    
    public produk (){}
    
    public void setKdproduk(String kdproduk){
        this.kdproduk = kdproduk;
    }
    
    public String getKdproduk(){
        return this.kdproduk;
    }
    
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    
    public String getKategori(){
        return this.kategori;
    }
    
    public void setNmproduk(String nmproduk){
        this.nmproduk = nmproduk;
    }
    
    public String getNmproduk(){
        return this.nmproduk;
    }
    
    public void setHarga(String harga){
        this.harga = harga;
    }
    
    public String getHarga(){
        return this.harga;
    }
    
    public void setStok(String stok){
        this.stok = stok;
    }
    
    public String getStok(){
        return this.stok;
    }
    
}

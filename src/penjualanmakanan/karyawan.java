/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanmakanan;

/**
 *
 * @author LENOVO
 */
public class karyawan {
    private String idkaryawan,nama,email,alamat,telpon;
    
    public karyawan(){
    
    }
    
     public void setIdkaryawan(String idkaryawan){
        this.idkaryawan = idkaryawan;
    }
    
    public String getIdkaryawan(){
        return this.idkaryawan;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public void setTelpon(String telpon){
        this.telpon = telpon;
    }
    
    public String getTelpon(){
        return this.telpon;
    }
}

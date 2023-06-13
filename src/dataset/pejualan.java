/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class pejualan {
    public ArrayList<String> notransaksi;
    public ArrayList<String> tgltransaksi;
    public ArrayList<String> idkaryawan;
    public ArrayList<String> totalharga;
    
    public pejualan (){
    notransaksi = new ArrayList<>();
    tgltransaksi = new ArrayList<>();
    idkaryawan = new ArrayList<>();
    totalharga = new ArrayList<>();
    }
    
    public void addNotransaksi(String value){
        this.notransaksi.add(value);
    }
    
    public ArrayList<String> getNotransaksi(){
        return this.notransaksi;
    }
    
    public void addTgltransaksi(String value){
        this.tgltransaksi.add(value);
    }
    
    public ArrayList<String> getTglTransaksi(){
        return this.tgltransaksi;
    }
    
     public void addIdKaryawan(String value){
        this.idkaryawan.add(value);
    }
    
    public ArrayList<String> getKaryawan(){
        return this.idkaryawan;
    }
    
     public void addTotalHarga(String value){
        this.totalharga.add(value);
    }
    
    public ArrayList<String> getTotalHarga(){
        return this.totalharga;
    }
   
    
}

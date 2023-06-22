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
public class datasetPenjualan_detail {
    public ArrayList<String> notransaksi;
    public ArrayList<String> kdproduk;
    public ArrayList<String> hrgsatuan;
     
     public datasetPenjualan_detail (){
     notransaksi = new ArrayList<>();
     kdproduk = new ArrayList<>();
     hrgsatuan = new ArrayList<>();
     }
     
     public void addNotransaksi(String value){
        this.notransaksi.add(value);
    }
    
    public ArrayList<String> getNotransaksi(){
        return this.notransaksi;
    }
    
    public void addKodeProduk(String value){
        this.kdproduk.add(value);
    }
    
    public ArrayList<String> getKodeProduk(){
        return this.kdproduk;
    }
    
   public void addHargaSatuan (String value){
       this.hrgsatuan.add(value);
   }
   
   public ArrayList<String> getHargaSatuan(){
       return this.hrgsatuan;
   }
   
    
}

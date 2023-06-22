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
public class datasetProduk {
    public ArrayList<String> kdproduk;
    public ArrayList<String> kategori;
    public ArrayList<String> nmproduk;
    public ArrayList<String> harga;
    public ArrayList<String> stok;
    
    public datasetProduk (){
    kdproduk = new ArrayList<>();
    kategori = new ArrayList<>();
    nmproduk = new ArrayList<>();
    harga = new ArrayList<>();
    stok = new ArrayList<>();
    }
    
    public void addKodeProduk(String value){
        this.kdproduk.add(value);
    }
    
    public ArrayList<String> getKodeProduk(){
        return this.kdproduk;
    }
    
    public void addKategori(String value){
        this.kategori.add(value);
    }
    
    public ArrayList<String> getKategori(){
        return this.kategori;
    }
    
    public void addNamaProduk(String value) {
        this.nmproduk.add(value);
    }
    
    public ArrayList<String> getNamaProduk(){
        return this.nmproduk;
    }
    
    public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getHarga(){
        return this.harga;
    }
    
    public void addStok(String value){
        this.stok.add(value);
    }
    
    public ArrayList<String> getStok(){
        return this.stok;
    }
    
}

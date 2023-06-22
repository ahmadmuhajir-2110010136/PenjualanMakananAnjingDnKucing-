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
public class datasetKaryawan {
    public ArrayList<String> idkaryawan;
    public ArrayList<String> namakaryawan;
    public ArrayList<String> email;
    public ArrayList<String> alamat;
    public ArrayList<String> telepon;
    
    public datasetKaryawan(){
    idkaryawan = new ArrayList<>();
    namakaryawan = new ArrayList<>();
    email = new ArrayList<>();
    alamat = new ArrayList<>();
    telepon = new ArrayList<>();
    }
    
     public void addIdkaryawan(String value){
        this.idkaryawan.add(value);
    }
    
    public ArrayList<String> getIdkaryawan(){
        return this.idkaryawan;
    }
    
    public void addNamaKaryawan(String value){
        this.namakaryawan.add(value);
    }
    
    public ArrayList<String> getNamaKaryawan(){
        return this.namakaryawan;
    }
    
    public void addEmail(String value){
        this.email.add(value);
    }
    
    public ArrayList<String> getEmail(){
        return this.email;
    }
    
    public void addAlamat(String value){
        this.alamat.add(value);
    }
    
    public ArrayList<String> getAlamat(){
        return this.alamat;
    }
    
    public void addTelepon(String value){
        this.telepon.add(value);
    }
    
    public ArrayList<String> getTelpon(){
        return this.telepon;
    }
}

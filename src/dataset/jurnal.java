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
public class jurnal {
    public ArrayList<String> noref;
    public ArrayList<String> notransaksi;
    public ArrayList<String> tgltransaksi;
    public ArrayList<String> ket;
    
    public jurnal(){
    noref = new ArrayList<>();
    notransaksi = new ArrayList<>();
    tgltransaksi = new ArrayList<>();
    ket = new ArrayList<>();
    
    }
    
     public void addNoref(String value){
        this.noref.add(value);
    }
    
    public ArrayList<String> getNoref(){
        return this.noref;
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
    
    public ArrayList<String> getTgltransaksi(){
        return this.tgltransaksi;
    }
    
    public void addKet(String value){
        this.ket = ket;
    }
    
    public ArrayList<String> getKet(){
        return this.ket;
    }
    
}

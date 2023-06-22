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
public class datasetJurnal {
    public ArrayList<String> notransaksi;
    public ArrayList<String> tgltransaksi;
    public ArrayList<String> ket;
    
    public datasetJurnal(){
    notransaksi = new ArrayList<>();
    tgltransaksi = new ArrayList<>();
    ket = new ArrayList<>();
    
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omer
 */
public class OgrenciKrediManager extends BaseKrediManager{
   
    /*
    Burdaki hesapla(double tutar)--> aynı imza ile yazıldığı için
    
    BaseKrediManager deki hesapla fonkiyonunu ezmiş oldum
    */
    
    public double hesapla(double tutar){
        return tutar*1.10;               
        
    }
    
    
}

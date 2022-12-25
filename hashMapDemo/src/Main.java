import java.util.HashMap;

public class Main {
   
    public static void main(String[] args) {
       
        //sözlüklere benzetebiliriz.
        
        HashMap<String,String> sozluk = new HashMap<String,String>();
         
        //Eleman ekleme         //Burada book= KEY   Kitap=VALUE   yani anahtar ve değer 
        sozluk.put("Book","Kitap");   
        sozluk.put("Table","Masa");
        sozluk.put("Computer","Bilgisayar");
        sozluk.put("Camel","Deve");
        
        //Elemanları yazdırma -HEPSİ
        System.out.println(sozluk);          //Dikkat yukarıda tanımlanan sırada gelmez java nın kendi algoritmasına göre sırası değişik olarak gelir.
        
        //İstenilen elemanı yazdırma
        System.out.println(sozluk.get("Computer"));
        
        //İstenilen elamanı siler
        sozluk.remove("Table");
        
        //Tüm elemanları siler---TEMİZLER
        sozluk.clear();
        
        //Elaman sayısını verir
        sozluk.size();
        
        
        for(String item:sozluk.keySet()){
            System.out.println("Elaman= " + item + " / Değer= " + sozluk.get(item));
        }
        
        
    }
}
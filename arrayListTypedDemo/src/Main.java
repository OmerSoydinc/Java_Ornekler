import java.util.ArrayList;
import java.util.Collections;

public class Main {
  
    public static void main(String[] args) {
        
        ArrayList<String> sehirler = new ArrayList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("Isparta");
        sehirler.add("Denizli");
        sehirler.add("Trabzon");
        
        //sehirler.add(1);//hata nedeni sadece string ifadeler ekleyebiliriz
        
        
        sehirler.remove(0); //0. indexi siler
        sehirler.remove("Isparta"); // Isparta olan indexi siler
        
        
        
        
        //sehirler.sort(c);
         Collections.sort(sehirler);//sort sırala demek
                                    
         //Burada şehirler döngüyer girmeden önce sıralandı.
        for(String sehir:sehirler){
            System.out.println(sehir);  // Denizli ve Trabzonu yazar 17-18. satırda Ankara ve Trazonu sildiğimiz için 
        }
        
        
       
        
    }
    
}

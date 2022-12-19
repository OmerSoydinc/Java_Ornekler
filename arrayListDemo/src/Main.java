import java.util.ArrayList;
public class Main {  

    public static void main(String[] args) {
        
        //int[] sayilar = new int[] {1,2,3};
        //sayilar[3]=4;//3.elaman olmadığı için hata alırız
        
        /*  Burada ilk eleman olarak 1 değerini bekliyor olabiliriz ama new dediğimiz için 
        yeni bir liste oluşturduk ve eski değerleri kaybetmiş oluruz
        sayilar = new int[4];
        System.out.println(sayilar[0]);
        */
        
        
        ArrayList sayilar = new ArrayList();
        
        System.out.println(sayilar.size()); //listede kaç eleman olduğunu verecek
        
        sayilar.add(1);
        sayilar.add(10);
        System.out.println(sayilar.size());//0 olan elaman sayisi 1 ve 10 değerleri eklenince 2 oldu.
        
        sayilar.add("Ankara"); //int string her türden ekleme yapabilirim
        System.out.println(sayilar.size());//eleman sayisi 3 du
    /*     
        System.out.println(sayilar.get(2));//yazılan index teki elamanı okur
         
        
        sayilar.set(0, 100); // 0. indexteki elemanın değerini değiştir 100 yap demek
         
        sayilar.remove(0); //0. indexteki elemanı siler
        
        //Dikkat!! 0.index silindiğinde o parça atılır 1 .index 0.index yerine geçer
        //Artık 0.index teki değerimiz = 10 değeri olur
        
        sayilar.clear();//Listedeki tüm elemanları silmeye yarar
    */   
    
    System.out.println("--------------");  //Dizideki tüm elemanları gezerek ekrana yazdırma 
    
    // Dikkat edilmesi gereken tek nokta i nin türü int değil object olmalı çünkü liste ankara gibi string ifadeler de içeriyor olabilir.
        for(Object i: sayilar){
            System.out.println(i);
        }
        
        //Burada obje ile çalıştık  (sayısal,metinsel veri tipi ile çalıştık)
        //bu yapı çok tercih edilmez --> daha çok generik yapılar kullanılır arrayListTypeDemo projesinde devamı yani arraylis lerin gelişmiş hali örneği var
        
    }
    
}

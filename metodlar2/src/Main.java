//---------PARAMETRELİ METODLAR---------
public class Main {

    
    public static void main(String[] args) {
        String mesaj="Bu gün hava çok güzel";
        String yenimesaj=mesaj.substring(0,2);
        
        System.out.println(yenimesaj);
        
        
        
        System.out.println(topla(10,5));
    }
    
    
    public static void ekle(){
        System.out.println("Eklendi");
    }
    
    
     public static void sil(){
        System.out.println("Silindi");
    }
     
     
      public static void guncelle(){
        System.out.println("Güncellendi");
    }
      
      public static int topla(int sayi1,int sayi2){
          return (sayi1+sayi2);
         
      }
      
}

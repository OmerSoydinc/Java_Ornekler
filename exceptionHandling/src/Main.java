
public class Main {

   
    public static void main(String[] args) {
        
        /*
        int[] sayilar = new int[]{1,2,3};
        
        System.out.println(sayilar[2]);
        
        System.out.println(sayilar[5]); //burada herhangi bir sıkıntı görünmez ama hatadır. 
        */
        
        try{ //DENE
        
            int[] sayilar2 = new int[]{1,2,3};
        
        System.out.println(sayilar2[5]);
            
        }catch(Exception exception){   //Eğer try da hata varsa catch bloğu çalışır 
            //try daki hata catch ye parametre olarak verilir
            
            System.out.println("HATA OLUŞTU...");
            System.out.println(exception);
            
        }finally{//en son çalışacak blok 
            //NOT: İste try ister catch çalışsın finally HER ZAMAN ÇALIŞIR
            System.out.println("Ben Her Zaman Çalışırım...");
            
            /* NE İŞE YARAR ? ==> Veritabanı bağlandık yapacağımız işlemlerden sonra 
                                  hatalı olsun veya olmasın bağlantıyı kapatmamız lazım. 
                                  Bu gibi durumlarda kullanılır. (Ör: Dosya işlemleri*/
        }
        
        
        
    }
    
}

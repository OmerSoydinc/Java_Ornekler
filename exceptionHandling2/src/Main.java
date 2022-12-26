
public class Main {

    public static void main(String[] args) {
        
        try{
            int[] sayilar = new int[] {1,2,3};
            System.out.println(sayilar[5]);                 //Uygulama patlar nedeni:
        
        }catch(StringIndexOutOfBoundsException exception){   //try da alınan hata StringIndexOutOfBoundsException 
            System.out.println(exception);                  //Ama catch tarafında yukarıdaki hata sağlanmadığı için hata oluşur.
        
        }catch(ArrayIndexOutOfBoundsException exception){   
            System.out.println(exception);                  //Birden fazla catch bloğu olabilir...
        
        }catch(Exception exception){
            System.out.println("Loglandı "+ exception);
            
        }finally{
            System.out.println("Ben Her Zaman Çalışırım...");
        }
    }
    
    
}


public class Main {

    
    public static void main(String[] args) {
        
        
        String[] ogrenciler = new String[4];
        
        ogrenciler[0] = "Ali";
        ogrenciler[1] = "Veli";
        ogrenciler[2] = "Can";
        ogrenciler[3] = "Cem";
        
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        
        
         System.out.println("--------------------------------");
         
        for(String ogrenci:ogrenciler){  //ogrenci yerine istenilen isim yazılabilir
            System.out.println(ogrenci);
        }
        
        
    }
        
        
   
    
    
}

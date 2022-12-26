import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

//Bu örnekte dosya konusu ilk kez anlatılıyor (üzerinde çok durmuyor ileride anlatacak)

public class Main {

                                                     //1.Yöntem              //finally deki reader.close() için yapıldı.(3)
    public static void main(String[] args) //throws /*FileNotFoundException*/  IOException
    {  
        
        BufferedReader reader=null;
        int total=0;
        
        //2.Yöntem  (Dosyayı bulamaz isem catch de FileNotFoundException hatasını parametre olarak veriyor. Hendle-->ele almak)
        try{
            
            reader = new BufferedReader(new FileReader("F:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
            String line=null;
            
            while((line=reader.readLine())!=null){  //bir satır oku demek
               
                total += Integer.valueOf(line); //!!!--->Değeri int e çeciriyor<---!!!
                
            }
            
            System.out.println("Toplam: "+ total );
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            /*(3)
            reader.close();*/
            try{
                reader.close();   // (3) yerine bu şekilde de yazılabilir.
                
            }catch(Exception exception){
                //......
            }
        }
         
        
        //eğer bu örnekte sayilar.txt dosyasına int değere dönüşemeyecek bir değer vermiş olsaydık kod derlenir fakat exception hatası fırlatılırdır
        
        
    }
    
}

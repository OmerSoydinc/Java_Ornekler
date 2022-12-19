//Java nın içerisinde tanımlı paketler vardır. --> built-in
import java.util.Scanner;  //Kullanıcıdan bilgi almaya yarıyor
import matematik.DortIslem;
import matematik.Logaritma;

//3 ve 4. satırdaki paket tanımlamaları yerine 
//---import matematik.*--- diyerek matematik paketindeki herşeyi import et diyebiliriz...

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adınızı Giriniz: ");
        
        String isim = scanner.nextLine();
        
        System.out.println("Merhaba "+isim);
        
        
        //----------ders2-------------
        DortIslem dortIslem=new DortIslem();
        dortIslem.topla(15, 50);
        
        Logaritma logaritma = new Logaritma();
                
    }
    
}

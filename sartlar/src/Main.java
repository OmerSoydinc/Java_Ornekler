
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sayi =50;
        
        if(sayi==20){
            
           System.out.println("Sayı 20 dir");
        }else if(sayi<20){
            
            System.out.println("Sayı 20 den küçüktür.");
        }else {
            
            System.out.println("Sayı 20 den büyüktür.");
        }
        
        System.out.println("-------------------------------------------------");
        int sayi1=20 ,sayi2=25,sayi3=2;
        
        
        
        int enBuyuk=sayi1;
        
        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        
        if(enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        
        System.out.println("En büyük sayi= "+enBuyuk);
        
        
        System.out.println("-------------------------------------------------");
        
        
        char grade='D';
        
        switch(grade){
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("Çok İyi");
                break;
            case 'C':
                System.out.println("İyi");
                break;
            case 'D':
                System.out.println("Fena Değil");
                break;
            case 'E':
                System.out.println("Kötü");
                break;
            case 'F':
                System.out.println("Çok Kötü");
                break;
            default:
                System.out.println("Geçersiz Harf");
                
                
         char grade2='D';
        
        switch(grade2){
            case 'A':
                System.out.println("Mükemmel");
                break;
                
                //B ve C için aynı işlem yapılmaktadır.
            case 'B':
            case 'C':
                System.out.println("İyi");
                break;
           
                
            default:
                System.out.println("Geçersiz Harf");       
        }
        
        
        
        
        
    }
    

    }}
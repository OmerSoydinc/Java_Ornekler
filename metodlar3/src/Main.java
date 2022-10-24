//---------veriable arguments METODLAR---------
public class Main {

    
    public static void main(String[] args) {
       
        int toplam= topla(10,20,30,40,50,60,70,80,90);
        
        System.out.println(toplam);
    }
    
    
    public static int topla(int... sayilar){
        
        int toplam=0;
        
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        
        return toplam;
    }
}

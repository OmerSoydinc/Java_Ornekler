
public class Main {


    public static void main(String[] args) {
        
        int sayi = 1;
        
        int kalan=sayi %2;
        
        boolean asalMi=false;
        
         if(sayi==1){
            System.out.println("Asal değildir");
            return;
        }
         
        if(sayi<2){
            System.out.println("Geçersiz sayı");
        }
        //System.out.println(kalan);
        
        for(int i=2;i<sayi;i++){
            if(sayi% i ==0 ){
                asalMi=false;
            }
        }
        
        if(asalMi){
            System.out.println("Sayı Asaldır.");
        }else{
            System.out.println("Sayı Asal Değildır.");
        }
        
    }
    
}

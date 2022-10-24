public class Main {
    
    public static void main(String[] args) {
        
        Urun urun=new Urun();
        
        urun.ID=1;
        urun.isim="Laptop";
        urun.aciklama="HP LAPTOP";
        urun.stok=50;
        urun.fiyat=20750;
        
        
        System.out.println(urun.ID);
        System.out.println(urun.isim);
        System.out.println(urun.aciklama);
        System.out.println(urun.stok);
        System.out.println(urun.fiyat);
        
        UrunManager urunManager= new UrunManager();
        urunManager.Add(urun);
        
        
    }
    
}

public class ProductValidator { //Ana class static olamaz
    /*---1--- 
    public boolean isValid(Product product){
        if(product.price>0&& !product.name.isEmpty()){
        return true;
    }else{
            return false;
        }
    }
    */
    /* Eğer statiklerde de yapıcı blok tarzı bişey çalıştırmak isterseniz
       aşağıdaki kodu yazabilirsiniz   15.satır
    */
    
    static {
        System.out.println("Static Yapıcı Blok Çalıştı...");
    }
    
    /* Aşağıdaki gibi birden fazla yapucu blok oluşturabiliriz
    hepside çalışır. Ama çok yaygın kullanılmaz...
    
    static {
        System.out.println("1-Static Yapıcı Blok Çalıştı...");
    }static {
        System.out.println("2-Static Yapıcı Blok Çalıştı...");
    }static {
        System.out.println("3-Static Yapıcı Blok Çalıştı...");
    }
    */
    
    public ProductValidator(){ //constructor
        System.out.println("Yapıcı Blok Çalıştı...");
    }
    
    public static boolean isValid(Product product){
        if(product.price>0&& !product.name.isEmpty()){
        return true;
    }else{
            return false;
        }
    }
    
    public void bisey(){
        /*---2---başka yerden buna erişmek için ProductValidator ı 
        new yapmamız gerekli ama yukarıdaki isValid fonksiyonu
        gibi ststic yapar isek new yapmamıza gerek kalmaz*/
    }
    
    
    
    //Ana class static olamaz Ama aşağıdaki gibi class içinde class tanımlarsak olabilir
    public static class BaskaBirClass{
                                          //Buna INNER CLASS denili...
        public static void Sil(){
            
        }
    }
    
}

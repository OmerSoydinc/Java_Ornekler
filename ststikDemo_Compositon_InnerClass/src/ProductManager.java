public class ProductManager {
    public void add(Product product){
        
        /*ProductValidator validator=new ProductValidator();
        if(validator.isValid(product)){
            System.out.println("Eklendi...");
        }else{
            System.out.println("Ürün Bilgileri Geçersizdir...");
        }
        */  /*---1--- 
          eğer ProductValidator da  'public boolean isValid(Product product)' 
          adındaki fonksiyonu public static boolean isValid(...) şeklinde yazarsak
          burada new yapmak zorunda kalmayız. eğer hem new yapmaz hemde if içerisinde
          çağırmaya çalışırsak hata almış oluruz...
        */
        
        
        // eğer aşağıdaki kodu çalıştırırsak yapıcı blok yani constructor çalışırmı?
        //  - HAYIR. çalışmaz. Çünü yapıcı bloklar sadece new işlemi yapıldığında çalışır...
        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi...");
        }else{
            System.out.println("Ürün Bilgileri Geçersizdir...");
        }
        
        /*---2---
        ProductValidator productValidator = new ProductValidator();
        productValidator.bisey();
        */
        
    }
}

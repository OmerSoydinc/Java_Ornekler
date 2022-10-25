public class Main {

    
    public static void main(String[] args) {
        
        
     Product product = new Product(1,"Laptop","HP Laptop",3000,3,"Siyah");

        
        /*product.setID(1);
        product.setName("Laptop");
        product.setDescription("HP Laptop");
        product.setPrice(50000);
        product.setStockAmount(30);*/
       
        
        
        ProductManager productManager =new ProductManager();       
        productManager.Add(product);
        
        
        System.out.println(product.getKod());
  
        
        
        
        
    }
    
}

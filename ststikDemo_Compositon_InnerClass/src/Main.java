public class Main {

    public static void main(String[] args) {
        
        ProductManager manager =new ProductManager();
        Product product=new Product();
        product.price=10;
        product.name="Mouse";
        
        manager.add(product);
        
        
        //Aaşağıdaki işlemler (14 ve 15. Satırdaki kodlar) yapılabilir fakat kullanımı önerilmez...
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.crateConnection();
        
    }
    
}

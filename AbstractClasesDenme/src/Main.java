public class Main {

    //müşterinin veri tabanına kayıt edilmesi örneği 
    //farklı veritabanları uygulanıyor olabilir..
    //veritabanlarının kodları farklı..
    
   
    public static void main(String[] args) {
        
        CustomerManager custommerManager=new CustomerManager();
        
        /*custommerManager.getCustommer();//sıkıntılı durum 
        //bunun için bundan önce sql veya oracle olduğunu belirlemek gerekli
        custommerManager.databaseManager=new SqlServerDatabaseManager()
        */
        
        custommerManager.getCustommer();
        
        custommerManager.databaseManager=new OracleDatabaseManager(); //burada strateji belirlenmiş olur
        
        
        custommerManager.databaseManager=new SqlServerDatabaseManager();
        custommerManager.getCustommer();
        
        /*ileride yeni bir veritabanı sistemi daha eklenirse 
        customerManager in databaseManagerine hangi veri tabanını
        olduğunu atamak ve daha sonra ise 
        customerManager.databaseManager fonksiyonunu çağırmamız gerkiyor...
        
        */
        
        
        /* burda daha sonra mysql sınıfı eklendi 
        aşağıdaki kod da new MySqlDatabaseManager yazarak işlme de yapabiliriz...
        custommerManager.databaseManager=new SqlServerDatabaseManager();
        custommerManager.getCustommer();
        */
        
    }
    
}

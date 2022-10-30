public class CustomerManager {
    
    private BaseLogger logger;
    
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    
    
    public void add(){
        System.out.println("Müşteri Eklendi...");
        
        this.logger.log("Log mesajı");

/*      
        DatabaseLogger databaseLogger = new DatabaseLogger();
        logger.Log("Log mesajı...");                //-------------->BURASI ÇALIŞMADI İNCELE                           
*/
          

        
    }
}

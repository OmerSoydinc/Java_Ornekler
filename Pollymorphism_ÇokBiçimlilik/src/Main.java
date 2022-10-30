public class Main {

    //polimofizim -> çok biçimlilik demek...
    
    public static void main(String[] args) {
        //EmailLogger emailLogger = new EmailLogger();
        //emailLogger.Log("log mesajı");
        //                                  Burada aslında FileLogger, EmailLogger ve DatabaseLogger birer  BaseLogger dır. Yani bunlar çocuk anneleri ise BaseLogger dır...
        
        
        
        /*BaseLogger[] loggers = new BaseLogger[] {new FileLogger() , new EmailLogger() , new DatabaseLogger(), new ConsoleLogger()};   
        
        for(BaseLogger logger:loggers){
            logger.Log("Log mesajı ");
        }*/
        
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());   //databaselLogger yerine -->fileLogger da yazılabilir...
        
        customerManager.add();
        
       
        
        
        
        
    }
    
}
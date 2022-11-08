public class CustomerManager { //müşteri listeleme gibi düşün
    
    BaseDatabaseManager databaseManager;  //hangi veritabanı sistemini verirsem onun getdata sı çalışmış olacak 
    
    public void getCustommer(){
        
        /*
        
        -----böyle yaparsak oracle a BAĞLANMIŞ OLURUZ ------
        
        OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
        oracleDatabaseManager.getData();

        */
        
        databaseManager.getData();
    }
}

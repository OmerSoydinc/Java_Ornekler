
public class Main {

                                           //    (1.Yöntem)
    public static void main(String[] args) //throws Exception
    {
        
        AccountManager manager = new AccountManager();
        
        System.out.println("Hesap: "+ manager.getBalance());
        
        manager.deposit(100);
        System.out.println("Hesap: "+ manager.getBalance());
        
        //(2.Yöntem)
        try{
            manager.withdrow(90);
        }catch(BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
            
        }
        
        System.out.println("Hesap: "+ manager.getBalance());
        
        try{
            manager.withdrow(90.5);
        }catch(BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap: "+ manager.getBalance());
    }
    
}

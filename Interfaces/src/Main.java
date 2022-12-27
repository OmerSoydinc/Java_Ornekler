public class Main {

    public static void main(String[] args) {
      
        /* 
        --------HATALI interface ler new lenemezler------
        
        ICustomerDal customerDal = new ICustomerDal();
        @Override
        public void Add() {
        
        }
        */
        //----------------------polimorfizim öreneği 
        
        //ICustomerDal customerDal = new OracleCustomerDal();
                                                                //2.yöntemde parametre yazmak gerekiyor
        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
        
        /*
        customerManager.customerDal=new OracleCustomerDal();
        
        2.yöntem için gerek kalmadı

        */  
        
        
        customerManager.add();
    }
    
}

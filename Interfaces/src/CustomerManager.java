public class CustomerManager {
    
   // 1. yöntem ICustomerDal customerDal;
      
    //7-11 satır 3. yöntem
    
    private ICustomerDal customerDal;
    
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    
    public void add(){
        //iş kodları yazılır 
        customerDal.Add();
    }
}

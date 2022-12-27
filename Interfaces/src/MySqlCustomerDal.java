public class MySqlCustomerDal implements ICustomerDal , IRepository{

    //-----------------------extends XxxxClas implements şeklinde başka bir sınıf extends edilebilir.
    
    //Birden fazla snıfı implement edebilir
    
    @Override
    public void Add() {
        System.out.println("My SQL Eklendi");
    }
    
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Customer> customers = new ArrayList<Customer>();
        
        customers.add(new Customer(1,"Ömer","Soydinç"));
        customers.add(new Customer(2,"Engin","Demiroğ"));
        customers.add(new Customer(3,"Ali","Veli"));
        
        for(Customer customer:customers){                //listeyi ekrana yazdırdık
            System.out.println(customer.firstName);
        }
        
        customers.remove(new Customer(3,"Ali","Veli")); // listeden siler
        
        //17.satırdaki silmeden sonra listeyi tekrar yazdırırsak 
        //ekrana aynı değerler (ömer-engin-ali) gelir  
        
        
        //eğer aşağıdaki gibi tanımlayıp listeye eklersem listeden istediğm değerleri silebilirim.
        
        Customer omer= new Customer(4,"Ömer","Soydinç");
        customers.add(omer);  //25.satırdaki bilgileri listeye ekliyorum
        customers.remove(omer);
    }
}
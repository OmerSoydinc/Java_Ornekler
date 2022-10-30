public class Main {

    public static void main(String[] args) {
        
        //-----MİRAS-----
        
        Customer customer = new Customer();
        
        Employee employee = new Employee();
        
        customer.firstNmae="ÖMER";
        
        employee.firstNmae="Ahmet";
        
        System.out.println(customer.firstNmae);
        System.out.println(employee.firstNmae);
        
        
        System.out.println("------------customerManager çıktısı-------------------------------");
        EmployeeManager employeeManager = new EmployeeManager();
        
        CustomerManager customerManager = new CustomerManager();
        
        customerManager.Add();
        customerManager.List();
        System.out.println("-----------employeeManager çıktısı-------------");
        employeeManager.BestEmployee();
        employeeManager.Add();
        employeeManager.List();
        
        
        
    }
    
}

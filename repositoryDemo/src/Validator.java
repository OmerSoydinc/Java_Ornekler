public class Validator { 
    
//veritabanı ile alakasının olmadığını düşün
    
    
    
    //GENERİC METOD ÖRNEĞİ
  
    public <T> void validate(T entity){
        
    }
    
    
    
    //Generic kısıt kullanmış generic metod
    
    public <T extends IEntity> void validate(T entity){
        
    }

}

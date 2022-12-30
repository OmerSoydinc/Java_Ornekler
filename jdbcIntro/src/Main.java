import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
public class Main {   //netbeans add jar  (netbeans kullanımı için jar dosyasını eklemek için kaynak taraması yapılabilir)
    public static void main(String[] args) throws SQLException{
        
        selectDemo();     //Kayıt Getirir-Okur
        insertData();     //Kayıt Ekleme
        upDateData();     //Kayıt Güncelleme
        deleteData();     //Kayıt Silme
        
    }
    
    public static void selectDemo() throws SQLException{
        Connection connection = null;  //bağlıntı kurmamızı sağlar
        DbHelper helper = new DbHelper();
        
        Statement statement=null; //cümle ifadesi  (sql cümlesi)
        ResultSet resultSet;     //sonuç     (sql sorgusunun sonucunda oluşur)
        
        try{
            connection = helper.getConnection();
            
            //System.out.println("Bağlantı Oluştu...");
            
            statement = connection.createStatement();
            resultSet=statement.executeQuery("select Name,CountryCode,District,Population from city");
            
            ArrayList<Country> countries = new ArrayList<Country>();
            
            while(resultSet.next()){   //  1  datayı ekrana yazar
            
                //  1  System.out.println(resultSet.getString("Name")); //ülke ismini oku
            
                countries.add(new Country(
                        resultSet.getString("Name"),
                        resultSet.getString("CountryCode"),
                        resultSet.getString("District"),
                        resultSet.getInt("Population")));
                        
                        
            }
            System.out.println("Elaman Sayısı = " + countries.size());

        }catch(SQLException exception){
            helper.showErrorMassage(exception);
            
        }finally{
            connection.close(); //bağlantıyı kapatır
        }
    }
    
    
    public static void insertData() throws SQLException{
        Connection connection = null;  //bağlıntı kurmamızı sağlar
        DbHelper helper = new DbHelper();
        
        PreparedStatement statement=null; //cümle ifadesi  (sql cümlesi)
        ResultSet resultSet;     //sonuç     (sql sorgusunun sonucunda oluşur)
        
        try{
            connection = helper.getConnection();
            
            String sql = "insert into city(Name , CountryCode , District , Population) values (?,?,?,?)";
            
                                                   //değerler genellikle kullanıcıdan alınır                              
            //resultSet=statement.executeQuery();  //insert de sql cümlesi buraya yazılmaz 
                                                    //BURAYA YAZILIR                    //kullanıcıdan alınmak istenirse eğer ? ? ? ? şeklinde yazılır
            statement =connection.prepareStatement(sql);
            
            //burada da ? olan yerlere değerleri vermemiz gereklidir.
            
            statement.setString(1, "Hamburg");   //1. Soru işareti yerine gelecek değer, diğerleri2 3 ve 4 için de yazılır.... Dikkat veri tipine dikkat et setString veya setInt veri türlerine göre yazıldı...
            statement.setString(2, "GR");
            statement.setString(3, "ALM");
            statement.setInt(4, 1000000);
            
            
            
            statement.executeUpdate();  //etkilenen kayıt sayısı gelir    görmek için result=statement.executeUpdate(); şeklinde yazılabilir
            
            System.out.println("Kayıt Eklendi...");

        }catch(SQLException exception){
            helper.showErrorMassage(exception);
            
        }finally{
            statement.close();
            connection.close(); //bağlantıyı kapatır
        }
    }
    
    
    public static void upDateData() throws SQLException{
        Connection connection = null;  //bağlıntı kurmamızı sağlar
        DbHelper helper = new DbHelper();
        
        PreparedStatement statement=null; //cümle ifadesi  (sql cümlesi)
        ResultSet resultSet;     //sonuç     (sql sorgusunun sonucunda oluşur)
        
        try{
            connection = helper.getConnection();
                                                            //parametre olarak ? yazıp alabiliriz
            String sql = "update city set population=616161 where id=? ";  //id 4081 olan kaydın population değerini değiştirir
            
                                                   //değerler genellikle kullanıcıdan alınır                              
            //resultSet=statement.executeQuery();  //insert de sql cümlesi buraya yazılmaz 
                                                    //BURAYA YAZILIR                                                     //kullanıcıdan alınmak istenirse eğer ? ? ? ? şeklinde yazılır
            statement =connection.prepareStatement(sql);
            
            statement.setInt(1 , 4081);
            
            
            statement.executeUpdate();  //etkilenen kayıt sayısı gelir    görmek için result=statement.executeUpdate(); şeklinde yazılabilir
            
            System.out.println("Kayıt Güncellendi...");

        }catch(SQLException exception){
            helper.showErrorMassage(exception);
            
        }finally{
            statement.close();
            connection.close(); //bağlantıyı kapatır
        }
    }
    
    
    public static void deleteData() throws SQLException{
        Connection connection = null;  //bağlıntı kurmamızı sağlar
        DbHelper helper = new DbHelper();
        
        PreparedStatement statement=null; //cümle ifadesi  (sql cümlesi)
        ResultSet resultSet;     //sonuç     (sql sorgusunun sonucunda oluşur)
        
        try{
            connection = helper.getConnection();
                                                            
            String sql = "delete from city where id=?";  
            
                                                   
            statement =connection.prepareStatement(sql);
            
            statement.setInt(1 , 4081);   //4081 nid li kayıt sil demek 
            
            
            statement.executeUpdate();  //etkilenen kayıt sayısı gelir    görmek için result=statement.executeUpdate(); şeklinde yazılabilir
            
            System.out.println("Kayıt Silindi...");

        }catch(SQLException exception){
            helper.showErrorMassage(exception);
            
        }finally{
            statement.close();
            connection.close(); //bağlantıyı kapatır
        }
        
        
     
    }
    
}

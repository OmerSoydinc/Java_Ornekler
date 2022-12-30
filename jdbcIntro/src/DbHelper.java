import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {  //veritabanı yardımcısı anlamında oluşturulmuştur
    private String userName="root";
    private String pasword="120812";
    private String dbUrl="jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";  //world yazan yere veritabanı ismi yazılmalı
      
    
    public Connection getConnection() throws SQLException{ //bağlantı oluşturmak için kullanılacak
        
        return DriverManager.getConnection(dbUrl,userName,pasword);
    }
    
    public void showErrorMassage(SQLException exception){//veritabanı hataları için kullanılacak
        
        System.out.println("ERROR: " + exception);
        System.out.println("ERROR CODE: " + exception.getErrorCode());
    }
}

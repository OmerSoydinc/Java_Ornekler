
import java.sql.*;


public class DbHelper {
    
    private String userName="root";
    private String password="120812";  
    private String dbUrl="jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
            //"jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
     
    //bağlantı yapacak operasyon için yazılmıştır.
    public Connection getConnection()throws SQLException{
        
        return DriverManager.getConnection(dbUrl,userName,password);
        
    }
    
    
    //Hata mesajları için yazılmıştır...
    public void showErrorMessage(SQLException exception){
        System.out.println("Eror: " + exception.getMessage());
        System.out.println("Eror code: " + exception.getErrorCode());   
    }
}

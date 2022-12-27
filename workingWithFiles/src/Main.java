import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        writeFile();
        readFile();
        
    }
    
    public static void createFile(){
        File file = new File("F:\\javademos\\files\\students.txt");
        
        try{
            if(file.createNewFile()){
                System.out.println("Dosya Oluşturuldu");
            }else{
                System.out.println("Dosya zaten mevcut.");
            }
        }catch(IOException a){
            a.printStackTrace();
        }
    }
    
    public static void getFileInfo(){
        File file = new File("F:\\javademos\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya Adı:  " + file.getName());
            System.out.println("Dosya Yolu: " + file.getAbsolutePath());
            System.out.println("Dosya Yazılabilir Mi? : " + file.canWrite());
            System.out.println("Dosya Okunabilir  Mi? : " + file.canRead());
            System.out.println("Dosya Boyutu (byt): " + file.length());
            
        }
    }
    
    public static void readFile(){
        File file = new File("F:\\javademos\\files\\students.txt");
        
        
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void writeFile(){
        
        try {
            BufferedWriter writer  = new BufferedWriter(new FileWriter("F:\\javademos\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya Yazıldı");
            writer.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}

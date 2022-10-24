
public class Main {

   
    public static void main(String[] args) {
        
        System.out.println("------------FOR----------------------");
        
        for(int i=0;i<10;i++){
            
            System.out.println("Sayaç: " + (i+1)+ "/ i değeri = "+i);
            
        }
        
        System.out.println("-----------WHİLE-----------------------");
        
        int a=0;
        while(a<10){
            System.out.println("a= "+a);
            a++;
        }
        
        System.out.println("------------DO WHİLE----------------------");
        
        int b=0;
        do{
            System.out.println("b değeri= "+b);
            b++;
        }while(b<10);
    }
    
}

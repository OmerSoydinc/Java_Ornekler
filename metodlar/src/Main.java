public class Main {

    public static void main(String[] args) {
        
        sayiBulmaca();
      
        
    }
    
    
    //camel casing
    public static void sayiBulmaca(){
        int[] sayilar=new int[]{1,2,5,7,8,9,0};
    
        int aranacak=5;
        
        boolean varMi=false;
        
        for(int i=0;i<sayilar.length;i++){
            if(aranacak==sayilar[i]){
                varMi=true;
                break;
            }
        }
         if(varMi){
            mesajVer(aranacak);
        }else{
             mesajVer2(aranacak);
        }
        
    }
    
    public static void mesajVer(int aranacak){
        
       System.out.println("VAR: " + aranacak);
    }
    
    public static void mesajVer2(int aranacak){
        
       System.out.println("YOK: "+ aranacak);
    }
    
    
    
    
    
}

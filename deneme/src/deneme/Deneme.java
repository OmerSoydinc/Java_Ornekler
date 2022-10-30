/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deneme;

/**
 *
 * @author omer
 */
public class Deneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double[] mylist= {1.2 , 1.3 , 4.3 , 5.6};
        
        double total=0;
        
        double max=mylist[0];
        
        for(int i=0;i<mylist.length;i++){
            
            total=total+mylist[i]; 
        
            if(max<mylist[i]){
                max=mylist[i];
            }
            
            System.out.println("Sayi= "+ mylist[i]);
        }
        
        System.out.println("toplam= "+total);
        
        System.out.println("En Büyük= "+max);

        
    
}
}

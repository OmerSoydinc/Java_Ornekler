public class Main {

   
    public static void main(String[] args) {
        
         WomanGameCalculator womanGameCalculator =new WomanGameCalculator();
         womanGameCalculator.hesapla();
         womanGameCalculator.gameOver();
         
         
         /*
         GameCalculator gameCalculator=new GameCalculator();
         
         !!! Abstract sınıflar asla new lenemez.
        
         
         
         Aşağıdaki çöüm sakıncalıdır.
        GameCalculator gameCalculator=new GameCalculator() {
             @Override
             public void hesapla() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         };

          */

         GameCalculator gameCalculator = new WomanGameCalculator();
         
    }
   
}

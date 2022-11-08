public abstract class GameCalculator {
   public abstract void hesapla(); //kim implemente ediyorsa hendi hesaplamasını yazmak zorunda.
   
   //abstract sınıfta bir abstract olamak zorunda değildir
   
   public void gameOver(){ //tüm oyuncular için aynı.
       System.out.println("Oyun Bitti");
   }
}

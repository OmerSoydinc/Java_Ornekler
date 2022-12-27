import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
        ArrayList list = new ArrayList();
        list.add("Araba");
        list.add("Ankara");
        list.add(24);
        list.add(13.3);
        
        
        // Aşağıdaki ArrayList String ile çalışan GENERİC bir class tır.
        ArrayList<String> sehirler = new ArrayList<String>();
        
        sehirler.add("Isparta");
        sehirler.add("Denizli");
        sehirler.add("Trabzon");
        
        //GENERİC 'e neden ihtiyaç duyarız?
        //Çünkü Tip güvenli çalışmak için.
        */
        
        MyList<String> sehirler = new MyList<String>();
        
        sehirler.add("Ankara");
        
        //  sehirler.add(25);    //Hata verir
        
        
        MyList<Customer> musteriler = new MyList<Customer>();
        musteriler.add(new Customer());
        
        MyList<Customer> musteriler2 = new MyList<>();  //Böylede hata vermez
        musteriler.add(new Customer());
    }
    
}

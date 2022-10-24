public class Main {
    
    public static void main(String[] args) {
        
        String mesaj="Bugün hava çok güzel.";
        
        System.out.println(mesaj);
        
        System.out.println("Elaman Sayısı: "+mesaj.length());
        
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        
        System.out.println(mesaj.concat("Yaşasın"));
        
        System.out.println(mesaj.startsWith("A")); //BAŞLAMA 
        System.out.println(mesaj.endsWith("A")); //BİTİŞ
        
        char[] karakterler=new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler); 
        
        System.out.println(mesaj.indexOf('a')); //ilk a nerde 
        
        System.out.println(mesaj.lastIndexOf("a"));
        
        
        System.out.println("------------------------------------");
        
        System.out.println(mesaj.replace(' ', '-'));
        
        String yenimetin=mesaj.replace(' ', '-');
        
        System.out.println(mesaj.substring(2));
        
        System.out.println(mesaj.substring(2,4));
        
        for(String kelime:mesaj.split(" ")){
        System.out.println(kelime);
        }
        
        System.out.println(mesaj.toLowerCase());
        
        System.out.println(mesaj.toUpperCase());
        
        
        String mesaj3="    Bugün hava güzel.   ";
        System.out.println(mesaj3);
        System.out.println(mesaj3.trim());
    }
}
    


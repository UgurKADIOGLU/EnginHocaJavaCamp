public class Main {

    public static void main(String[] args) {
        int sayi1 = 21;
        int sayi2 = 21;
        int sayi3 = 21;
        if (sayi1 < sayi2 & sayi2<sayi3) {
            System.out.println("En büyük sayi: "+sayi3);
        } else if (sayi1 < sayi3 & sayi3<sayi2) {
            System.out.println("En büyük sayi: "+sayi2);
        }else if (sayi1 < sayi3 & sayi3<sayi2) {
            System.out.println("En büyük sayi: "+sayi2);
        }


    }
}

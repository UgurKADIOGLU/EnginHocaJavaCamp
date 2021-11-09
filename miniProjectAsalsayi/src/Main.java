public class Main {

    public static void main(String[] args) {
        int sayi = 2;
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
            }
        }
        if (asalMi) {
            System.out.println("Bu sayı asaldır...");
        } else {
            System.out.println("Bu sayı asal değildir...");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6};
        int aranacak = 10;
        boolean varMi = false;
        for (int ara : sayilar) {
            if (ara == aranacak) {
                varMi = true;
            }
        }

        mesajVer(varMi);
    }

    //boolean varMi;

    public static void mesajVer(boolean varMi) {

        System.out.println(varMi);
    }
}

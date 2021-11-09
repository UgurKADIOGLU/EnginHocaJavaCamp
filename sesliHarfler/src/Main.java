public class Main {

    public static void main(String[] args) {
        char karakter = 'a';

        char[] inceSesliler = {'a', 'e' };
        //char[] kalinSesliler = {'i', 'ı' };
        boolean inceMi = false;
        for (char ses : inceSesliler) {
            if (ses == karakter) {
                inceMi = true;
            }
        }
        if (inceMi) {
            System.out.println("İnce sesli");
        } else {
            System.out.println("Kalın sesli");
        }

    }
}

public class Main {

    public static void main(String[] args) {
        char grade = 'Z';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz");
                break;
            case 'B':
            case 'Z':
                System.out.println("İyi geçtiniz");
                break;
            case 'C':
                System.out.println("orta geçtiniz");
                break;
            case 'D':
                System.out.println("geçtiniz");
                break;
            case 'F':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("geçersiz not girdiniz");
        }

    }
}

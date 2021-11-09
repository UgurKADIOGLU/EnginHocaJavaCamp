public class Main {

    public static void main(String[] args) {
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        int j=20;
        do {
            System.out.println("loglandı...");
            System.out.println(j);
            j++;
        }while (j < 10);
    }
}

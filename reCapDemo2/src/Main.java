public class Main {

    public static void main(String[] args) {
        double[] mylist = {1.9, 1.3, 1.4, 1.5};
        double toplam=0;
        double enBuyuk=0;

        for (double list : mylist) {
            if (list > enBuyuk) {
                enBuyuk=list;
            }
            System.out.println(list);
            toplam+=list;
        }
        System.out.println(toplam+ " -en büyük sayı: "+enBuyuk);

    }
}

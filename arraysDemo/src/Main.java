public class Main {

    public static void main(String[] args) {
        String[] ogrenci = {"Uğur", "Ahmet"};
        //ogrenci[].="Ummahan";
        System.out.println(ogrenci.length);

        for (int i = 0; i < ogrenci.length; i++) {
            System.out.println(ogrenci[i]);
        }

        for (String ogr : ogrenci) {
	    System.out.println(ogr);
        }

    }
}

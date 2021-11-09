public class Main {

    public static void main(String[] args) {
        BaseKrediManager[] baseKrediManagers = {new TarımKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager baseKrediManager : baseKrediManagers
        ) {
            System.out.println(baseKrediManager.hesapla(1000));
        }
        //System.out.println(baseKrediManager.hesapla(1000));
    }
}

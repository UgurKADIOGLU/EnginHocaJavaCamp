package Concrete;


import Abstract.ICheckPerson;
import Abstract.IGamer;
import Abstract.IGamerManager;
import Entity.Gamer;


public class GamerManager implements IGamerManager {
    ICheckPerson iCheckPerson;

    public GamerManager(ICheckPerson iCheckPerson) {
        this.iCheckPerson = iCheckPerson;
    }


    @Override
    public void save(Gamer gamer) throws Exception {
        if (iCheckPerson.IfRealCheckPerson(gamer)) {
            System.out.println("Kayıt başarılı : " + gamer.firstName);
        } else {
            System.out.println("Bilgileriiz yanlış...");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Müşteri silidi...");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Müşteri güncellendi...");
    }
}

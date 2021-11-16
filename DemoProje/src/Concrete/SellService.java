package Concrete;

import Abstract.IKampanya;
import Abstract.ISellService;
import Entity.Game;
import Entity.Gamer;

public class SellService implements ISellService {
    IKampanya iKampanya;
    public SellService(IKampanya iKampanya){
        this.iKampanya=iKampanya;
    }

    @Override
    public void sell(Gamer gamer, Game game) {
        System.out.println(game.name+" satışı yapıldı : "+gamer.firstName+" tutar "+game.money*iKampanya.kampanya());
    }
}

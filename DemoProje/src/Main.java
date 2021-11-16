import Abstract.IGamerManager;
import Abstract.ISellService;
import Adapter.MernisCheck;
import Concrete.GamerManager;
import Concrete.Kampanya;
import Concrete.SellService;
import Entity.Game;
import Entity.Gamer;

public class Main {

    public static void main(String[] args) throws Exception {
        Gamer gamer=new Gamer();
        gamer.id=1;
        gamer.firstName="UĞUR";
        gamer.lastName="KADIOĞLU";
        gamer.dateTime=1983;
        gamer.nationalityId=Long.parseLong("43771598666");

        IGamerManager iGamerManager=new GamerManager(new MernisCheck());
        iGamerManager.save(gamer);

        Game game=new Game();
        game.money=1000;
        game.name="Peynir yapma";
        ISellService iSellService=new SellService(new Kampanya());
        iSellService.sell(gamer, game);
    }
}

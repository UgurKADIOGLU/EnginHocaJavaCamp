package Abstract;

import Entity.Gamer;

public interface IGamerManager {
    public void save(Gamer gamer) throws Exception;
    public void delete(Gamer gamer);
    public void update(Gamer gamer);
}

package factories;

import domain.Player;

import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class PlayerFactory {
    private static PlayerFactory playerFactory = null;

    public static PlayerFactory getInstance()
    {
        if(playerFactory == null)
        {
            playerFactory = new PlayerFactory();
        }
        return playerFactory;
    }

    public Player getPlayer(Map<String,String> stringIntegerMap)
    {
        Player player = new Player.Builder()
                .PlayerName(stringIntegerMap.get("PlayerName"))
                .PlayerAge(stringIntegerMap.get("PlayerAge"))
                .PlayerSurname(stringIntegerMap.get("PlayerSurname"))
                .build();
        return player;
    }
}

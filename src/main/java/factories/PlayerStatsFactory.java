package factories;

import domain.PlayerStats;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lodz on 2016/04/07.
 */
public class PlayerStatsFactory {
    public static PlayerStatsFactory playerStatsFactory = null;

    public static PlayerStatsFactory getInstance(){
        if(playerStatsFactory == null)
        {
            playerStatsFactory = new PlayerStatsFactory();
        }
        return playerStatsFactory;

    }
    /*
     private String caps;
    private String gamesStarted;
    private String gamesWon;
    private String gamesLost;
     Map<String,String> stringMapl = new HashMap<String, String>();
        stringMapl.put("caps","111");
        getPlayerStats(stringMapl);
domain.PlayerStats
     */

    public PlayerStats getPlayerStats(Map<String,String> stringMap){
        PlayerStats playerStats = new PlayerStats.Builder()
                .Caps(stringMap.get("Caps"))
                .GamesLost(stringMap.get("GamesLost"))
                .GamesStarted(stringMap.get("GamesStarted"))
                .GamesWon(stringMap.get("GamesWon"))
                .build();
        return playerStats;
    }

}

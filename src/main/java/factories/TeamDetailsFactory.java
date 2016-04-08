package factories;

import domain.TeamDetails;

import java.util.Map;

/**
 * Created by lodz on 2016/04/07.
 */
public class TeamDetailsFactory {
    public static TeamDetailsFactory teamDetailsFactory = null;

    public static TeamDetailsFactory getInstance()
    {
        if(teamDetailsFactory == null)
        {
            teamDetailsFactory = new TeamDetailsFactory();
        }
        return teamDetailsFactory;
    }

    /*
        public static PlayerStatsFactory playerStatsFactory = null;

    public static PlayerStatsFactory getInstance(){
        if(playerStatsFactory == null)
        {
            playerStatsFactory = new PlayerStatsFactory();
        }
        return playerStatsFactory;

    }
         PlayerStats playerStats = new PlayerStats.Builder()
                .Caps(stringMap.get("caps"))
                .GamesLost(stringMap.get("gamesLost"))
                .GamesStarted(stringMap.get("gamesStarted"))
                .GamesWon(stringMap.get("gamesWon"))
                .build();
        return playerStats;
        TeamDetails teamDetails = new TeamDetails.Builder();
    */
    public TeamDetails getTeamDetails(Map<String,String> stringMap)
    {
        TeamDetails teamDetails = new TeamDetails.Builder()
                .established(stringMap.get("established"))
                .appearances(stringMap.get("appearances"))
                .build();
        return teamDetails;
    }
}

package factories;

//import domain.TeamDetails;
import domain.TeamStats;

import java.util.Map;

/**
 * Created by lodz on 2016/04/07.
 */
public class TeamStatsFactory {

    public static TeamStatsFactory teamStatsFactory = null;

    public static TeamStatsFactory getInstance()
    {
        if(teamStatsFactory == null)
        {
            teamStatsFactory = new TeamStatsFactory();
        }
        return teamStatsFactory;
    }

    public TeamStats getTeamStats(Map<String,Integer> stringIntegerMap)
    {
        TeamStats teamDetails = new TeamStats.Builder()
                .Wins(stringIntegerMap.get("Wins"))
                .Loses(stringIntegerMap.get("Loses"))
                .Played(stringIntegerMap.get("Played"))
                .build();
        return teamDetails;
    }
}

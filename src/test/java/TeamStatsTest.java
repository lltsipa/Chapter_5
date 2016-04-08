import domain.TeamStats;
import factories.TeamStatsFactory;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class TeamStatsTest {
    TeamStatsFactory teamStatsFactory;

    @Before
    public void setUp() throws Exception {
        teamStatsFactory = teamStatsFactory.getInstance();
    }

    @Test
    public void testTeamStats() throws Exception {
        Map<String,Integer> stringIntegerMap = new HashMap<String, Integer>();

        stringIntegerMap.put("Wins",6);
        stringIntegerMap.put("Loses",4);
        stringIntegerMap.put("Played",11);
        //stringIntegerMap.put("")

        TeamStats teamStats = teamStatsFactory.getTeamStats(stringIntegerMap);

        Assert.assertEquals(6,teamStats.getWins());
        Assert.assertEquals(4,teamStats.getLoses());
        Assert.assertEquals(11,teamStats.getPlayed());
        Assert.assertEquals(16,teamStats.countryRankingPoints());
    }
}

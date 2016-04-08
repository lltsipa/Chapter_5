import domain.PlayerStats;
import factories.PlayerStatsFactory;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class PlayerStatsTest {
    PlayerStatsFactory playerStatsFactory;

    @Before
    public void setUp() throws Exception {
        playerStatsFactory = playerStatsFactory.getInstance();
    }

    @Test
    public void testPlayerStats() throws Exception {
        Map<String,String> stringMap = new HashMap<String, String>();

        stringMap.put("GamesWon","3");
        stringMap.put("GamesLost","2");
        stringMap.put("Caps","8");
        stringMap.put("GamesStarted","6");

        PlayerStats playerStats = playerStatsFactory.getPlayerStats(stringMap);

        Assert.assertEquals("3",playerStats.getGamesWon());
        Assert.assertEquals("2",playerStats.getGamesLost());
        Assert.assertEquals("8",playerStats.getCaps());
        Assert.assertEquals("6",playerStats.getGamesStarted());
    }
}

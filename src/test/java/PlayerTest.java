import domain.Player;
import factories.PlayerFactory;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class PlayerTest {
    PlayerFactory playerFactory;

    @Before
    public void setUp() throws Exception {
        playerFactory = playerFactory.getInstance();
    }

    @Test
    public void testPlayer() throws Exception {

        Map<String,String> stringMap = new HashMap<String, String>();
        stringMap.put("PlayerName","Viwe");
        stringMap.put("PlayerSurname","Siviwe");
        stringMap.put("PlayerAge","18");

        Player player = playerFactory.getPlayer(stringMap);
        Assert.assertEquals("Viwe",player.getPlayerName());
        Assert.assertEquals("Siviwe",player.getPlayerSurname());
        Assert.assertEquals("18",player.getPlayerAge());
    }
}

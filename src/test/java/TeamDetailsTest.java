import domain.TeamDetails;
import factories.TeamDetailsFactory;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class TeamDetailsTest {
    TeamDetailsFactory factory;

    @Before
    public void setUp() throws Exception {
        factory =  TeamDetailsFactory.getInstance();

    }

    @Test
    public void testTeam() throws Exception {

        Map<String,String> stringMap = new HashMap<String, String>();
        stringMap.put("established","1987");
        stringMap.put("appearances", "5");
        TeamDetails team =factory.getTeamDetails(stringMap);
        Assert.assertEquals("1987",team.getEstablished());
        Assert.assertEquals("5",team.getAppearances());
    }
}

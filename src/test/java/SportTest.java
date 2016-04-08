import domain.Sport;
import factories.SportFactory;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class SportTest {
    SportFactory sportFactory;

    @Before
    public void setUp() throws Exception {
        sportFactory = sportFactory.getInstance();
    }

    @Test
    public void testSport() throws Exception {
        Map<String,String> stringMap = new HashMap<String, String>();

        stringMap.put("Sport","Football");

        Sport sport = sportFactory.getSport(stringMap);

        Assert.assertEquals("Football",sport.getSport());
    }
}

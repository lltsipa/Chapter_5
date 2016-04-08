import domain.Catagory;
import factories.CatagoryFactory;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class CatagoryTest {
    CatagoryFactory catagoryFactory;

    @Before
    public void setUp() throws Exception {
        catagoryFactory = catagoryFactory.getInstance();
    }

    @Test
    public void testCatagory() throws Exception {
        Map<String,String> stringMap = new HashMap<String, String>();
        stringMap.put("Men","Men");
        stringMap.put("Women","Women");

        Catagory catagory = catagoryFactory.getCatagory(stringMap);
        Assert.assertEquals("Men",catagory.getMen());
        Assert.assertEquals("Women",catagory.getWomen());
    }
}

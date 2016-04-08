import domain.Nationality;
import factories.NationalityFactory;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class NationalityTest {
    NationalityFactory nationalityFactory;

    @Before
    public void setUp() throws Exception {
        nationalityFactory = NationalityFactory.getInstance();
    }

    @Test
    public void testNationality() throws Exception {


        Map<String, String> stringMap = new HashMap<String, String>();
        stringMap.put("Continent","Africa");
        stringMap.put("Country","Nigeria");
        Nationality nationality = nationalityFactory.getNationality(stringMap);
        Assert.assertEquals("Africa",nationality.getContinent());
        Assert.assertEquals("Nigeria", nationality.getCountry());
    }
}

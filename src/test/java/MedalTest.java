import factories.MedalFactory;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by lodz on 2016/04/08.
 */
public class MedalTest {

    @Test
    public void testMedal() throws Exception {
        String gold = MedalFactory.getMedal(2);
        //String silver = MedalFactory.getMedal(2);
        //String bronze = MedalFactory.getMedal(3);
        Assert.assertEquals("Gold Medal",gold);
      //  Assert.assertEquals("silver",silver);


    }
}

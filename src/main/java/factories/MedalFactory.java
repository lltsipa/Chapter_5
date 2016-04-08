package factories;

import domain.BronzeMedal;
import domain.GoldMedal;
import domain.Medals;
import domain.SilverMedal;

/**
 * Created by lodz on 2016/04/08.
 */
public class MedalFactory {

    public static String getMedal(int position)
    {
        Medals medals = setUpMedal();
        return medals.getMedal(position);
    }

    public static Medals setUpMedal()
    {
        Medals gold = new GoldMedal();
        Medals silver = new SilverMedal();
        Medals bronze = new BronzeMedal();
        gold.setNextPosition(silver);
        silver.setNextPosition(bronze);
        return gold;
    }
}

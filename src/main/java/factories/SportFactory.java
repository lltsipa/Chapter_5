package factories;

import domain.Sport;

import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class SportFactory {
    public static SportFactory sportFactory = null;

    public static SportFactory getInstance()
    {
        if(sportFactory == null) {
            sportFactory = new SportFactory();
        }
        return sportFactory;
    }

    public static Sport getSport(Map<String,String> stringMap)
    {
        Sport sport = new Sport.Builder()
                .Sport(stringMap.get("Sport"))
                .build();
        return sport;
    }
}

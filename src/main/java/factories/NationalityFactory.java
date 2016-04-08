package factories;

import domain.Nationality;

import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class NationalityFactory {
    public static NationalityFactory nationalityFactory = null;

    public static NationalityFactory getInstance()
    {
        if(nationalityFactory == null)
        {
            nationalityFactory = new NationalityFactory();
        }
        return nationalityFactory;
    }

    public Nationality getNationality(Map<String,String> stingStringMap)
    {
        Nationality nationality = new Nationality.Builder()
                .Continent(stingStringMap.get("Continent"))
                .Country(stingStringMap.get("Country"))
                .build();
        return nationality;
    }
}

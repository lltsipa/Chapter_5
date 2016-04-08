package factories;

import domain.Catagory;

import java.util.Map;

/**
 * Created by lodz on 2016/04/08.
 */
public class CatagoryFactory {
    public static CatagoryFactory catagoryFactory = null;

    public static CatagoryFactory getInstance()
    {
        if(catagoryFactory == null)
        {
            catagoryFactory = new CatagoryFactory();
        }
        return catagoryFactory;
    }

    public static Catagory getCatagory(Map<String,String> stringMap)
    {
        Catagory catagory = new Catagory.Builder()
                .Men(stringMap.get("Men"))
                .Women(stringMap.get("Women"))
                .build();
        return catagory;
    }
}

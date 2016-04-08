package domain;

import java.io.Serializable;

/**
 * Created by lodz on 2016/04/05.
 */
public class SilverMedal extends Medals implements Serializable{

    @Override
    public String getMedal(int position) {
        if(position == 2)
        {
            return "Silver Medal";
        }
        else
        {
            if(medals!= null)
            {
                medals.getMedal(position);
            }

            return "No Medal";
        }
    }
}

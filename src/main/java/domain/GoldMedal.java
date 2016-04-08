package domain;

import java.io.Serializable;

/**
 * Created by lodz on 2016/04/05.
 */
public class GoldMedal extends Medals implements Serializable{

    private int position;

    @Override
    public String getMedal(int position) {
        if(position == 1)
        {
            return "Gold Medal";
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

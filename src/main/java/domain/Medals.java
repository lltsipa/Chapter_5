package domain;

/**
 * Created by lodz on 2016/04/05.
 */
public abstract class Medals {
    Medals medals;

  //  public Medals(Medals medals)
   // {
    //    this.medals = medals;
  //  }
    public void setNextPosition(Medals medals)
    {
        this.medals = medals;
    }

    public abstract String getMedal(int position);
}

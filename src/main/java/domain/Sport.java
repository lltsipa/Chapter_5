package domain;

/**
 * Created by lodz on 2016/04/05.
 */
public class Sport {
    private String sport;

    private Sport()
    {

    }

    public Sport(Builder builder) {
        this.sport = builder.sport;
    }

    public String getSport() {
        return sport;
    }

    public static class Builder{
        private String sport;

        public Builder Sport(String sport) {
            this.sport = sport;
            return this;
        }
        public Builder copy(Sport sport){
            this.sport = sport.sport;
            return this;
        }

        public Sport build()
        {
            return new Sport(this);
        }
    }
    public static Builder builder(){
        return  new Builder();
    }
}

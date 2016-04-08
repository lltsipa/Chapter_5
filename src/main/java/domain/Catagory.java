package domain;

/**
 * Created by lodz on 2016/04/05.
 */
public class Catagory {
    private String men;
    private String women;

    private Catagory()
    {

    }

    public Catagory(Builder builder) {
        this.men = builder.men;
        this.women = builder.women;
    }

    public String getMen() {
        return men;
    }

    public String getWomen() {
        return women;
    }

    public static class Builder{
        private String men;
        private String women;

        public Builder Men(String men) {
            this.men = men;
            return this;
        }

        public Builder Women(String women) {
            this.women = women;
            return this;
        }
        public Builder copy(Catagory catagory)
        {
            this.men = catagory.men;
            this.women = catagory.women;
            return this;
        }
        public Catagory build()
        {
            return new Catagory(this);
        }
    }
}

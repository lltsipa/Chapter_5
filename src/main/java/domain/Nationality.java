package domain;

import java.io.Serializable;

/**
 * Created by lodz on 2016/04/05.
 */
public class Nationality implements Serializable{

    private String continent;
    private String country;

    private Nationality()
    {

    }

    public Nationality(Builder builder) {
        this.continent = builder.continent;
        this.country = builder.country;
    }

    public String getContinent() {
        return continent;
    }

    public String getCountry() {
        return country;
    }

    public static class Builder{
        private String continent;
        private String country;

        public Builder Continent(String continent) {
            this.continent = continent;
            return this;
        }

        public Builder Country(String country) {
            this.country = country;
            return this;
        }

        public Builder copy(Nationality nationality)
        {
            this.continent = nationality.continent;
            this.country = nationality.country;
            return this;
        }

        public Nationality build()
        {
            return new Nationality(this);
        }
    }
    public static Builder builder()
    {
        return new Builder();
    }
}

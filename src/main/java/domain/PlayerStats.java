package domain;

import java.io.Serializable;

/**
 * Created by lodz on 2016/04/05.
 */
public class PlayerStats implements Serializable{
    private String caps;
    private String gamesStarted;
    private String gamesWon;
    private String gamesLost;

    private PlayerStats()
    {

    }

    public PlayerStats(Builder builder) {
        this.caps = builder.caps;
        this.gamesLost = builder.gamesLost;
        this.gamesStarted = builder.gamesStarted;
        this.gamesWon = builder.gamesWon;
    }

    public String getCaps() {
        return caps;
    }

    public String getGamesStarted() {
        return gamesStarted;
    }

    public String getGamesWon() {
        return gamesWon;
    }

    public String getGamesLost() {
        return gamesLost;
    }


    public static class Builder{
        private String caps;
        private String gamesStarted;
        private String gamesWon;
        private String gamesLost;

        public Builder Caps(String caps) {
            this.caps = caps;
            return this;
        }

        public Builder GamesStarted(String gamesStarted) {
            this.gamesStarted = gamesStarted;
            return this;
        }

        public Builder GamesWon(String gamesWon) {
            this.gamesWon = gamesWon;
            return this;
        }

        public Builder GamesLost(String gamesLost) {
            this.gamesLost = gamesLost;
            return this;
        }
        public Builder copy(PlayerStats playerStats)
        {
            this.caps = playerStats.caps;
            this.gamesLost = playerStats.gamesLost;
            this.gamesStarted = playerStats.gamesStarted;
            this.gamesWon = playerStats.gamesWon;
            return this;
        }

        public PlayerStats build()
        {
            return new PlayerStats(this);
        }
    }
    public static Builder builder()
    {
        return new Builder();
    }
}

/*
 public Builder copy(TeamDetails teamDetails){
            this.established = teamDetails.established;
            this.appearances = teamDetails.appearances;
            return this;
        }

        public TeamDetails build(Builder builder)
        {
            return new TeamDetails(this);
        }
    }
    public static Builder builder()
    {
        return new Builder();
    }
 */
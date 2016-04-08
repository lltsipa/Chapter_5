package domain;

/**
 * Created by lodz on 2016/04/05.
 */
public class TeamStats implements Rankings{

    private int wins;
    private int loses;

    public int getPlayed() {
        return played;
    }

    private int played;

    private TeamStats()
    {

    }

    public TeamStats(Builder builder) {
        this.wins = builder.wins;
        this.loses = builder.loses;
        this.played = builder.played;
    }

    public int getLoses() {
        return loses;
    }

    public int getWins() {
        return wins;
    }

    public int countryRankingPoints() {
        int total = (wins * 4)-(loses*2);
        return total;
    }

    public static class Builder{
        private int wins;
        private int loses;
        private int played;

        public Builder Played(int played) {
            this.played = played;
            return this;
        }

        public Builder Wins(int wins) {
            this.wins = wins;
            return this;
        }

        public Builder Loses(int loses) {
            this.loses = loses;
            return this;
        }

        public Builder copy(TeamStats teamStats)
        {
            this.played = teamStats.played;
            this.wins = teamStats.wins;
            this.loses = teamStats.loses;
            return this;
        }

        public TeamStats build()
        {
            return new TeamStats(this);
        }
    }
    public Builder builder()
    {
        return new Builder();
    }
}

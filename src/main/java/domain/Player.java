package domain;

/**
 * Created by lodz on 2016/04/05.
 */
public class Player {
    private String playerName;
    private String playerSurname;
    private String playerAge;

    private Player()
    {

    }

    public Player(Builder builder)
    {
        this.playerName = builder.playerName;
        this.playerSurname = builder.playerSurname;
        this.playerAge = builder.playerAge;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerAge() {
        return playerAge;
    }

    public String getPlayerSurname() {
        return playerSurname;
    }

    public static class Builder{
        private String playerName;
        private String playerSurname;
        private String playerAge;

        public Builder PlayerName(String playerName) {
            this.playerName = playerName;
            return this;
        }

        public Builder PlayerSurname(String playerSurname) {
            this.playerSurname = playerSurname;
            return this;
        }

        public Builder PlayerAge(String playerAge) {
            this.playerAge = playerAge;
            return this;
        }

        public Builder copy(Player player){
            this.playerName = player.playerName;
            this.playerSurname = player.playerSurname;
            this.playerAge = player.playerAge;
            return this;
        }

        public Player build()
        {
            return  new Player(this);
        }
    }
    public static Builder builder(){
        return new Builder();
    }
}

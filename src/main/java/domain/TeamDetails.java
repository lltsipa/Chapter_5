package domain;

/**
 * Created by lodz on 2016/04/05.
 */
public class TeamDetails {

    private String established;
    private String appearances;

    private TeamDetails()
    {

    }

    public TeamDetails(Builder builder) {
        this.appearances = builder.appearances;
        this.established = builder.established;
    }

    public String getEstablished() {
        return established;
    }

    public String getAppearances() {
        return appearances;
    }

    public static class Builder{
        public String established;
        public String appearances;

        public Builder established(String established) {
            this.established = established;
            return this;
        }

        public Builder appearances(String appearances) {
            this.appearances = appearances;
            return this;
        }

        public Builder copy(TeamDetails teamDetails){
            this.established = teamDetails.established;
            this.appearances = teamDetails.appearances;
            return this;
        }

        public TeamDetails build()
        {
            return new TeamDetails(this);
        }
    }
    public static Builder builder()
    {
        return new Builder();
    }
}

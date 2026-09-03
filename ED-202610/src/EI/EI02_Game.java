package EI;

public class EI02_Game {
    Boolean victory;
    int kills;
    float timeSeconds;

    public EI02_Game() {
    }

    public Boolean getVictory() {
        return victory;
    }

    public void setVictory(Boolean victory) {
        this.victory = victory;
    }

    public float getTimeSeconds() {
        return timeSeconds;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setTimeSeconds(float timeSeconds) {
        this.timeSeconds = timeSeconds;
    }
}
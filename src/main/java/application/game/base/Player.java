package application.game.base;

import application.models.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;


public class Player {
    @JsonProperty("userProfile")
    private @NotNull User userProfile;

    @JsonProperty("score")
    private @NotNull Long score;

    @JsonProperty("isSurrender")
    private @NotNull Boolean isSurrender = false;

    public Player(@NotNull User userProfile) {
        this.userProfile = userProfile;
        score = 0L;
    }

    public @NotNull User getUserProfile() {
        return userProfile;
    }

    public @NotNull Long getUserId() {
        return userProfile.getId();
    }

    public @NotNull Long getScore() {
        return score;
    }

    public Boolean isSurrender() {
        return isSurrender;
    }


    public void addPoints(Long points) {
        score += points;
    }

    public void surrender() {
        isSurrender = true;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Player player = (Player) obj;

        return userProfile.equals(player.userProfile);
    }

    @Override
    public int hashCode() {
        return userProfile.hashCode();
    }
}

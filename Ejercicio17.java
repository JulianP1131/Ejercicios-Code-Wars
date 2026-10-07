
import java.util.Arrays;
import java.util.List;

class User {

    private static final List<Integer> RANKS = Arrays.asList(-8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8);
    private static final int MAX_RANK_INDEX = RANKS.size() - 1;

    public int rank = -8;
    public int progress = 0;

    public void incProgress(int activityRank) {
        int userRankIndex = RANKS.indexOf(this.rank);
        int activityRankIndex = RANKS.indexOf(activityRank);

        if (activityRankIndex == -1) {
            throw new IllegalArgumentException("Invalid activity rank: " + activityRank);
        }

        // Maximum rank reached; no further progression can be made
        if (userRankIndex == MAX_RANK_INDEX) {
            return;
        }

        int diff = activityRankIndex - userRankIndex;
        int earnedProgress = 0;

        if (diff == 0) {
            earnedProgress = 3;
        } else if (diff == -1) {
            earnedProgress = 1;
        } else if (diff > 0) {
            earnedProgress = 10 * diff * diff;
        }

        this.progress += earnedProgress;

        while (this.progress >= 100 && userRankIndex < MAX_RANK_INDEX) {
            this.progress -= 100;
            userRankIndex++;
            this.rank = RANKS.get(userRankIndex);
        }

        if (userRankIndex == MAX_RANK_INDEX) {
            this.progress = 0;
        }
    }
}

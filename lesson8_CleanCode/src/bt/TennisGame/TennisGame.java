package bt.TennisGame;

/**
 * [Bài tập] Refactoring - Tennis Game Kata
 *
 * Mục tiêu:
 * - Áp dụng các kỹ thuật refactoring:
 *   + Đổi tên biến
 *   + Tách biến
 *   + Tách hằng
 *   + Tách phương thức
 * - Loại bỏ các smell code:
 *   + Tên biến không rõ nghĩa
 *   + Magic value
 *   + Hàm dài, điều kiện khó hiểu

 */

public class TennisGame {
    private int player1Score = 0;
    private int player2Score = 0;
    private final String player1Name;
    private final String player2Name;

    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";
    private static final String DEUCE = "Deuce";

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name)) {
            player1Score++;
        } else {
            player2Score++;
        }
    }

    public String getScore() {
        if (player1Score == player2Score) {
            return getEqualScore(player1Score);
        }

        if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageOrWinScore();
        }

        return getRunningScore();
    }

    private String getEqualScore(int score) {
        switch (score) {
            case 0:
                return LOVE + "-All";
            case 1:
                return FIFTEEN + "-All";
            case 2:
                return THIRTY + "-All";
            case 3:
                return FORTY + "-All";
            default:
                return DEUCE;
        }
    }

    private String getAdvantageOrWinScore() {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) return "Advantage " + player1Name;
        if (scoreDifference == -1) return "Advantage " + player2Name;
        if (scoreDifference >= 2) return "Win for " + player1Name;
        return "Win for " + player2Name;
    }

    private String getRunningScore() {
        return getScoreText(player1Score) + "-" + getScoreText(player2Score);
    }

    private String getScoreText(int score) {
        switch (score) {
            case 0:
                return LOVE;
            case 1:
                return FIFTEEN;
            case 2:
                return THIRTY;
            case 3:
                return FORTY;
            default:
                return "";
        }
    }
}

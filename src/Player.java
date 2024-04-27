import java.util.Random;

public interface Player {

    int[] player_position = null;
    public static int[] generateRandomPlayerPosition(int[] player_position);
    public void updatePlayerPosition(int[] player_position, int[][] room, String player_char);
}

class Player1 {
    public final String PLAYER_CHAR = ConsoleColors.BLUE_BOLD + "@" + ConsoleColors.RESET;
    public static int[] player_position = {0, 0};

    public int[] generateRandomPlayerPosition(int[] player_position) {
        Random random = new Random();

        player_position[0] = random.nextInt(Level.DUNGEON_WIDTH -2) + 1;
        player_position[1] = random.nextInt(Level.DUNGEON_HEIGHT -2) + 1;

        return player_position;
    }

    public void updatePlayerPosition(int[] player_position, int[][] room, String player_char) {
        Level.dungeon[ player_position[0] ][ player_position[1] ] = player_char;
    }
}

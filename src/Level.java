public class Level {

    public static final int DUNGEON_HEIGHT = 20;
    public static final int DUNGEON_WIDTH = 60;

    static public String[][] dungeon = new String[DUNGEON_HEIGHT][DUNGEON_WIDTH];

    private final String WALL_CHAR = ConsoleColors.WHITE_BACKGROUND + " " + ConsoleColors.RESET;

    public String[][] generateRoom(String[][] room) {
        for(int i = 0; i < DUNGEON_WIDTH; i++) {
            room[0][i] = WALL_CHAR;
        }

        for(int row = 1; row < DUNGEON_HEIGHT; row++) {
            room[row][0] = WALL_CHAR;
            for(int column = 1; column < DUNGEON_WIDTH; column++) {
                room[row][column] = " ";
            }
            room[row][DUNGEON_WIDTH-1] = WALL_CHAR;
        }

        for(int i = 0; i < DUNGEON_WIDTH; i++) {
            room[DUNGEON_HEIGHT-1][i] = WALL_CHAR;
        }
        return room;
    }

    public Level() {
        dungeon = generateRoom(dungeon);
    }

}

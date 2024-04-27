public class Room {

    static public String[][] room = new String[20][60];

    private final int ROOM_HEIGHT = room.length;
    private final int ROOM_WIDTH = room[1].length;
    private final String WALL_CHAR = ConsoleColors.WHITE_BACKGROUND + " " + ConsoleColors.RESET;

    public String[][] generateRoom(String[][] room) {
        for(int i = 0; i < ROOM_WIDTH; i++) {
            room[0][i] = WALL_CHAR;
        }

        for(int row = 1; row < ROOM_HEIGHT; row++) {
            room[row][0] = WALL_CHAR;
            for(int column = 1; column < ROOM_WIDTH; column++) {
                room[row][column] = " ";
            }
            room[row][ROOM_WIDTH-1] = WALL_CHAR;
        }

        for(int i = 0; i < ROOM_WIDTH; i++) {
            room[ROOM_HEIGHT-1][i] = WALL_CHAR;
        }
        return room;
    }

    public Room() {
        room = generateRoom(room);
    }

}

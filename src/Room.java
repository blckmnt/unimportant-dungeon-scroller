public class Room {

    static public char[][] room = new char[20][60];

    private final int ROOM_HEIGHT = room.length;
    private final int ROOM_WIDTH = room[1].length;

    public char[][] generateRoom(char[][] room) {
        for(int i = 0; i < ROOM_WIDTH; i++) {
            room[0][i] = '#';
        }

        for(int row = 1; row < ROOM_HEIGHT; row++) {
            room[row][0] = '#';
            for(int column = 1; column < ROOM_WIDTH; column++) {
                room[row][column] = ' ';
            }
            room[row][ROOM_WIDTH-1] = '#';
        }

        for(int i = 0; i < ROOM_WIDTH; i++) {
            room[ROOM_HEIGHT-1][i] = '#';
        }
        return room;
    }

    public Room() {
        room = generateRoom(room);
    }

}

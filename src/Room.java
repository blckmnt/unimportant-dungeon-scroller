public class Room {

    static public char[][] room = new char[20][60];

    private final int ROOM_HEIGHT = room.length;
    private final int ROOM_WIDTH = room[1].length;

    public char[][] generateRoom(char[][] room) {
        for(int row = 0; row < ROOM_HEIGHT; row++) {
            for(int column = 0; column < ROOM_WIDTH; column++) {
                room[row][column] = '#';
            }
        }
        return room;
    }

    public Room() {
        room = generateRoom(room);
    }

}

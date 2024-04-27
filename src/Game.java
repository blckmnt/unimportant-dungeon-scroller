public class Game extends Room {

    char[][] room;

    public static void printRoom(char[][] room) {
        for (char[] row : room) {
            for (int column : row) {
                System.out.print((char)column);
            }
            System.out.println();
        }
    }

    public Game() {
        this.room = Room.room;
        printRoom(room);
    }
}

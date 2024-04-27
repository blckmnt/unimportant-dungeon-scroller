public class Game extends Room {

    String[][] room;

    public static void printRoom(String[][] room) {
        for (String[] row : room) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public Game() {
        this.room = Room.room;
        printRoom(room);
    }
}

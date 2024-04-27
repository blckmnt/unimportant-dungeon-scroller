public class Game {

    String[][] room;
    int[] player_position = Player.player_position;

    public static void printRoom(String[][] room) {
        for (String[] row : room) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }



    public static void gameInit(String[][] room, int[] player_position) {
        Player.generateRandomPlayerPosition(player_position);
    }

    public Game() {
        this.room = Level.dungeon;
        printRoom(room);
    }
}

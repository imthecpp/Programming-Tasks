/*
Random Word Generator v1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Random Word Sentence");
        System.out.println("");
        Game game = new Game(new Sentence());
        game.initGame();
        game.startGame();
    }
}

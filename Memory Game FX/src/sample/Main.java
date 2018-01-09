package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.gameview.Game;
import sample.gameview.RandomImage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Game game = new Game(new RandomImage());
        game.initGame();
        AnchorPane anchorPane = new AnchorPane();
//        Button btn = new Button("ok");
//        anchorPane.getChildren().add(btn);
        anchorPane.getChildren().addAll(game.getCards());
        primaryStage.setTitle("Memory Game");

        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(anchorPane, game.getWindowWidth()  , game.getWindowHeight()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

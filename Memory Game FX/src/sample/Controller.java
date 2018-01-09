package sample;

import javafx.animation.FadeTransition;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Controller {

    @FXML
    private ImageView cardone;
    @FXML
    private ImageView cardtwo;

    ArrayList<ImageView> back = new ArrayList<>();
    ArrayList<ImageView> front = new ArrayList<>();
    Image imageFront, imageback;


    public void startGame(){
        imageFront = new Image(getClass().getResource("Y.png").toExternalForm());
        imageback = new Image(getClass().getResource("back.png").toExternalForm());


        back.add(new ImageView(imageback));

        front.add(cardone);
        front.add(cardtwo);

//        front.get(0).setImage(imageFront);
//        front.get(1).setImage(imageFront);


        Click click = new Click();
        for(ImageView imageView : front){
            imageView.setImage(imageback);
            imageView.setOnMouseClicked(click);
            //imageView.setOnMouseClicked(event -> click.flip(front));
        }


//        Click click = new Click();
//        cardone.setOnMouseClicked(click);
//        cardtwo.setOnMouseClicked(click);

//        cardone.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                System.out.println("klik");
//
//
//            }
//        });

    }




}

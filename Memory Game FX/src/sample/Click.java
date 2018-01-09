package sample;


import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;


public class Click implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent e) {
//        System.out.println("Hello World");
//        String source = e.getSource().toString();

//
        Image imageFront = new Image(getClass().getResource("Y.png").toExternalForm());
        ImageView img = (ImageView)e.getSource();

        img.setImage(imageFront);
        System.out.println(img.getId());

            //System.out.println(((ImageView) e.getSource()).getId());

    }

    public void flip(ArrayList<ImageView> front){


    }


}

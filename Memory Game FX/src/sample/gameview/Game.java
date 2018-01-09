package sample.gameview;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game{

    private final int NUM_OF_CARDS = 12;
    //ArrayList<ImageView> cards = new ArrayList<>();
    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Image> randomImages = new ArrayList<>();
    private RandomImage randomImage;
    private double windowHeight = 0;
    private double windowWidth = 0;


    public Game(RandomImage randomImage){
        this.randomImage = randomImage;
    }

    public void initGame(){

        //load all images
        randomImage.loadImages();
        //choose randomly
        Random r = new Random(System.currentTimeMillis());
        int rn;
        for (int i = 0; i < NUM_OF_CARDS / 2; i++){
            rn = r.nextInt(randomImage.getImages().size());
            randomImages.add(randomImage.getImages().get(rn));
            randomImages.add(randomImage.getImages().get(rn));
        }

        //przetasuj
        Collections.shuffle(randomImages);

        Click click = new Click();

        for(int i = 0; i < NUM_OF_CARDS ; i++){
            //add card
            cards.add(new Card());
            //set position
            cards.get(i).setX(75 * (i % 4));
            cards.get(i).setY(107 * (i / 4));
            //add image
            cards.get(i).setFront(randomImages.get(i));
            cards.get(i).setOnMouseClicked(click);
            //set window size
            windowWidth = (cards.get(i).getX() + 75);
            windowHeight = (cards.get(i).getX() + 102);
        }

        for (Card card : cards){
            card.setImage(card.flipDown());
        }

//        if(cards.get(0).getImage().equals(cards.get(0).getImage())){
//            System.out.println("są takie same");
//        }else {
//            System.out.println("są inne :/");
//        }

//        for (int i = 0; i < cards.size(); i++){
//            cards.get(i).setImage();
//        }


    }

//    public ArrayList<ImageView> getCards() {
//        return cards;
//    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public double getWindowHeight() {
        return windowHeight;
    }

    public double getWindowWidth() {
        return windowWidth;
    }



}

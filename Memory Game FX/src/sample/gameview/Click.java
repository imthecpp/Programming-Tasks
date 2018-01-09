package sample.gameview;



import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.util.concurrent.TimeUnit;


public class Click implements EventHandler<MouseEvent> {
    private Card firstChoice;
    private Card secondChoice;
    private int numFlipped = 0;
    private int attempts = 0;
    @Override
    public void handle(MouseEvent e) {


//        if (firstChoice == null){
//            this.firstChoice = (Card)e.getSource();
//            firstChoice.setImage(firstChoice.flipUp());
//            System.out.println("klik 1");
//        }else if(secondChoice == null ){
//            this.secondChoice = (Card)e.getSource();
//            secondChoice.setImage(secondChoice.flipUp());
//            System.out.println("klik 2");
//        }


//        if(firstChoice.getImage().equals(secondChoice.getImage())){
//            System.out.println("same");
//        }else {
//            System.out.println("inne");
//        }
        //pokazać 2 karty, wstrzymać karty(wait), sprawdzić czy są takie same, podjąć akcje
        firstChoice = (Card) e.getSource();
        if (numFlipped < 2 && !firstChoice.isFaceUp()) {
            //if(! firstChoice.isFaceUp()){
            if (secondChoice == null) {
                secondChoice = firstChoice;
            }
            //System.out.println(numFlipped);

            firstChoice.setImage(firstChoice.flipUp());

            numFlipped++;
            //System.out.println(numFlipped);
            if (numFlipped == 2) {

                if (firstChoice.getImage().equals(secondChoice.getImage())) {
                    System.out.println("same");
                    firstChoice.setVisible(false);
                    secondChoice.setVisible(false);
                } else {
                    System.out.println("inne");
                    //firstChoice.setVisible(false);
                    firstChoice.setImage(firstChoice.flipDown());
                    secondChoice.setImage(secondChoice.flipDown());
//
                }
                secondChoice = null;
                numFlipped = 0;
            }
            //firstChoice.setImage( firstChoice.flipUp());

            //System.out.println("klik");

            //System.out.println(numFlipped);
        }//koniec if

    }
}

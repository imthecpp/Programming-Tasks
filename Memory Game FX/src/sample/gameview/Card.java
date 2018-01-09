package sample.gameview;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card extends ImageView {

    private Image front;
    private Image back;
    private boolean isFaceUp;

    //ImageView view;

//    public Card(Image front, Image back){
//        this.front = front;
//        this.back = back;
//    }

    public void setFront(Image front){
        this.front = front;
    }

    public Image flipUp(){
        this.isFaceUp = true;
        return front;
    }

    public Image flipDown(){
       // return back = new Image(getClass().getResource("src/sample/img/back.png").toExternalForm());
        this.isFaceUp = false;
        return back = new Image("sample/img/back.png");
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }
}

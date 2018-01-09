package sample.gameview;


import javafx.scene.image.Image;

import java.util.ArrayList;

public class RandomImage {


    ArrayList<Image> images = new ArrayList<>();
    public void loadImages(){
        //images.add(new Image(getClass().getResource("src/sample/img/Y.png").toExternalForm()));
        images.add(new Image("sample/img/a.png"));
        images.add(new Image("sample/img/b.png"));
        images.add(new Image("sample/img/c.png"));
        images.add(new Image("sample/img/o.png"));
        images.add(new Image("sample/img/v.png"));
        images.add(new Image("sample/img/x.png"));
        images.add(new Image("sample/img/y.png"));
        images.add(new Image("sample/img/z.png"));


    }

    public ArrayList<Image> getImages() {
        return images;
    }
}

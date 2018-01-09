package sample.handler;

import java.util.ArrayList;
import java.util.Random;

public class WordHandler {

   private RandomWordHandler randomWordHandler = new RandomWordHandler();

   public int getWordLength(){
       return randomWordHandler.randomWord().length();
   }
}

package sample.handler;

import java.util.ArrayList;
import java.util.Random;

public class RandomWordHandler {

    ArrayList<String> hangmanWords;

    public void wordBank(){

            hangmanWords.add("dawid");
            hangmanWords.add("hangman");
            hangmanWords.add("programista");


    }

    public String randomWord(){
        hangmanWords = new ArrayList<>();
        hangmanWords.add("dawid");
        hangmanWords.add("hangman");
        hangmanWords.add("programista");
        Random r = new Random();
        int randomNumber = r.nextInt(hangmanWords.size());
        System.out.println(hangmanWords.size());

        return hangmanWords.get(randomNumber);
    }
}

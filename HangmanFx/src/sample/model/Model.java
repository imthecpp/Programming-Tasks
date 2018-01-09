package sample.model;


import java.util.ArrayList;
import java.util.Random;


public class Model {

    private ArrayList<String> hangmanWords = new ArrayList<>();
    private String userGuess, wordToGuess, coveredWord, message;
    private StringBuilder stringBuilder;
    private StringBuilder listOfGuesses = new StringBuilder();
    private int attempts = 0;
    String oldCoveredWord;

    public void wordBank() {

        hangmanWords.add("dawid");
        hangmanWords.add("hangman");
        hangmanWords.add("programista");
        hangmanWords.add("konstantynopolitanczykowianeczka");

    }

    public void randomWord() {
        Random r = new Random();
        int randomNumber = r.nextInt(hangmanWords.size());
        //System.out.println(hangmanWords.size());
        wordToGuess = hangmanWords.get(randomNumber);
    }

    public void coveredWord() {
        stringBuilder = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            coveredWord = stringBuilder.append("-").toString();
        }

        //coveredWord = new String(new char[wordToGuess.length()]).replace("\0", "_");

    }

    public void compareToUser() { //userGuess = jedna litera
        oldCoveredWord = "";
        oldCoveredWord = coveredWord;
        for (int i = 0; i < wordToGuess.length(); i++) {
            //System.out.println(wordToGuess.charAt(i));
            if (wordToGuess.charAt(i) == userGuess.charAt(0)) {
                coveredWord = stringBuilder.replace(i, i + 1, Character.toString(userGuess.charAt(0))).toString();
                //System.out.println(coveredWord);
            }
        }
        // System.out.println("wtg "+wordToGuess.length() + "covered" +coveredWord.length() + "buil:" + stringBuilder.length());
    }

    public boolean isOver(){
        if(coveredWord.equals(oldCoveredWord)){
            ++attempts;
            System.out.println(attempts);
                    if(attempts >= 3){
                        System.out.println(attempts);
                        return true;
                        //System.out.println("takie samo"); //oznacza podanie błędnej litery
                    }
        }else {
            //System.out.println("inne");   //oznacza podanie dobrej litery
            //return false;
        }
        if(coveredWord.equals(wordToGuess)){
            System.out.println("zgadza się");
            return true;
        }

        return false;
    }

//    public void compareToUser(char userGuess){
//        int index;
//        if(wordToGuess.contains(Character.toString(userGuess)));
//        {
//            index = wordToGuess.indexOf(Character.toString(userGuess));
//            coveredWord = stringBuilder.replace(index, index + 1, Character.toString(userGuess)).toString();
//        }
//    }

//    public boolean isOver() {
//        if (coveredWord.equals(wordToGuess)) {
//            return true; //koniec gry
////        } else if (!coveredWord.contains(userGuess)) {
//////            attempts++;
//////            if(attempts >= 3){
//////                return true;
//////            }else {
//////                return false;
//////            }
//        } else {
//            return false;
//        }
//    }
    public void check(){
        if(coveredWord.contains(userGuess)){
            wordToGuess.contains(userGuess); //sprawdź czy słowo zawiera literę użytkownika
            wordToGuess.indexOf(userGuess); // jeśli zawiera to daj index litery i
            //zastąp tą literę w zasłoniętym słowie

        }
    }
    public ArrayList<String> getHangmanWords() {
        return hangmanWords;
    }

    public void setUserGuess(String userGuess){
        this.userGuess = userGuess;
    }

    public String getCoveredWord() {
        return coveredWord;
    }

    public void setAttempts(){
         this.attempts = 0;
    }

    public int getAttempts() {
        return attempts;
    }
}

/**
 * Created by Dawid Kowalski on 11.11.2017.
 */
public class World {
    private char[] alphabet;

    public void planeText(){
        String sample = "sampletekst";

        for (int i = 0; i <= sample.length() - 1; i++){
            System.out.print("_"+" ");
        }
        System.out.println();
    }

    public char[] getAlphabet(){

        return alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    }




}

import java.util.Scanner;

/**
 * Created by Dawid Kowalski on 10.11.2017.
 */
public class Game {

    public void runGame(){
        String sample = "sampletekst";
        World world = new World();
        world.planeText();

        for(char c : world.getAlphabet()){
            System.out.print(c+" ");
        }


        Scanner in = new Scanner(System.in);
        char[] userWord = in.next().toCharArray();
        char[] sampleChar = sample.toCharArray();

        for(char c : userWord){
            if(c == sampleChar[0]){
                System.out.println("where here!");
            }
        }



    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userNumber = 0;


        int randomGuess = (int)(Math.random() * 30 + 1);

        do{
            System.out.print("Give me your numer: ");
            try{
                userNumber = in.nextInt();
            }catch (InputMismatchException e){
                System.out.println("You gave a string!");
                System.out.print("Try again!");
                break;
            }

            if(userNumber > randomGuess){
                System.out.println("to high!");
            }else if(userNumber < randomGuess){
                System.out.println("to low!");
            }else{
                System.out.println("Congrats!, your number equal "+ randomGuess);
            }
        }while (userNumber != randomGuess);

    }
}

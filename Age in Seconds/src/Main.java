import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("How many years I have to calculate? ");
        int years = 0;

        years = in.nextInt();
        Converter converter = new Converter();
        converter.toSeconds(years);

    }
}

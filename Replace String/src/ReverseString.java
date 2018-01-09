import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Two ways of reversing string!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put word to reverse: ");
        String word = scanner.next();
        //kemada

        for(int i = word.length() - 1; i >= 0; i--){
            try {
                System.out.print(word.charAt(i));
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }

        System.out.println("");
        //String w = "woda";
        char temp;
        char []chword = word.toCharArray();
        int len = chword.length - 1;

        for(int i = 0; i <= len / 2 ; i++, len--){
            temp = chword[len];
            chword[len] = chword[i];
            chword[i] = temp;
        }

        System.out.println(chword);


    }
}

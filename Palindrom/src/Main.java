import java.util.Scanner;
/*
Check if the given word is palindrom
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Two ways of checking palindom!");

        //inni
        //ono zaraz kajak
        System.out.println("Put the word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        //first way
        char[] chword = word.toCharArray();
        String rev = "";
        for(int i = word.length() - 1; i >= 0; i-- ){
            try {
                rev += word.charAt(i);
            }catch (NullPointerException e){
                e.printStackTrace();
            }
        }


        //System.out.println(rev);
        if(word.equals(rev)){
            System.out.println("wyraz jest palindromem");
        }else {
            System.out.println("wyraz nie jest palindromem");
        }

        //second way
        int len = chword.length - 1;
        boolean isPali = true;
        for(int i = 0; i <= len / 2; i++, len--){
            if(chword[i] != chword[len]){
                //okke
                //oero
                isPali = false;
            }
        }
        if(isPali){
            System.out.println("Word is a palindrom");
        }else {
            System.out.println("Word isn't a palindrom");
        }
    }
}

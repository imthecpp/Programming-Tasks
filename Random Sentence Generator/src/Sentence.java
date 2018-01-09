
import java.util.ArrayList;

public class Sentence {

    private ArrayList<String> wordPack_1 = new ArrayList<>();
    private ArrayList<String> wordPack_2 = new ArrayList<>();
    private ArrayList<String> wordPack_3 = new ArrayList<>();

    public ArrayList<String> getWordPack_1() {
        return wordPack_1;
    }

    public void setWordPack_1(String word) {
        this.wordPack_1.add(word);
    }

    public ArrayList<String> getWordPack_2() {
        return wordPack_2;
    }

    public void setWordPack_2(String word) {
        this.wordPack_2.add(word);
    }

    public ArrayList<String> getWordPack_3() {
        return wordPack_3;
    }

    public void setWordPack_3(String word) {
        this.wordPack_3.add(word);
    }
}

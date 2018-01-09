import java.util.Random;

public class Game {

    private Sentence sentence;

    public Game(Sentence sentence){
        this.sentence = sentence;
    }

    public void initGame(){
        sentence.setWordPack_1("rezydenci");
        sentence.setWordPack_1("niemcy");
        sentence.setWordPack_1("przyjaciele i macki sorosa");
        sentence.setWordPack_1("przypadkowi spacerowicze");
        sentence.setWordPack_1("lewaccy genderowcy");

        sentence.setWordPack_2("kpią i obrażają");
        sentence.setWordPack_2("chcą sprzedać");
        sentence.setWordPack_2("radzą jak obalić");
        sentence.setWordPack_2("atakują");
        sentence.setWordPack_2("obrażają");

        sentence.setWordPack_3("suwerena");
        sentence.setWordPack_3("najswietsza panienke");
        sentence.setWordPack_3("kornika");
        sentence.setWordPack_3("kota prezesa");
        sentence.setWordPack_3("bohaterow dobrej zmiany");
    }

    public void startGame(){
        Random r = new Random(System.currentTimeMillis());
        try {
        int sentence_1 = r.nextInt(sentence.getWordPack_1().size());
        int sentence_2 = r.nextInt(sentence.getWordPack_2().size());
        int sentence_3 = r.nextInt(sentence.getWordPack_3().size());

        System.out.println(sentence.getWordPack_1().get(sentence_1) + " " + sentence.getWordPack_2().get(sentence_2) +
                    " " + sentence.getWordPack_3().get(sentence_3));
        }catch (IllegalArgumentException e){
           // e.printStackTrace();
            System.out.println("You have to init the game dude!");
        }

    }


}

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        Name name = new Name();
        int random;
        name.addName("Dawid");
        name.addName("Janusz");
        name.addName("Dariusz");
        name.addName("Mariusz");

        try {
            random = (int )(Math.random() * name.getSize());
            if(name != null){
                System.out.print("Generated name: " + name.getNamesCollection(random));
            }
            else {
                System.out.print("There's no names ;(!");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("index out of bounds!");
        }
    }
}

import java.util.ArrayList;

/**
 * Created by Dawid Kowalski on 09.11.2017.
 */
public class Name {

    private ArrayList<String> namesCollection = new ArrayList<String>();

    public void addName(String name){
        namesCollection.add(name);

    }

    public void removeName(String name){
        namesCollection.remove(name);
    }

    public String getNamesCollection(int index) {
        return namesCollection.get(index);
    }

    public int getSize(){
        return namesCollection.size();
    }

    public void setNamesCollection(ArrayList<String> namesCollection) {
        this.namesCollection = namesCollection;
    }
}

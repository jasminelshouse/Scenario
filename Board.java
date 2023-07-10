import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Board extends Observable {
    public List<String> info = new ArrayList<String>();

    public List<String> getAll(){
        return this.info;
    }
    public String getLast(){
        int size = this.info.size();
        return this.info.get(size);
    }
    public void add(String str){
        this.info.add(str);
        setChanged();
        notifyObservers();
    }
}

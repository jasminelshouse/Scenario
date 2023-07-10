import java.util.List;
import java.util.Observable;
import java.util.Observer;

class Student implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("inside update");
        Board b = (Board)o;
        List<String> list = b.getAll();
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

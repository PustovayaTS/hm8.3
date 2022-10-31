import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private Set<String> setList = new HashSet<>();

    public void addList(String str){
        setList.add(str);
    }

    public int getSize(){return setList.size();}

    @Override
    public String toString() {
        return "Реши примеры:" + setList;
    }
}

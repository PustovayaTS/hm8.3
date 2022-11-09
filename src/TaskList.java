import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TaskList {
    private final Set<Task> setList = new HashSet<>();

    public TaskList() {
        Random random = new Random();
        while (setList.size() < 15) {
            setList.add(new Task(random.nextInt((9-2) + 1) + 2,
                    random.nextInt((9-2) + 1) + 2));
        }
    }

    @Override
    public String toString() {
        String str = new String();
        for (Task task : setList) {
            str = str + task.toString();
        }
        return str;
    }
}

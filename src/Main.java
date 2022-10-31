import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> taskList = new ArrayList<>();
        int j = 2;
        for (int i = 2; i <= 9; i++) {
            while (j <= 9){
                taskList.add(i + "*" + j);
                j++;
            }
            j = i+1;
        }
        System.out.println(taskList);
        TaskList taskList1 = new TaskList();
        Random r = new Random();
        int x = r.nextInt(taskList.size());
        while (taskList1.getSize()<15){
            taskList1.addList(taskList.get(x));
            x = r.nextInt(taskList.size());
        }
        System.out.println(taskList1);
    }
}
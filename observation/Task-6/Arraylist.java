import java.util.ArrayList;
import java.util.Comparator;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15);

        System.out.println(list.get(2));

        list.set(2, 25);

        list.remove(2);
        list.remove(Integer.valueOf(30));

        System.out.println(list.contains(20));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

        System.out.println(list.indexOf(20));

        list.add(20);
        System.out.println(list.lastIndexOf(20));

        list.sort(Comparator.naturalOrder());

        System.out.println(list);

        list.clear();

        System.out.println(list);
    }
}
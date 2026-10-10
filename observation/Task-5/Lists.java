import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        list.add(1, 50);

        System.out.println(list.get(1));

        list.set(1, 60);

        list.remove(2);

        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));

        System.out.println(list.subList(1, 3));

        list.sort(Comparator.naturalOrder());

        System.out.println(list);
    }
}
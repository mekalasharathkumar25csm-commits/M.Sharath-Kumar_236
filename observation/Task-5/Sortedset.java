
    import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset{
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println(set.headSet(30));
        System.out.println(set.tailSet(30));
        System.out.println(set.subSet(20, 40));

        System.out.println(set.comparator());
    }
}


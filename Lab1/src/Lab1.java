import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        LinkedList<String> people = new LinkedList<>();
        people.add("Kay");
        people.add("Jay");
        people.add("May");
        people.add("Fay");

        ListIterator<String> it = people.listIterator();
        it.next();
        it.next();
        it.next();
        it.add("Ray");
        it.previous();
        it.previous();
        it.previous();
        it.remove();

        ListIterator<String> iterator = people.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name + "...");
        }

        it.add("Kay");

        ListIterator<String> iterator2 = people.listIterator();
        while (iterator2.hasNext()) {
            String name = iterator2.next();
            System.out.println(name + "...");
        }

        Set<String> names = new HashSet<>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");
        names.add("Ray");

        Iterator<String> iterator3 = names.iterator();
        while (iterator3.hasNext()) {
            String name = iterator3.next();
            System.out.println(name + "...");
        }

        Set<String> names2 = new TreeSet<>();
        names2.add("ray");
        names2.add("Jay");
        names2.add("May");
        names2.add("Fay");
        names2.add("kay");

        Iterator<String> iterator4 = names2.iterator();
        while (iterator4.hasNext()) {
            String name = iterator4.next();
            System.out.println( "   " + name + "...");
        }



    }
}

package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listcollections{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vrushti");
        names.add("Ashi");
        names.add("Bansi");
        names.add("Sita");
        
        // Traverse the list
        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            String nm = i.next();
            System.out.println(nm);

            if (nm.equals("Ashi"))
                i.remove();
        }

        System.out.println("Name List is: " + names);

        // Traverse in reverse / Backward order
        ListIterator<String> li = names.listIterator(names.size());

        while (li.hasPrevious()) {
            String nm = li.previous();
            System.out.println(nm);
        }
    }
}

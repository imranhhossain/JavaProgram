import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class p_37_Collections {
    public static void main(String[] args) {

        //ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        for (int i = 0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        System.out.println("**********");
        //LinkedList
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(11);
        l2.add(22);
        l2.addFirst(108);
        l2.addLast(65);
        l2.add(33);
        l2.add(44);
        l2.add(55);


        for (int i = 0; i<l2.size();i++){
            System.out.println(l2.get(i));
        }
        System.out.println(l2.get(l2.size()-1));

        System.out.println("***********");
        //ArrayDeque
        ArrayDeque<Integer> l3 = new ArrayDeque<>();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);
        l3.addFirst(55);

        System.out.println(l3.getFirst());
        System.out.println(l3.getLast());
        System.out.println(l3);

        System.out.println("********");
        //HashSet

        HashSet<Integer> myHashSet = new HashSet<>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        System.out.println(myHashSet);

    }
}

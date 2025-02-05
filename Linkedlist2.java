import java.util.*;
public class Linkedlist2 {
public static void main(String[] args) {
    LinkedList<Integer> l = new LinkedList<Integer>();
    for(int i = 0;i<5;i++){
        l.add(i);
    }
    System.out.println(l);
    // Integer[] a = l.toArray(new Integer[0]);
    // for(Integer element : a)
    // System.out.print(element+" ");
    l.removeLast();
    System.out.println(l);
}
}
